package listing_3_1;


public final class PageDataUtil {

    private PageDataUtil() {}

    public static void updatePageWithSetupsAndTeardowns(PageData pageData, boolean isSuite) {
        StringBuffer newPageContent = new StringBuffer(pageData.getContent().length());

        addSetupPages(newPageContent, pageData, isSuite);
        newPageContent.append(pageData.getContent());
        addTeardownPages(newPageContent, pageData, isSuite);

        pageData.setContent(newPageContent.toString());
    }

    private static void addSetupPages(StringBuffer newPageContent, PageData pageData, boolean isSuite) {
        if (isSuite) {
            extractAndAppendPathNameByType(newPageContent, pageData, SuiteResponder.SUITE_SETUP_NAME);
        }
        extractAndAppendPathNameByType(newPageContent, pageData, Constants.SETUP_NAME);
    }

    private static void addTeardownPages(StringBuffer newPageContent, PageData pageData, boolean isSuite) {
        extractAndAppendPathNameByType(newPageContent, pageData, Constants.TEARDOWN_NAME);
        if (isSuite) {
            extractAndAppendPathNameByType(newPageContent, pageData, SuiteResponder.SUITE_TEARDOWN_NAME);
        }
    }

    private static void extractAndAppendPathNameByType(StringBuffer buffer, PageData pageData, String type) {
        WikiPage wikiPage = pageData.getWikiPage();

        if (Constants.pageTypeToText.containsKey(type)) {
            WikiPage inheritedPage = PageCrawlerImpl.getInheritedPage(type, wikiPage);

            if (inheritedPage != null) {
                WikiPagePath pagePath = inheritedPage.getPageCrawler().getFullPath(inheritedPage);
                String pagePathName = PathParser.render(pagePath);

                String text = Constants.pageTypeToText.get(type);
                buffer.append(text)
                        .append(pagePathName)
                        .append("\n");
            }
        } else {
            //log error
        }
    }
}
