package com.pioneer;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PioneerDemoSteps {

	PioneerDemoSeleniumSteps demo = new PioneerDemoSeleniumSteps();

	@Given("^user has a valid session with following details$")
	public void userHasValidSession(DataTable loginDetails) {
		// demo.login(loginDetails);
		System.out.println("Hello there 1 !!");
	}

	@Given("^user is on creative search page$")
	public void userOnCreativeSearchPage() {
		// demo.reachCreativePage();
		System.out.println("Hello there 2 !!");
	}

	@Then("^user gets an option to create a new creative$")
	public void userGetsOptionToCreateNewCreative() {
		// demo.verifyCreateCreative();
		System.out.println("Hello there 3 !!");
	}

	@When("^user clicks on new creative$")
	public void userClicksOnNewCreative() {
		// demo.ClickCreateCreative();
		System.out.println("Hello there 4 !!");
	}

	@When("^user enters following data in the fields$")
	public void userEntersDataInField(DataTable details) {
		// demo.typeDatainFeilds(details);
		System.out.println("Hello there 5 !!");
	}

	@When("^user save the data$")
	public void userSavesTheData() {
		// demo.clickSaveButton();
		System.out.println("Hello there 6 !!");
	}

	@Then("^user gets a success message$")
	public void userGetsSuccessMessage() {
		// demo.verifySuccessMessage();
		System.out.println("Hello there 7 !!");
	}

	@Then("^user closes the browser$")
	public void userClosesBrowser() {
		demo.tearDown();
	}

	@Then("^user gets error messages for mandatory fields$")
	public void userGetsErrorMessagesForMandatoryFields() {
		demo.verifyErrorMessages();
	}
}
