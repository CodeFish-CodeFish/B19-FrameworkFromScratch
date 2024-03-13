package com.luma.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CreateAccountPage {

    public CreateAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#firstname")
    WebElement firstname;

    @FindBy(css = "#lastname")
    WebElement lastname;

    @FindBy(css = "#email_address")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(css = "#password-confirmation")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@title='Create an Account']")
    WebElement createAccountBtn;

    @FindBy(xpath = "//div[.='Thank you for registering with Main Website Store.']")
    WebElement successMsg;

    public void firstNameLastName(String firstName, String lastName){

        this.firstname.sendKeys(firstName);
        this.lastname.sendKeys(lastName);

    }

    public void emailPasswords(String email, String password, String confirmPassword){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(confirmPassword);
    }

    public void clickCreateAccountValidateMsg(String successMsg, WebDriver driver){
        this.createAccountBtn.click();
        Assert.assertEquals(successMsg, BrowserUtils.getText(this.successMsg, driver));
    }
}
