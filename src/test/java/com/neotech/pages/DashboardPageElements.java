package com.neotech.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods{
	
	@FindBy(id="account-name")
	public WebElement accountName;
	
	@FindBy(xpath="//span[text()='PIM']")
	public WebElement pmi;
	
	@FindBy (xpath="//span[text()='Employee List']")
	public WebElement employeelist;
	
	@FindBy(xpath="//span[text()='Add Employee']")
	public WebElement addemployee;
	
	@FindBy(id="account-job")
	public WebElement accountMenu;
	
	@FindBy(id="logoutLink")
	public WebElement logout;
	
	@FindBy(xpath="//li[@id='menu_news_More']/a")
	public WebElement moreMenuItem;
	
	@FindBy(xpath="//div[@id='menu-content']/ul/li")
	public List<WebElement> menuList ;
	
	public DashboardPageElements() {
		PageFactory.initElements(driver,this);
	}

}
