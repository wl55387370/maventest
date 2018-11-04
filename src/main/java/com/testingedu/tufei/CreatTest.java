package com.testingedu.tufei;

import javax.print.attribute.standard.PrinterLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class CreatTest {

	public WebDriver driver;
	
	public CreatTest(WebDriver d) {
		driver=d;
	}
	//执行Login模块自动化
	
    public void creat() throws InterruptedException {
    	//打开邮箱页面
    	driver.get("https://mail.qq.com/cgi-bin/frame_html?sid=PIzeEzlFMz7gVEUe&r=0756b7b86a34f23528289f522847895f");
    	//进入iframe标签
    	driver.switchTo().frame("actionFrame");
    	Thread.sleep(2000);
    	//查看收件
    	driver.findElement(By.xpath("//*[@id=\"folder_1\"]/b[1]")).click();
    	Thread.sleep(2000);
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("mainFrame");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"div_showbefore\"]/table[1]/tbody/tr/td[3]/table/tbody/tr/td[3]/div[1]/u")).click();
    	
    	driver.switchTo().defaultContent();
    	System.out.println("查看邮件完成");
    }
}
