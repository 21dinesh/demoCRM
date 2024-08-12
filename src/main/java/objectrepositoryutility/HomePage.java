package objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.webdriverUtility.Web;



public class HomePage extends Web{
	
	WebDriver driver;
   
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Organizations")
	private WebElement orgLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;

	@FindBy(linkText = "More")
	private WebElement moreLink;

	@FindBy(linkText = "Campaigns")
	private WebElement campaignLink;

	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminIcon;

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public WebElement getAdminIcon() {
		return adminIcon;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getCampaignLink() {
		return campaignLink;
	}

	public void logout() {
		
		waitForPageToLoad(driver);
		waitForElement(driver, adminIcon);
		adminIcon.click();
		mouseMoveOnElement(driver, signOutLink);
		adminIcon.click();
	}

	
}