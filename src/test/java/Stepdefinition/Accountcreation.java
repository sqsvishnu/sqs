package Stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.*;


public class Accountcreation {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    BuyerSteps b;


    @Given("^I have an Existing Account$")
    public void i_have_an_Existing_Account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.print("Hello World");

        b.opens_etsy_home_page();

        driver.manage().window().maximize();

        driver.findElement(By.id("Login:LoginScreen:LoginDV:username-inputEl")).sendKeys("Selva");
        driver.findElement(By.id("Login:LoginScreen:LoginDV:password-inputEl")).sendKeys("Selva");

        driver.findElement(By.id("Login:LoginScreen:LoginDV:submit-btnInnerEl")).click();
    }

    @When("^Account Summary is Displayed$")
    public void account_Summary_is_Displayed() throws InterruptedException {
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"TabBar:AccountTab-btnInnerEl\"]")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("AccountFile:AccountFileMenuActions-btnInnerEl")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-textEl")).click();
        Thread.sleep(3000);

    }

    @When("^I select a product as Personal Auto$")
    public void i_select_a_product_as_Personal_Auto() throws InterruptedException {
        Thread.sleep(4000);
        //personal auto
        driver.findElement(By.id("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission")).click();
        Thread.sleep(4000);
        //offering selection
        driver.findElement(By.xpath("//input[@id='SubmissionWizard:OfferingScreen:OfferingSelection-inputEl']")).sendKeys("Basic Program");
        //next
        Thread.sleep(4000);


        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();
        Thread.sleep(3000);

        //next
        Thread.sleep(3000);

        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();
        Thread.sleep(3000);
        //next

        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();
        Thread.sleep(3000);

    }

    @When("^I enter the Required Details$")
    public void i_enter_the_Required_Details() throws InterruptedException {

        //add


        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnInnerEl")).click();
        //add sideclick


        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact-arrowEl")).click();
        //partha r

        Thread.sleep(3000);


        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact:0:UnassignedDriver-textEl")).click();
        //license state
        Thread.sleep(3000);

        //licence clear
        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseState-inputEl")).clear();

        Thread.sleep(3000);

        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseState-inputEl")).sendKeys("Hawaii");

        //next
        Thread.sleep(3000);

        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();
        //create vehicle
        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl")).click();
        Thread.sleep(3000);
        //print vin no

        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Vin_DV-inputEl")).sendKeys("123456");
        //costnew clear
        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:CostNew_DV-inputEl")).clear();
        Thread.sleep(3000);
        //costnew enter

        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:CostNew_DV-inputEl")).sendKeys("2000");


        //license state clear
        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicenseState_DV-inputEl")).clear();

        Thread.sleep(3000);
        //license state print

        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicenseState_DV-inputEl")).sendKeys("Hawaii");

        //click add
        Thread.sleep(3000);

        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnInnerEl")).click();
        Thread.sleep(3000);

        //chose partha

        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver-textEl")).click();

        //next 2 times
        Thread.sleep(3000);

        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();
        Thread.sleep(3000);
    }

    @Then("^Policy Number is generated$")
    public void policy_Number_is_generated() throws InterruptedException {
        //quote
        Thread.sleep(3000);

        driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl")).click();

        //bind options
        Thread.sleep(5000);

        driver.findElement(By.id("SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnWrap")).click();

        //bind&Issue only
        Thread.sleep(2000);

        driver.findElement(By.id("SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:BindAndIssue-textEl")).click();

        //pop up
        Thread.sleep(3000);

        driver.findElement(By.id("button-1005-btnInnerEl")).click();

        //Submission Bound
        Thread.sleep(5000);


        driver.findElement(By.id("JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl")).click();
        Thread.sleep(9000);

        WebElement storeValueEle = driver.findElement(By.xpath("//span[@id='PolicyFile:PolicyFileMenuInfoBar:PolicyNumber-btnInnerEl']//span[2]"));
        String policyNumber = storeValueEle.getText();
        System.out.println("POLICY NUMBER: " + policyNumber);

        //Search policy
        driver.findElement(By.xpath("//*[@id=\"TabBar:SearchTab-btnInnerEl\"]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:PolicyNumberCriterion-inputEl\"]")).sendKeys(policyNumber);

        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)", "");


        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\"]")).click();


        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV:0:PolicyNumber\"]")).click();
        Thread.sleep(3000);
    }

    @After
    public void afterScenario(Scenario s) {
        if (s.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                s.embed(screenshot, "image/png");
                s.write("URL at failure: " + driver.getCurrentUrl());
            } catch (WebDriverException wde) {
                s.write("Embed failure " + wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        }
    }
}
