package Fatime;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_03_Test1 extends BaseDriver {

    @Test
    public void Test1 () {
        driver.get("https://www.saucedemo.com/");
        //Login
        WebElement username = driver.findElement(By.name("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        MyFunc.wait(2);

        //Mehsullari elave et
        WebElement backpackAdd = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        backpackAdd.click();

        WebElement bikeLightAdd = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        bikeLightAdd.click();

        // Sebet ikonuna klikle
        WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
        cartIcon.click();
        MyFunc.wait(2);
        Assert.assertTrue("Sehife uygun gelmedi",
        driver.getCurrentUrl().equals("https://www.saucedemo.com/cart.html"));

        //Mehsulu sil
        WebElement removeBikelight = driver.findElement(By.id("remove-sauce-labs-bike-light"));
        removeBikelight.click();

        List <WebElement> products = driver.findElements(By.className("inventory_item_name"));
        Assert.assertEquals(1, products.size());
        Assert.assertEquals("Sauce Labs Backpack", products.get(0).getText() );

        gozleBagla();
    }
}
