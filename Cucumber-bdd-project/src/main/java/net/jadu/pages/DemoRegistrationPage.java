package net.jadu.pages;

import com.cucumber.listener.Reporter;
import net.jadu.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoRegistrationPage extends Utilities {

    @FindBy(xpath = "//input[@id='q3a3f0360c07a2f193f5d6c3deb4e3eaae30a645e']")
    WebElement _my_firstName;

    @FindBy(xpath = "//input[@id='qd1739dc6339989544b4f2cb33c5589b732dd64be']")
    WebElement _my_lastName;

    @FindBy(xpath = "//input[@id='q1849eab7c39f65c5cda6ad7e4d0b1bb6bf9662cd']")
    WebElement _email;

    @FindBy(xpath = "//input[@id='q03edae0235e3eb19801864a76eb03461edf03534']")
    WebElement _organisation_call;

    @FindBy(xpath = "(//select[@class='form__select']/option)[2]")
    WebElement _country_residence;

    @FindBy(xpath = "(//select[@class='form__select']/option)[7]")
    WebElement _interested_options;

    @FindBy(xpath = "//button[contains(text(),'Drop files here or click to upload.')]")
    WebElement _dropfile_uploadfile;

    @FindBy(xpath = "//input[@id='qc10e3b757b486718defa7935c538283a364cd8ce_postcode']")
    WebElement _postcode;

    @FindBy(xpath = "//label[normalize-space()='I agree to receive communications from Jadu.']")
    WebElement _tickCheckBox;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    WebElement _nextTab;



    private static final Logger log = LogManager.getLogger(DemoRegistrationPage.class.getName());

    public void enterMyFirstName(String myFirstname) {
        sendTextToElement(_my_firstName, myFirstname);
        log.info("Enter First Name " + _my_firstName);

    }

    public void enterMyLastName(String myLastName) {
        sendTextToElement(_my_lastName, myLastName);
        log.info("Enter Last Name" + _my_lastName);
        
    }

    public void enterMyEmail(String email) {
        sendTextToElement(_email, email);
        log.info("Enter Email ID " + _email);
    }

    public void enterOrganisationCallName(String organisationName) {
        sendTextToElement(_organisation_call, organisationName);
        log.info("Enter Organisation Name" + _organisation_call);
    }

    public void selectCountryResidence(String CountryName) {
        clickOnElement(_country_residence);
        selectByVisibleTextFromDropDown(_country_residence, CountryName);
        log.info("Country Residence Name" + _country_residence);
    }

    public void selectInterestSeeingMore(String myInterest) {
        clickOnElement(_interested_options);
        selectByVisibleTextFromDropDown(_interested_options, myInterest);
        log.info("Enter My Interest " + _interested_options);
    }


    public void enterPostCode(String postcode) {
        sendTextToElement(_postcode, postcode);
        log.info("Enter Postcode" + _postcode);
    }


    public void selectuploadfile(String fileupload){
        doSendKeys(_dropfile_uploadfile, fileupload);
    }

    public void tickTheCheckBox() {
        clickOnElement(_tickCheckBox);
        log.info("Click on CheckBox" + _tickCheckBox);
    }


    public void clickOnNextTab() {
        clickOnElement(_nextTab);
        log.info("Click on Next Tab" + _nextTab);
    }


}
