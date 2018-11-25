package com.testingedu.antoy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testingedu.tufei.CreatTest;
import com.testingedu.will.LoginTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException  
    {
    	//设置浏览器路径
    	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
    	//打开chrome浏览器
    	WebDriver driver = new ChromeDriver();
    	//设置每一个操作的默认等待时间，10秒
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	//调用login模块，执行登录用例
    	LoginTest login = new LoginTest(driver);
    	login.login();
    	
    	//调用查看模块，完成购物车添加
    	CreatTest creat = new CreatTest(driver);
    	creat.creat();
    	
    	//关闭浏览器
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.close();
    	
    }
}
