package Teymur;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class usAllTest1 extends BaseDriver {

    @Test
    public void us07Test1() {
        driver.navigate().to("https://www.saucedemo.com/");
        MyFunc.wait(2);
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='user-name']"));
        inputUsername.sendKeys("standard_user");
        MyFunc.wait(2);
        System.out.println("Login yazilidi");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.sendKeys("secret_sauce");
        MyFunc.wait(2);
        System.out.println("Password yazilidi");

        WebElement clickLoginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        clickLoginButton.click();
        MyFunc.wait(5);
        System.out.println("Login olundu");

        Assert.assertEquals("https://www.saucedemo.com/inventory.html",driver.getCurrentUrl());
        MyFunc.wait(2);
        System.out.println("Mehsul sehifesine kecdi");

        WebElement addBackpackButton = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addBackpackButton.click();
        MyFunc.wait(2);
        System.out.println("Çanta əlavə olundu");

        WebElement addLigtButton = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        addLigtButton.click();
        MyFunc.wait(2);
        System.out.println("Fənər əlavə olundu");

        WebElement shopingcartButton = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        shopingcartButton.click();
        MyFunc.wait(2);
        System.out.println("Səbət düyməsinə basildi");

        WebElement removeLightbtn = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']"));
        removeLightbtn.click();
        MyFunc.wait(2);
        System.out.println("Remove button basıldı");

        WebElement checkoutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkoutButton.click();
        MyFunc.wait(2);
        System.out.println("checkout Button basıldı");

        driver.navigate().back();
        Assert.assertEquals("https://www.saucedemo.com/cart.html", driver.getCurrentUrl());
        MyFunc.wait(2);
        System.out.println("Əvvəlki səhifəyə qayıtdı");

        driver.navigate().forward();
        Assert.assertEquals("https://www.saucedemo.com/checkout-step-one.html",driver.getCurrentUrl());
        MyFunc.wait(2);
        System.out.println("irəlidəki səhifəyə getdi");

        WebElement inputFirstname = driver.findElement(By.xpath("//input[@id='first-name']"));
        inputFirstname.sendKeys("CAPS_tester");
        MyFunc.wait(2);
        System.out.println("Firstname yazilidi");

        WebElement inputLastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        inputLastname.sendKeys("learning");
        MyFunc.wait(2);
        System.out.println("Lastname yazildi");

        WebElement inputZip = driver.findElement(By.xpath("//input[@id='postal-code']"));
        inputZip.sendKeys("1000");
        MyFunc.wait(2);
        System.out.println("Zip yazildi");

        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();
        MyFunc.wait(2);
        System.out.println("Continue button basildi");

        WebElement paymentInformation = driver.findElement(By.xpath("//div[@data-test='payment-info-value']"));
        Assert.assertEquals("SauceCard #31337", paymentInformation.getText());
        System.out.println("payment Information düz çıxdı");

        WebElement shippingInformation = driver.findElement(By.xpath("//div[@data-test='shipping-info-value']"));
        Assert.assertEquals("Free Pony Express Delivery!", shippingInformation.getText());
        System.out.println("shipping Information düz çıxdı");

        WebElement realPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
        WebElement pricetext = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));

        if (!pricetext.getText().contains(realPrice.getText())) {
            System.out.println("Real qiymet ,odenish olunan qiymet ile eyni deyil");
            gozleBagla();
        } else
            System.out.println("Real qiymet ,odenish olunan qiymet ile eynidir");

        Assert.assertEquals("Item total: $29.99", pricetext.getText());

        WebElement finishButton = driver.findElement(By.xpath("//button[@id='finish']"));
        finishButton.click();
        MyFunc.wait(2);
        System.out.println("Finish button basildi");

        WebElement text = driver.findElement(By.xpath("//h2[@class='complete-header']"));
        Assert.assertEquals("Thank you for your order!", text.getText());

        Assert.assertEquals("https://www.saucedemo.com/checkout-complete.html",driver.getCurrentUrl() );
        System.out.println("Test uğurlu bitdi!!!");
        MyFunc.wait(2);

        gozleBagla();

    }

}
