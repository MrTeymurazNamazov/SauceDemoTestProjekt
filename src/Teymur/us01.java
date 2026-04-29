package Teymur;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class us01 extends BaseDriver {

    @Test
    public void Test1() {
        driver.navigate().to("https://www.saucedemo.com/");
        MyFunc.wait(2);
        WebElement input1 = driver.findElement(By.xpath("//input[@data-test='username']"));
        input1.sendKeys("standard_user");
        MyFunc.wait(2);

        WebElement input2 = driver.findElement(By.xpath("//input[@data-test='password']"));
        input2.sendKeys("secret_sauce");
        MyFunc.wait(2);

        WebElement clickLoginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        clickLoginButton.click();
        MyFunc.wait(2);


        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);
  }

}

