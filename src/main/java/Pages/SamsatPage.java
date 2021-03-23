package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageFactory.LoginWithPageFactory;

public class SamsatPage extends LoginWithPageFactory {
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[3]/div/a")
	public WebElement IconSamsat; 
	
	@FindBy (xpath="//*[@id=\"0deb539c-928d-4198-ac57-36ca5e27e44e\"]")
	public WebElement pilihSamsatJatim; 
	
	@FindBy (xpath="//*[@id=\"907af331-ce4b-43d4-a56a-0879c8e68f37\"]")
	public WebElement pilihSamsatBanten;
	
	@FindBy (xpath="//*[@id=\"CustomerNo\"]")
	public WebElement CustomerNo;
	
	@FindBy (xpath="//*[@id=\"CustomerNo2\"]")
	public WebElement NomorMesin;
	
	@FindBy (xpath="//*[@id=\"CustomerNo3\"]")
	public WebElement NomorKTP; 
	
	@FindBy (xpath="//*[@id=\"square_e-samsat-jawa-timur\"]/div[2]/div/div/div/div[3]/div[2]/div/button")
	public WebElement buttonBayarJatim;
	@FindBy (xpath="//*[@id=\"square_e-samsat-banten\"]/div[2]/div/div/div/div[4]/div[2]/div/button")
	public WebElement buttonBayarBanten;
	public SamsatPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
	
	public void goToSamsat() throws NoSuchElementException{
		try {
			waitElement();
			IconSamsat.click();
			
			}catch (NoSuchElementException e) {
			e.printStackTrace();
			}
		}
	
	public void pilihSamsatJatim() throws NoSuchElementException{
		try {
			waitElement();
			pilihSamsatJatim.click();
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			}
		} 
	
	public void pilihSamsatBanten() throws NoSuchElementException{
		try {
			waitElement();
			pilihSamsatBanten.click();
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			}
		} 
	
	public void setKodePembayaran(String setKodePembayaran) throws NoSuchElementException{
		try {
				waitElement();
				CustomerNo.sendKeys(setKodePembayaran);
				System.out.println("set kode pembayaran bisa");
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("set kode pembayaran gabisa");
			}
		}
	public void setNomorPolisi(String strNomorPolisi) throws NoSuchElementException{
		try {
				waitElement();
				CustomerNo.sendKeys(strNomorPolisi);
				System.out.println("bisa masukin no polisi");
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("gabisa masukin no polisi");
			}
		}
	
	public void setNomorMesin(String strNomorMesin) throws NoSuchElementException{
		try {
				waitElement();
				NomorMesin.sendKeys(strNomorMesin);
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
	
	public void setNomorKTP (String strNomorKTP) throws NoSuchElementException{
		try {
				waitElement();
				NomorKTP.sendKeys(strNomorKTP);
			
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
	
	public void clickButtonBayarJatim() throws NoSuchElementException{
		try {
				waitElement();
				buttonBayarJatim.click();
			} catch (NoSuchElementException e) { 
				e.printStackTrace();
			}
		}	
	
	public void clickButtonBayarBanten() throws NoSuchElementException{
		try {
				waitElement();
				buttonBayarBanten.click();
			} catch (NoSuchElementException e) { 
				e.printStackTrace();
			}
		}	
}
