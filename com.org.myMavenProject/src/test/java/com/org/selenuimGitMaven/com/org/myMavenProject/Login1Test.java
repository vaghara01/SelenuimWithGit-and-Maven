package com.org.selenuimGitMaven.com.org.myMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login1Test {
	@Test
	public void loginTest() {
		System.setProperty("webdriver.gecko.driver", "E:\\SE driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org");
		driver.manage().window().maximize();

	}

}
