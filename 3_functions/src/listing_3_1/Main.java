package listing_3_1;

public class Main {

    public static void main(String[] args) {}

    public static String renderPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite) throws Exception {
        if (pageData.isTestable()) {
            PageDataUtil.updatePageWithSetupsAndTeardowns(pageData, isSuite);
        }
        return pageData.getHtml();
    }
}
