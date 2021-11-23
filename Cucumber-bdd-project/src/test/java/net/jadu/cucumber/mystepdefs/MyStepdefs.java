package net.jadu.cucumber.mystepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.jadu.pages.DemoRegistrationPage;


public class MyStepdefs {
    DemoRegistrationPage demoRegistrationPage = new DemoRegistrationPage();

    @Given("^User is on Home Page$")
    public void userIsOnHomePage() {
    }

    @When("^User click on demo registration form link$")
    public void userClickOnDemoRegistrationFormLink() {
    }

    @Then("^User should land on demo registration page successfully$")
    public void userShouldLandOnDemoRegistrationPageSuccessfully() {
    }

    @Given("^User is on demo registration page$")
    public void userIsOnDemoRegistrationPage() {
    }

    @When("^User enter <first name> in “Hello! My first name” text field$")
    public void userEnterFirstNameInHelloMyFirstNameTextField() {
        demoRegistrationPage.enterMyFirstName("Minal");

    }

    @And("^User enter <last name> in “My last name” text field$")
    public void userEnterLastNameInMyLastNameTextField() {
        demoRegistrationPage.enterMyLastName("Patel");

    }

    @And("^User enter <email> in “you can email me at” text field$")
    public void userEnterEmailInYouCanEmailMeAtTextField() {

        demoRegistrationPage.enterMyEmail("minal@gmail.com");
    }

    @And("^User enter <organisation name> in “I work at organisation” field$")
    public void userEnterOrganisationNameInIWorkAtOrganisationField() {
        demoRegistrationPage.enterOrganisationCallName("Admin");
    }

    @And("^User select <country of residence> from “My country of residence”$")
    public void userSelectCountryOfResidenceFromMyCountryOfResidence() {
        demoRegistrationPage.selectCountryResidence("UK & Ireland");

    }

    @And("^User select <jadu service> from “I am interested in seeing more of” text field$")
    public void userSelectJaduServiceFromIAmInterestedInSeeingMoreOfTextField() {
        demoRegistrationPage.selectInterestSeeingMore("Jadu CMS");

    }

    @And("^User enter postcode$")
    public void userEnterPostcode() {
        demoRegistrationPage.enterPostCode("HA53LR");
    }

    @And("^User click on check box$")
    public void userClickOnCheckBox() {
        demoRegistrationPage.tickTheCheckBox();

    }

    @And("^User select fileuplod$")
    public void userSelectFileuplod() {
        demoRegistrationPage.selectuploadfile("C:\\Users");
    }

    @And("^User click on next link$")
    public void userClickOnNextLink() {
        demoRegistrationPage.clickOnNextTab();

    }

    @Then("^User navigate to <next page>$")
    public void userNavigateToNextPage() {
    }


}
