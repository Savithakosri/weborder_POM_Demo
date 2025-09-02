package com.webOrders.home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebOrders_ViewAllProductsPage {

	WebDriver driver;
	WebDriverWait wait;
	
	public WebOrders_ViewAllProductsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
	WebElement ddlProduct;
	@FindBy(id="ctl00_MainContent_fmwOrder_txtUnitPrice")
	WebElement pricePerUnit;
	@FindBy(xpath="//td[normalize-space()='MyMoney']/following::td[1]")
	WebElement productmoney;
	
	
	public WebElement getpriceelement(String product) {
		String dynamicXPath = "//td[normalize-space()='"+ product + "']following::td[1]";
	return driver.findElement(By.xpath(dynamicXPath));
		
	}
	
	public void getproductprice(String Product)
	{  
			
		WebElement rowElement = getpriceelement(Product);
	String ProductPrice =	rowElement.findElement(By.xpath("./following::td[1]")).getText();
	}
	
			//getAttribute("value");	}
	
  void ComparePrice()
	
	{
		System.out.println("Product validated successfully");
	}

	
	//td[normalize-space()='MyMoney']/following::td[1]

	
	
	}

