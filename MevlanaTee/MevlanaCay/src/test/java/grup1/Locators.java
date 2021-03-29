package grup1;

import org.openqa.selenium.By;

public interface Locators {

    String url = "https://www.mevlanacay.de/";
    //By menuShop = By.xpath("(//nav[@id='menu']/ul/li)[2]");
    By acceptButton = By.cssSelector("button[data-cf-action='accept']");
    By shopPage = By.cssSelector("ul>li+li");
    By products = By.cssSelector("div.image_wrapper");  // todo $$-array
    By productsIcon = By.cssSelector("a[class='link']");  // todo $$-array
    By productsText = By.cssSelector("div.desc h4");  // todo $$-array
    By productsPrice = By.cssSelector("span[class='price']");  // todo $$-array
    By selectedText = By.cssSelector("h1.product_title.entry-title");
    By selectedPrice = By.cssSelector("span.woocommerce-Price-amount.amount");

    By quantity = By.cssSelector("input[id^='quantity']");
    By cart =By.cssSelector("button[type='submit']");


    By description = By.cssSelector("div#tab-description p");

    By addInformation = By.cssSelector("li[aria-controls$='information']");
    By manufacturer = By.xpath("(//td[@class='woocommerce-product-attributes-item__value'])[2]");


    By review = By.cssSelector("li[aria-controls$='reviews']");
    By ratingList = By.cssSelector("p.stars a");  // todo $$ array
    By rating4 = By.cssSelector("p a.star-4");
    By comment = By.cssSelector("textarea#comment");
    By name = By.cssSelector("input#author");
    By email = By.cssSelector("input#email");
    By buttonSenden = By.cssSelector("div input#submit");

    By cartText = By.cssSelector("td.product-name a");
    By cartPrice = By.cssSelector("td.product-price");
    By cartQuantity = By.cssSelector("td.product-quantity input");
    By cartSubTotal = By.cssSelector("td.product-subtotal");




}
