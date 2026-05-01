package Teymur;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class us05Test1 extends BaseDriver {
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
        MyFunc.wait(5);

        WebElement addBackpackButton = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addBackpackButton.click();
        MyFunc.wait(2);

        WebElement addLigtButton = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        addLigtButton.click();
        MyFunc.wait(2);

        WebElement shopingcartButton = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        shopingcartButton.click();
        MyFunc.wait(2);

        WebElement checkoutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkoutButton.click();
        MyFunc.wait(2);

        WebElement inputFirstname = driver.findElement(By.xpath("//input[@id='first-name']"));
        inputFirstname.sendKeys("CAPS_tester");
        MyFunc.wait(2);

        WebElement inputLastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        inputLastname.sendKeys("learning");
        MyFunc.wait(2);

        WebElement inputZip = driver.findElement(By.xpath("//input[@id='postal-code']"));
        inputZip.sendKeys("1000");
        MyFunc.wait(2);

        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();
        MyFunc.wait(2);

        WebElement pricetext = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        System.out.println(pricetext.getText());

        Assert.assertEquals("Item total: $39.98", pricetext.getText());


        gozleBagla();
    }
}
