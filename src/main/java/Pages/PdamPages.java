package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import PageFactory.LoginWithPageFactory;

public class PdamPages extends LoginWithPageFactory {
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[11]/div/a")
	public WebElement IconPDAM;
	
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[3]/div/div/div[2]/div[1]/div[1]/button/span[1]")
	public WebElement PilihNamaPDAM; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[3]/div/div/div[2]/div[1]/div[1]/div/div/input")
	public WebElement InputTextPDAM; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[3]/div/div/div[2]/div[1]/div[1]/div/ul/li[224]/a")
	public WebElement selectInputTextPDAM;
	
	@FindBy (xpath="//*[@id=\"CustomerNo\"]")
	public WebElement CustomerNo; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[3]/div/div/div[2]/div[2]/div[2]/i")
	public WebElement btnCancel; 
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[3]/div/div/div[3]/div/div/button")
	public WebElement btnBayarPDAM; 
	
	
	
	public PdamPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void goToPDAM() {
		try { 
			waitElement(); 
			IconPDAM.click();
			Thread.sleep(5);
		} catch (InterruptedException e) { 
			e.printStackTrace();;
		}
	}
	
	
	public void pilihNamaPDAM() { 
		try { 
			waitElement();
			PilihNamaPDAM.click();
			Thread.sleep(6);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}
	
	public void inputTextPDAM(String strNamaPDAM) { 
		try {
			waitElement(); 
			InputTextPDAM.sendKeys(strNamaPDAM);
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	public void selectInputTextPDAM() { 
		try { 
			waitElement();
			selectInputTextPDAM.click();
			Thread.sleep(6);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}
	
	public void btnCancelIsDisplay() {
		try { 
			waitElementLong();
			boolean status = btnCancel.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void inputCustomerNo(String strCustomerNo) {
		try {
			waitElement();
			CustomerNo.sendKeys(strCustomerNo);
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickButtonBayarPDAM() {
		try {
			waitElement(); 
			btnBayarPDAM.click();
			Thread.sleep(6);
			
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}
	
	

}
