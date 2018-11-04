package com.testingedu.will;

import javax.print.attribute.standard.PrinterLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public WebDriver driver;
	
	public LoginTest(WebDriver d) {
		driver=d;
	}
	//执行Login模块自动化
	
    public void login() throws InterruptedException {
    	//打开登录页面
    	driver.get("https://mail.qq.com");
    	//进入iframe标签
    	driver.switchTo().frame("login_frame");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"u\"]")).sendKeys("286075568");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"p\"]")).sendKeys("wlqin1314520");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();
    	
    	
    	System.out.println("用户登录完成");
    }
}
