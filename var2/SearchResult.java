class SearchResult {
    private String title;
    private String description;
    private String url;

    public SearchResult(String title, String description, String url) {
        this.title = title;
        this.description = description;
        this.url = url;
    }

    public void onDraw() {
        System.out.println("Drawing search result: " + title);
    }

    @Override
    public String toString() {
        return "SearchResult{title='" + title + "', description='" + description + "'}";
    }
}