package pagesUI.uiTest.baseUrl;

public class baseUrlPage {
  private static final String DEMOQA_BASE_URL = "https://demoqa.com";

  private static String demoqaBaseUrl = DEMOQA_BASE_URL;

  public static String getDemoqaBaseUrl() {
    return demoqaBaseUrl;
  }

  public static void setDemoqaBaseUrl(String baseUrl) {
    demoqaBaseUrl = baseUrl;
  }

}