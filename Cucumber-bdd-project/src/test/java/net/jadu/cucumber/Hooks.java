package net.jadu.cucumber;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.jadu.basepage.BasePage;
import net.jadu.browserselector.BrowserSelector;
import net.jadu.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;



public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();
    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("chrome");
    @Before
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    public void tearDown() {
         driver.quit();
    }


 }
