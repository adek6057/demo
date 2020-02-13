package Agit.Agithub;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitBase {
	public  static Properties pro;
	public static  WebDriver driver; 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fs = new FileInputStream("C:\\TestAutomation\\Agithub\\src\\main\\java\\config\\git.Properties");
        pro.load(fs);
        
      String name = pro.getProperty("browser");
      if(name.equalsIgnoreCase("chrome")){
    	  WebDriverManager.chromedriver().setup();
  		  driver = new ChromeDriver();
  		  }
      else if(name.equalsIgnoreCase("firefox")){
    	  WebDriverManager.firefoxdriver();
    	  driver = new FirefoxDriver();
      }
      
      driver.get(pro.getProperty("url"));
	}
	

}
