package com.sidgupta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait =new WebDriverWait(driver, Duration.ofSeconds(30));
        this.actions =new Actions(driver);
        PageFactory.initElements(driver,this);

    }

    public abstract boolean isAT();

}
