package com.testingedu.will;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public WebDriver driver;
	
	public LoginTest(WebDriver d) {
		driver=d;
	}
	//执行Login模块自动化的测试
	
    public void login() throws InterruptedException {
    	//打开登录页面
    	driver.get("http://www.testingedu.com.cn:8000/Home/user/login.html");
    	//输入手机号
    
    	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("13800138006");
    	//输入密码
    	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
    	//输入验证码
    	driver.findElement(By.xpath("//*[@id=\"verify_code\"]")).sendKeys("1111");
    	//点击登录
    	
    	driver.findElement(By.xpath("//*[@id=\"loginform\"]/div/div[6]/a")).click();
    	
    	
    	System.out.println("用户登录完成");
    }
}
