package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver;
    @Given("^User open browser And Enter Url$")
    public void user_open_browser_And_Enter_Url(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
}
    @Then("^User click the Registration button$")
    public void user_click_the_Registration_button() {
        driver.findElement(By.className("ico-register")).click();
    }



    @Then("^User Click on Radio Female button$")
    public void user_Click_on_Radio_Female_button()  {
        driver.findElement(By.id("gender-female")).click();

    }

    @Then("^User Enter \"([^\"]*)\"and \"([^\"]*)\" as FirstName and LastName$")
    public void user_Enter_and_as_FirstName_and_LastName(String FirstName, String LastName)
    { driver.findElement(By.id("FirstName")).sendKeys(FirstName);
        driver.findElement(By.id("LastName")).sendKeys(LastName);

   }


    @Then("^User Enter \"([^\"]*)\" for Day$")
    public void user_Enter_for_Day(String Day)  {
        driver.findElement(By.name("DateOfBirthDay")).sendKeys(Day);

    }

    @Then("^User Enter\"([^\"]*)\" for month$")
    public void user_Enter_for_month(String month) {
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys(month);

    }

    @Then("^User Enter\"([^\"]*)\" for Year$")
    public void user_Enter_for_Year(String Year)  {
        driver.findElement(By.name("DateOfBirthYear")).sendKeys(Year);

    }

    @Then("^User Enter \"([^\"]*)\" as Email$")
    public void user_Enter_as_Email(String email)  {
         driver.findElement(By.id("Email")).sendKeys(email);
    }

    @Then("^User Enter \"([^\"]*)\" for Company Name$")
    public void user_Enter_for_Company_Name(String cname) {
         driver.findElement(By.id("Company")).sendKeys(cname);
    }

    @Then("^User Enter\"([^\"]*)\" for Password$")
    public void user_Enter_for_Password(String pwd)  {
        driver.findElement(By.id("Password")).sendKeys(pwd);
    }

    @When("^User Enter \"([^\"]*)\" for Confirm Password field$")
    public void user_Enter_for_Confirm_Password_field(String cpwd)  {
        driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
    }

    @When("^Click on register$")
    public void click_on_register()  {
        driver.findElement(By.id("register-button")).click();
    }

    @Then("^User is on HomePage$")
    public void user_is_on_HomePage()  {
        driver.close();
    }

}
