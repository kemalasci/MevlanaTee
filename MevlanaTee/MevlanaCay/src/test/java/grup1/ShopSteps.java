package grup1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ShopSteps extends SiteMethods implements Locators{

    static String expectedProduct;
    static String expectedPrice;

    @Given("navigate to shop page")
    public void navigateToShopPage() {
        open(url);
        // getWebDriver().manage().window().setSize(new Dimension(480,800));
        if ($(acceptButton).is(Condition.enabled)) {
            $(acceptButton).shouldBe(Condition.appear).click();
        }
        //todo  cookies product sayfasina gectiginde duruyorsa hata veriyor..
        $(shopPage).click();
    }


    @When("product images should be visible")
    public void productImagesShouldBeVisible() {

        ElementsCollection productArr = $$(products);
        productArr.forEach(e -> System.out.println(e.find("img").getAttribute("src")));
    }

    @Then("verify product's images functionalities")
    public void verifyProductSImagesFunctionalities() {

        for (SelenideElement e : $$(productsIcon)) {
            e.hover();
            Assert.assertTrue(verifyLink(e.getAttribute("href")));

        }
    }

    @When("The information of the selected product should be verified")
    public void theInformationOfTheSelectedProductShouldBeVerified() {

          int randomIndex = randomSayi($$(productsText).size());
       // int randomIndex = 5;

        expectedProduct = $$(productsText).shouldBe().get(randomIndex).getText().substring(0,57);
        expectedPrice = $$(productsPrice).shouldBe().get(randomIndex).getText();
        $$(productsText).get(randomIndex).shouldBe().click();

        String actualText = $(selectedText).shouldBe().getText().substring(0,57);
        String actualPrice = $(selectedPrice).shouldBe().getText();
        Assert.assertEquals(actualText, expectedProduct);
        Assert.assertEquals(actualPrice, expectedPrice);

    }

    @Then("The Product-related information should be visible")
    public void theProductRelatedInformationShouldBeVisible() {

        String strDescription = "Mevlana Goran Tee Luxusmischung";
        String actualDesc = $(description).shouldBe().getText();
        Assert.assertTrue(actualDesc.contains(strDescription));

        $(addInformation).shouldBe().click();
        String addInfo = "GORAN- TEE";
        String actualInfo = $(manufacturer).shouldBe().getText();
        Assert.assertEquals(actualInfo, addInfo);


        sleep(3000);
        // todo gr bilgisi uyusmazligi
        // todo browser size
        // scrolIntro
    }

    @Then("User should be able to write review about product")
    public void userShouldBeAbleToWriteReviewAboutProduct(DataTable dataTable) {

        $(review).shouldBe(appear).click();
        $(buttonSenden).click();
        getWebDriver().switchTo().alert().accept();

        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            $(review).shouldBe(appear).click();
            //$(buttonSenden).shouldBe(visible).scrollIntoView(false);
            $("p[class^='akismet']").scrollIntoView(false);
            $(rating4).shouldBe(appear).click();
            $(comment).setValue(columns.get("review"));
            $(name).setValue(columns.get("name"));
            $(email).setValue(columns.get("email"));
            $(buttonSenden).click();
            refresh();
        }

        $(selectedPrice).scrollIntoView(true);
        $(quantity).setValue("2");
        $(cart).shouldBe(enabled).click();
    }

    @Then("User should be able to add product to the cart with wanted quantity")
    public void userShouldBeAbleToAddProductToTheCartWithWantedQuantity() {

        String cartProductText = $(cartText).getText().substring(0,57);
        String cartProductPrice = $(cartPrice).getText();
        // System.out.println("cartProductPrice = " + cartProductPrice);
        double intPrice = Double.parseDouble(cartProductPrice.replace(",",".").replace("€",""));
        String cartProductQuantity = $(cartQuantity).getAttribute("value");
        double intQuantity = Double.parseDouble(cartProductQuantity);
        String cartProductSub = $(cartSubTotal).getText();
        double intSub = Double.parseDouble(cartProductSub.replace(",",".").replace("€",""));

        Assert.assertEquals(cartProductText,expectedProduct);
        Assert.assertEquals(cartProductPrice,expectedPrice);
        Assert.assertEquals(cartProductQuantity,"2");

        Assert.assertEquals((intQuantity*intPrice),intSub);


    }

    @Test
    public void test(){
        String a = "Mevlana Tee / Tea / Çay / CEYLON Tee/ GORAN Tee / 500 gr (10 Stück) 10×500 gr";
        String b = "Mevlana Tee / Tea / Çay / CEYLON Tee/ GORAN Tee / 500 gr (10 Stück) 10x500 gr";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)!=b.charAt(i)) {
                System.out.println(a.charAt(i));
            }

        }
        String str = "Mevlana Tee / Tea / Çay / CEYLON Tee/ GORAN Tee / 500 gr";
        System.out.println(str.length());

    }
}
