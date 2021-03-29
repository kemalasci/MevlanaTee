package stepdefs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.MyMethods;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingSteps extends MyMethods {
    int quantity = 1;

    @When("user change quantity to {int}")
    public void userChangeQuantityTo(int quantity) {
        $(inputQuantityDetail).shouldBe(Condition.enabled).setValue(quantity+"");

    }

    @And("user goto Cart")
    public void userGotoCart() {
        quantity = Integer.parseInt($(inputQuantityDetail).getValue()+"");
        $(buttonAddToCart).click();
    }

    @Then("quantity should be changed")
    public void quantityShouldBeChanged() {

    }

    @And("the price in cart should be correct")
    public void thePriceInCartShouldBeCorrect() {
    }

    @And("the total price in cart should be correct")
    public void theTotalPriceInCartShouldBeCorrect() {
    }
}
