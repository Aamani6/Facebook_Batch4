package com.login;

import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/");
		
		System.out.println("Open App");
		
		System.out.println("Close App");

	}

}
