class Setting {
    private String name;
    private String value;
    private String type;

    public Setting(String name, String value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public void onDraw() {
        System.out.println("Drawing setting: " + name + " = " + value);
    }

    @Override
    public String toString() {
        return "Setting{name='" + name + "', value='" + value + "', type='" + type + "'}";
    }
}