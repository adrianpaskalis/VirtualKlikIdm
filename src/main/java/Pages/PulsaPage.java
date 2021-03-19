package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageFactory.LoginWithPageFactory;

public class PulsaPage extends LoginWithPageFactory {
	
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[1]/div/a")
	public WebElement IconPulsa; 
	
	@FindBy (xpath="//*[@id=\"fde94763-8c56-45a3-abc9-6efe422f321c\"]")
	public WebElement CategoryPulsa; 
	
	@FindBy (xpath="//*[@id=\"nomor_pulsa\"]")
	public WebElement inputNomorPulsa;
	
	@FindBy (xpath="//*[@id=\"square_fde94763-8c56-45a3-abc9-6efe422f321c\"]/div[2]/div/div/div/div[3]/div[1]/div[1]")
	public WebElement iconProviderPulsa;
	
	@FindBy (xpath="//*[@id=\"ddl_nomor_pulsa\"]")
	public WebElement pilihDenomPulsa;
	
	@FindBy (xpath="//*[@id=\"square_fde94763-8c56-45a3-abc9-6efe422f321c\"]/div[2]/div/div/div/div[4]/div[2]/div[2]/button")
	public WebElement buttonBayarPulsa;

	public PulsaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
