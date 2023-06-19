package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment{

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        
        driver = new EdgeDriver();
        driver.get("https://selenium.obsqurazone.com/drag-drop.php");
    }

         @Test
          public void softAssertExample() {
        	 System.out.println("testing");
//        // Verify website title
//        String expectedTitle = "Obsqura Testing";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle, "Website title doesn't match!");

        // Soft assert for elements
//        softAssertElementPresent(By.id("txtUsername"), "Username input field is missing.");
//        softAssertElementPresent(By.id("txtPassword"), "Password input field is missing.");
//        softAssertElementPresent(By.id("btnLogin"), "Login button is missing.");
//        softAssertElementPresent(By.linkText("Forgot your password?"), "Forgot password link is missing.");
//        softAssertElementPresent(By.xpath("//div[contains(text(), 'OrangeHRM 4.7')]"),
//                "Version text is missing at the bottom of the page.");
    }

//    private void softAssertElementPresent(By locator, String errorMessage) {
//        try {
//            WebElement element = driver.findElement(locator);
//            Assert.assertTrue(element.isDisplayed(), errorMessage);
//        } catch (Exception e) {
//            Reporter.log("Warning: " + errorMessage);
//        }
//    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
