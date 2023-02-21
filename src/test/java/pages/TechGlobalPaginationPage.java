package pages;

public class TechGlobalPaginationPage extends TechGlobalBasePage {
    public TechGlobalPaginationPage(){
        super();
    }

    @FindBy(id = "main_heading")
    public WebElement mainHeading;

    @FindBy(id = "sub_heading")
    public WebElement subHeading;

    @FindBy(id = "content")
    public WebElement contentParagraph;

    @FindBy(id = "next")
    public WebElement nextButton;

    @FindBy(id = "previous")
    public WebElement previousButton;

    @FindBy(css = "div[class*='pagBodyData']>p")
    public List<WebElement> cityInformationList;

    @FindBy(css = "img[class*='city']")
    public  WebElement cityImage;



}
