package listing_3_1;

import java.util.HashMap;
import java.util.Map;

public class Constants {

    public static final String SETUP_NAME = "SetUp";
    public static final String TEARDOWN_NAME = "TearDown";

    public static final String INCLUDE_SETUP = "!include -setup .";
    public static final String INCLUDE_TEARDOWN = "!include -teardown .";

    public static final Map<String, String> pageTypeToText = new HashMap<>();

    static {
        pageTypeToText.put(SuiteResponder.SUITE_SETUP_NAME, INCLUDE_SETUP);
        pageTypeToText.put(SETUP_NAME, INCLUDE_SETUP);
        pageTypeToText.put(SuiteResponder.SUITE_TEARDOWN_NAME, INCLUDE_TEARDOWN);
        pageTypeToText.put(TEARDOWN_NAME, INCLUDE_TEARDOWN);
    }

}
