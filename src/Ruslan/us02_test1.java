package HomeWork.Project_1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class us02_test1 extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.saucedemo.com/");
        MyFunc.wait(2);
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
        WebElement addBackpackBtn = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addBackpackBtn.click();
        MyFunc.wait(2);
        WebElement shopingcartBtn = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        shopingcartBtn.click();
        MyFunc.wait(2);


    }
}
