package com.pioneer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;

class PioneerDemoSeleniumSteps extends PioneerDriverFactory {

	public void login(DataTable loginDetails) {
		List<List<String>> login = loginDetails.raw();

		// initiate driver and open url
		createDriver();

		// wait for the page to load
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By
				.id("header")));
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By
				.id("login")));

		// enter username
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(login.get(1).get(1));

		// enter password
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(login.get(2).get(1));

		// click submit
		driver.findElement(By.xpath("//*[@class='loginButtons']/button"))
				.click();

		// wait for home page
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By
				.id("dashboardActionItems")));
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By
				.id("dashboardBulletinItems")));

	}

	public void reachCreativePage() {
		System.out.println("Inside reachCreativePage method");

		waitVar.until(ExpectedConditions.elementToBeClickable(By
				.linkText("Creative")));

		driver.findElement(By.linkText("Creative")).click();

		waitVar.until(ExpectedConditions.presenceOfElementLocated(By
				.id("searchResultList")));
	}

	public void verifyCreateCreative() {
		waitVar.until(ExpectedConditions.elementToBeClickable(By
				.linkText("Create Creative")));

		assertTrue(driver.findElement(By.linkText("Create Creative"))
				.isDisplayed());
	}

	public void ClickCreateCreative() {
		waitVar.until(ExpectedConditions.elementToBeClickable(By
				.linkText("Create Creative")));

		driver.findElement(By.linkText("Create Creative")).click();
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By
				.id("mediaType")));
	}

	public void typeDatainFeilds(cucumber.api.DataTable loginDetails) {
		List<List<String>> login = loginDetails.raw();

		Select mediaType = new Select(driver.findElement(By.id("mediaType")));
		mediaType.selectByVisibleText(login.get(1).get(1));

		driver.findElement(By.id("product")).sendKeys(login.get(2).get(1));
		driver.findElement(By.id("show")).sendKeys(login.get(3).get(1));
		driver.findElement(By.id("creativeVersion")).sendKeys(
				login.get(4).get(1));
		driver.findElement(By.id("cpoTarget")).sendKeys(login.get(5).get(1));
		driver.findElement(By.id("productAbbreviation")).sendKeys(
				login.get(6).get(1));
		driver.findElement(By.id("showAbbreviation")).sendKeys(
				login.get(7).get(1));
	}

	public void clickSaveButton() {
		driver.findElement(By.id("create")).click();
	}

	public void verifySuccessMessage() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='pageBody']/div/div[2]")));

		System.out.println(driver.findElement(
				By.xpath("//*[@id='pageBody']/div/div[2]")).getText());

		assertTrue(driver
				.findElement(By.xpath("//*[@id='pageBody']/div/div[2]"))
				.getText().contains("successfully created"));
	}

	public void verifyErrorMessages() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//form/div/div[3]/div[2]/div[@class='errors']")));

		assertEquals(
				"Product is mandatory",
				driver.findElement(
						By.xpath("//form/div/div[3]/div[2]/div[@class='errors']"))
						.getText());
		assertEquals(
				"Product Abbreviation is mandatory",
				driver.findElement(
						By.xpath("//form/div/div[4]/div[2]/div[@class='errors']"))
						.getText());
		assertEquals(
				"Show Abbreviation is mandatory",
				driver.findElement(
						By.xpath("//form/div/div[7]/div[2]/div[@class='errors']"))
						.getText());
		assertEquals(
				"Show is mandatory",
				driver.findElement(
						By.xpath(" //form/div/div[6]/div[2]/div[@class='errors']"))
						.getText());

	}

}
