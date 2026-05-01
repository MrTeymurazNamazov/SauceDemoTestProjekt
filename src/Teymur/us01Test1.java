package Teymur;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class us01Test1 extends BaseDriver {

    @Test
    public void Test1() {
        driver.navigate().to("https://www.saucedemo.com/");
        MyFunc.wait(2);
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='user-name']"));
        inputUsername.sendKeys("standard_user");
        MyFunc.wait(2);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.sendKeys("secret_sauce");
        MyFunc.wait(2);

        WebElement clickLoginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        clickLoginButton.click();
        MyFunc.wait(2);


        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);
        MyFunc.wait(2);
        gozleBagla();
    }

}

