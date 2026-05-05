package HomeWork.Project_1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class us04_test1 extends BaseDriver{
    @Test
    public void us04_test1(){
        //go site
        driver.get("https://www.saucedemo.com/");
        MyFunc.wait(2);
        // Username and Password
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        MyFunc.wait(2);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.wait(2);
        WebElement clcikBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
        clcikBtn.click();
        MyFunc.wait(2);
        Assert.assertEquals("https://www.saucedemo.com/inventory.html",driver.getCurrentUrl());
        MyFunc.wait(2);
        //Add cart
        WebElement addBackpackBtn = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addBackpackBtn.click();
        MyFunc.wait(2);
        //Shopping cart button
        WebElement shopingcartBtn = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        shopingcartBtn.click();
        MyFunc.wait(2);
        //Checkout button
        WebElement checkoutBtn = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkoutBtn.click();
        MyFunc.wait(2);
        //Customer Information
        WebElement inputFirstname = driver.findElement(By.xpath("//input[@id='first-name']"));
        inputFirstname.sendKeys("Caps Tester");
        WebElement inputLastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        inputLastname.sendKeys("learning");
        WebElement inputZip = driver.findElement(By.xpath("//input[@id='postal-code']"));
        inputZip.sendKeys("1000");
        MyFunc.wait(2);
        //Continue button
        WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
        continueBtn.click();
        MyFunc.wait(2);




    }
}
