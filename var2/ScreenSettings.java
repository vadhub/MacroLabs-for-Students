
public class ScreenSettings {
    private int size;
    private float dpi;
    private Setting[] settings;
    private String theme;
    private boolean notificationsEnabled;
    private String language;

    public ScreenSettings(int size, float dpi, Setting[] settings, String theme, 
                         boolean notificationsEnabled, String language) {
        this.size = size;
        this.dpi = dpi;
        this.settings = settings;
        this.theme = theme;
        this.notificationsEnabled = notificationsEnabled;
        this.language = language;
    }

    public static class Builder {
        private int size;
        private float dpi;
        private Setting[] settings;
        private String theme;
        private boolean notificationsEnabled;
        private String language;

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setDpi(float dpi) {
            this.dpi = dpi;
            return this;
        }

        public Builder setSettings(Setting[] settings) {
            this.settings = settings;
            return this;
        }

        public Builder setTheme(String theme) {
            this.theme = theme;
            return this;
        }

        public Builder setNotificationsEnabled(boolean notificationsEnabled) {
            this.notificationsEnabled = notificationsEnabled;
            return this;
        }

        public Builder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public ScreenSettings build() {
            return new ScreenSettings(size, dpi, settings, theme, notificationsEnabled, language);
        }
    }

    public View onCreateView() {
        System.out.println("ScreenSettings.onCreateView() called");
        return new View();
    }

    public void onViewCreated(View v) {
        System.out.println("ScreenSettings.onViewCreated() called");
        if (v != null) {
            v.onDraw();
            System.out.println("Setting up settings view");
        }
    }

    public void onCreateOptionsMenu() {
        System.out.println("ScreenSettings.onCreateOptionsMenu() called");
        System.out.println("Theme: " + theme + ", Language: " + language);
    }

    public void changeTheme(String newTheme) {
        this.theme = newTheme;
        System.out.println("Theme changed to: " + newTheme);
    }

    public void toggleNotifications() {
        notificationsEnabled = !notificationsEnabled;
        System.out.println("Notifications: " + (notificationsEnabled ? "ENABLED" : "DISABLED"));
    }

    public void showAllSettings() {
        System.out.println("\n=== Settings ===");
        System.out.println("Theme: " + theme);
        System.out.println("Language: " + language);
        System.out.println("Notifications: " + notificationsEnabled);
        if (settings != null) {
            for (Setting setting : settings) {
                System.out.println(setting);
                setting.onDraw();
            }
        }
    }

    public void onDestroy() {
        settings = null;
        System.out.println("ScreenSettings destroyed");
    }

    public void resetToDefaults() {
        theme = "Light";
        notificationsEnabled = true;
        language = "English";
        System.out.println("Settings reset to defaults");
    }
}
