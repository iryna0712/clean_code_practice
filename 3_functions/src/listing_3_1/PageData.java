package listing_3_1;

//stub
public class PageData {

    private static final String TEST_ATTRIBUTE = "Test";

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public WikiPage getWikiPage() {
        return new WikiPage();
    }

    public boolean hasAttribute(String check) {
        return true;
    }

    public boolean isTestable() {
        return this.hasAttribute(TEST_ATTRIBUTE);
    }

    public String getHtml() {
        return "";
    }
}
