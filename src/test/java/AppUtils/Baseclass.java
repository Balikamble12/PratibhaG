package AppUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Baseclass{
 

    protected WebDriver driver;

    public void DropdownText(WebElement locator, String text) {
        Select option = new Select(locator);
        option.selectByVisibleText(text);
    }

    public void DropdownIndex(WebElement locator, int value) {
        Select option = new Select(locator);
        option.selectByIndex(value);
    }

    public void Dropdownvalue(String text, WebElement locator) {
        Select option = new Select(locator);
        option.selectByVisibleText(text);
    }}

  
