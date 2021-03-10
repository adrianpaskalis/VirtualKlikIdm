package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageVirtual {
	public WebDriver driver; 
	
	By logoIdm 			= By.xpath("//*[@id=\"siteHeader\"]/div[1]/div/div[2]/div[1]/div/a[1]");
	By downloadApp	 	= By.id("downloadApp"); 
	By linkFacebook 	= By.xpath("//*[@id=\"follow_us\"]/a[1]");
	By linkInstagram 	= By.xpath("//*[@id=\"follow_us\"]/a[2]"); 
	By layananPelanggan = By.xpath("//*[@id=\"siteHeader\"]/div[1]/div/div[1]/div[2]/div[1]");
	By daftarTrxHome 	= By.id("itemStatus");
	By itemSaldoHome 	= By.id("itemSaldo"); 
	By profileUser		= By.id("dropdownUser"); 
	
	
	public HomePageVirtual(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getProfileUsername() {
		return driver.findElement(profileUser).getText();
	}
} 



