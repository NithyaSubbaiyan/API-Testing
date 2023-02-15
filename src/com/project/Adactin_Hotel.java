package com.selnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chank\\eclipse-workspace\\Selenium_new\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Nithyachan");
		Thread.sleep(1000);
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("chan1234@!");
		
		driver.findElement(By.id("login")).click();
		WebElement location = driver.findElement(By.name("location"));
		
		Select s = new Select(location);
		s.selectByValue("London");
		
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select h = new Select(hotel);
		h.selectByValue("Hotel Sunshine");
		
		WebElement RoomT = driver.findElement(By.name("room_type"));
		Select rt = new Select(RoomT);
		rt.selectByValue("Super Deluxe");
		
		WebElement RoomNo = driver.findElement(By.id("room_nos"));
		Select rn = new Select(RoomNo);
		rn.selectByVisibleText("5 - Five");
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.clear();
		Thread.sleep(1000);
		checkin.sendKeys("26/01/2023");
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear();
		Thread.sleep(1000);
		checkout.sendKeys("30/01/2023");
		
		WebElement Adroom = driver.findElement(By.name("adult_room"));
		Select ad = new Select(Adroom);
		ad.selectByVisibleText("2 - Two");
		
		WebElement chroom = driver.findElement(By.name("child_room"));
		Select ch = new Select(chroom);
		ch.selectByVisibleText("1 - One");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("first_name")).sendKeys("Nithya");
		driver.findElement(By.id("last_name")).sendKeys("Subbaiyan");
		driver.findElement(By.name("address")).sendKeys("Plot 2c, somu nagar, Medavakkam.");
		driver.findElement(By.name("cc_num")).sendKeys("4301567989431267");
		
		WebElement cctype = driver.findElement(By.name("cc_type"));
		Select cc = new Select(cctype);
		cc.selectByValue("VISA");
		
		WebElement expmon = driver.findElement(By.id("cc_exp_month"));
		Select exp = new Select(expmon);
		exp.selectByVisibleText("March");
		
		WebElement exyear = driver.findElement(By.id("cc_exp_year"));
		Select exyr = new Select(exyear);
		exyr.selectByVisibleText("2022");
		
		driver.findElement(By.name("cc_cvv")).sendKeys("345");
		
		driver.findElement(By.name("book_now")).click();
		
		
		
		
		
		
		
		
		
	}

}
