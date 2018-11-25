package com.testingedu.tufei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatTest {

	public WebDriver driver;
	
	public CreatTest(WebDriver d) {
		driver=d;
	}
	//执行Login模块自动化
	
    public void creat() throws InterruptedException {
    	//打开购物页面
    	driver.get("http://www.testingedu.com.cn:8000/");
    //搜索手机
    	driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("手机");
    	//点击搜索
    	driver.findElement(By.xpath("//*[@id=\"searchForm\"]/button")).click();
    	//选择第一个商品
    	driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/ul/li[1]/div/div[1]/a/img")).click();
    	//添加购物车
    	driver.findElement(By.xpath("//*[@id=\"join_cart\"]")).click();
    	
    	
    	System.out.println("加入购物车");
    }
}
