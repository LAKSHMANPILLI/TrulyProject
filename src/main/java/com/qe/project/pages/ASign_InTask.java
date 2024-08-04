package com.qe.project.pages;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qe.project.base.TestBase;

public class ASign_InTask extends TestBase {

	public static Random random = new Random();

	@FindBy(xpath = "//span[text()='Login to your Account']")
	private WebElement LoginAcount;

	@FindBy(xpath = "//span[text()='Sign Up']")
	private WebElement signUpbutton;
	@FindBy(xpath = "//div[@class='selected-flag']")
	private WebElement countrySynbol;

	@FindBy(xpath = "(//span[@class='country-name'])[2]")
	private WebElement CountryName;
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement PhoneNo;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;

	@FindBy(xpath = "//span[text()='CONTINUE']")
	private WebElement Continue;
	@FindBy(xpath = "//input[@class='inputStyle ']")
	private WebElement Otp;
	@FindBy(xpath = "//input[@label='First Name*']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@label='Last Name*']")
	private WebElement LastName;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	@FindBy(xpath = "//span[text()='DONE']")
	private WebElement Done;

	// div[@class='jsx-4225831484 jss10']

	public ASign_InTask() {
		PageFactory.initElements(driver, this);
	}

	public static String generateRandomPhoneNumber() {
//        int num1 = random.nextInt(9) + 1; // First digit should be between 1-9
//        int num2 = random.nextInt(10);    // Next digit between 0-9
//        int num3 = random.nextInt(10);    // Next digit between 0-9
//        int set2 = random.nextInt(643) + 100;  // Numbers between 100 and 742
//        int set3 = random.nextInt(8999) + 1000; // Numbers between 1000 and 9999
//        return String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3) + String.valueOf(set2) + String.valueOf(set3);

		 int num1 = 9; // First digit should be 9 for Indian numbers
	        int num2 = random.nextInt(10); // Second digit between 0-9
	        int num3 = random.nextInt(10); // Third digit between 0-9
	        int set2 = random.nextInt(899) + 100; // Numbers between 100 and 999
	        int set3 = random.nextInt(10000) + 1000; // Numbers between 1000 and 10999

	        return String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3) +
	               String.valueOf(set2) + String.valueOf(set3);
	    }

	    public static void main(String[] args) {
	        System.out.println(generateRandomPhoneNumber()); // Print a randomly generated Indian phone number
	    }

	public String generateRandomEmail() {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String email = "";
		for (int i = 0; i < 8; i++) {
			email += chars.charAt(random.nextInt(chars.length()));
		}
		email += "@yopmail.com";
		return email;
	}

//	private String generateRandomEmail1() {
//        String chars = "abcdefghijklmnopqrstuvwxyz";
//        StringBuilder email = new StringBuilder();
//        for (int i = 0; i < 8; i++) {
//            email.append(chars.charAt(random.nextInt(chars.length())));
//        }
//        email.append("@yopmail.com");
//        return email.toString();
//    }
	public void loginAcount() throws InterruptedException {
		Thread.sleep(1000);
		LoginAcount.click();
		Thread.sleep(1000);
	}

	public void signUpbutton() throws InterruptedException {
		Thread.sleep(1000);
		signUpbutton.click();
	}

	public void countrySynbol() throws InterruptedException {
		Thread.sleep(1000);
		countrySynbol.click();
	}

	public void countryName() throws InterruptedException {
		Thread.sleep(1000);
		CountryName.click();
	}

	public void phoneNo() throws InterruptedException {
		Thread.sleep(1000);
		PhoneNo.click();
		String phoneNumber = generateRandomPhoneNumber();
		PhoneNo.sendKeys(phoneNumber);

		// PhoneNo.sendKeys("9010713698");
	}

	public void checkBox() throws InterruptedException {
		Thread.sleep(1000);
		checkBox.click();
	}

	public void continueButton() throws InterruptedException {
		Thread.sleep(1000);
		Continue.click();
	}

	public void otp() throws InterruptedException {
		Thread.sleep(1000);
		Otp.click();
		Thread.sleep(1000);
		Otp.sendKeys("1111");
	}

	public void firstName() throws InterruptedException {
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys("Pilli");
	}

	public void lastName() throws InterruptedException {
		Thread.sleep(1000);
		LastName.click();
		Thread.sleep(1000);
		LastName.sendKeys("LakshmanRao");
	}

	public void email() throws InterruptedException {
		email.click();
		Thread.sleep(1000);

		String emailId = generateRandomEmail();
		Thread.sleep(1000);
		email.sendKeys(emailId);
		Thread.sleep(1000);
		/// email.sendKeys("lakshmaan9549@yopmail.com");
	}

	public void done() throws InterruptedException {
		Thread.sleep(3000);
		Done.click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//div[text()='Brands']")
	private WebElement BrandsDropdown;

	@FindBy(xpath = "//p[text()='Emani']")
	private WebElement EmaniOption;

	@FindBy(xpath = "//div[@class='jsx-c3ec2b6b129f087d card_content_wrapper pt-0']")
	private List<WebElement> ListOfProducts;

	@FindBy(xpath = "(//span[contains(text(), 'Skin')])")
	private WebElement Product;
//
//	    public TaskTruly_In() {
//	        PageFactory.initElements(driver, this);
//	    }

	public void brandsDropdown() throws InterruptedException {

		Actions actions = new Actions(driver);

		Thread.sleep(1000);
//	        wait.until(ExpectedConditions.visibilityOf(BrandsDropdown));
		actions.moveToElement(BrandsDropdown).perform();
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		Thread.sleep(1000);
//        wait.until(ExpectedConditions.elementToBeClickable(EmaniOption));
		actions.moveToElement(EmaniOption).click().perform();
//	    	BrandsDropdown.click();
//	    	Thread.sleep(1000);
//	    	EmaniOption.click();

		Thread.sleep(5000);
	}

	public void listOfProducts() throws InterruptedException {
		Thread.sleep(1000); // Consider using explicit wait instead of Thread.sleep
		List<String> productNames = new ArrayList<>();

		for (WebElement product : ListOfProducts) {
			String productName = product.getText();
			productNames.add(productName);
			System.out.println(productName);
		}

		writeDataToExcel("products.xlsx", "Products", productNames);
		Thread.sleep(3000); // Consider using explicit wait instead of Thread.sleep

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,150)");
		Product.click();
		Thread.sleep(3000);
	}

	public void writeDataToExcel(String fileName, String sheetName, List<String> data) {
		try (Workbook workbook = new XSSFWorkbook()) {
			Sheet sheet = workbook.createSheet(sheetName);
			int rowNum = 0;
			for (String rowData : data) {
				Row row = sheet.createRow(rowNum++);
				Cell cell = row.createCell(0);
				cell.setCellValue(rowData);
			}

			try (FileOutputStream fileOut = new FileOutputStream(
					"C:\\Users\\laksh\\eclipse-workspace\\TrulyfreehomeProject\\src\\main\\resources\\ProductList.xlsx")) {
				workbook.write(fileOut);
				System.out.println("Excel file created successfully!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//select[@class='jsx-f7424bbc83273932 timeline flex-grow-1']")
	private WebElement QuantityDropDown;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement AddToKart;

	@FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/header/div[1]/div[3]/div[1]/ul/li[5]/a")
	private WebElement AddToIcon;

	@FindBy(xpath = "//h1[@class='title d-none d-md-block']")
	private WebElement ProductVerify;

	@FindBy(xpath = "//div[@class='detail_wrapper col pr-0']")
	private WebElement ProductDetailsVerify;

	@FindBy(xpath = "(//a[text()='Proceed to Checkout'])[1]")
	private WebElement ProccedCheckout;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement FirstNameP;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement LastNameP;

	@FindBy(xpath = "//div[@class='selected-flag']")
	private WebElement CountryIcon;

	@FindBy(xpath = "(//span[text()='India (भारत)'])[1]")
	private WebElement SelectCountry;

	@FindBy(xpath = "(//input[@type='tel'])")
	private WebElement EnterPhone;
	@FindBy(xpath = "(//input[@name='addLine1'])")
	private WebElement EnterAddress;

	@FindBy(xpath = "(//input[@name='pincode'])")
	private WebElement EnterZipcode;

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement ContinueButtonP;
	@FindBy(xpath = "//button[text()='+Add a new card']")
	private WebElement AddNewCard;
	@FindBy(xpath = "//input[@placeholder='Name on the card']")
	private WebElement NameCard;
	@FindBy(id = "card_number")
	private WebElement CardNo;
	@FindBy(id = "cvv")
	private WebElement CVV;
	// label[text()='Card Number']/following-sibling::input
	@FindBy(xpath = "//input[@placeholder='MM']")
	private WebElement Month;
	@FindBy(xpath = "//input[@placeholder='YYYY']")
	private WebElement YearYYY;

	@FindBy(xpath = "//button[text()='Add Card']")
	private WebElement AddCard;
	@FindBy(xpath = "//button[text()='Confirm Order & Checkout']")
	private WebElement ConfirmOrder;

	@FindBy(className = "close_icon")
	private WebElement CloseIcon;
//	    @FindBy(xpath = "//button[text()='Continue']")
//	    WebElement ContinueButtonP;
//	    
//	    @FindBy(xpath = "//button[text()='Continue']")
//	    WebElement ContinueButtonP;
//	    @FindBy(xpath = "//button[text()='Continue']")
//	    WebElement ContinueButtonP;
//	    

//	    public void  quantityDropDown() throws InterruptedException{
//			Thread.sleep(1000);
//			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		    //wait.until(ExpectedConditions.elementToBeClickable(QuantityDropDown)).click();
//		    Select sel = new Select(QuantityDropDown);
//		    sel.selectByIndex(1);
//		}

	public void addToKart() throws InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddToKart);
		Thread.sleep(1000);
		AddToKart.click();
	}

	public void addToIcon() throws InterruptedException {
		Thread.sleep(2000);
		AddToIcon.click();
	}

	public void productDetailsVerify() throws InterruptedException {
		Thread.sleep(1000);
		ProductDetailsVerify.click();
		if (ProductDetailsVerify.isDisplayed()) {
			System.out.println("Produt details verifyed Succussfully");
		} else {
			System.out.println("Produt details verification Failed");
		}
	}

	public void proccedCheckout() throws InterruptedException {
		Thread.sleep(1000);
		ProccedCheckout.click();
	}

	public void firstNameP() throws InterruptedException {
		Thread.sleep(1000);
		FirstNameP.click();

		FirstNameP.sendKeys("Lakshman");
	}

	public void lastNameP() throws InterruptedException {
		Thread.sleep(1000);
		LastNameP.click();
		Thread.sleep(1000);
		LastNameP.sendKeys("arts");
	}

	public void countryIcon() throws InterruptedException {
		Thread.sleep(1000);
		CountryIcon.click();
	}

	public void selectCountry() throws InterruptedException {
		Thread.sleep(1000);
		SelectCountry.click();
	}

	public void enterPhone() throws InterruptedException {
		Thread.sleep(1000);
		EnterPhone.click();
		Thread.sleep(1000);
		EnterPhone.sendKeys("9010718709");
	}

	public void enterAddress() throws InterruptedException {
		Thread.sleep(1000);
		EnterAddress.click();
		Thread.sleep(1000);
		EnterAddress.sendKeys("24 Battery PI");
	}

	public void enterZipcode() throws InterruptedException {
		Thread.sleep(1000);
		EnterZipcode.click();
		Thread.sleep(1000);
		EnterZipcode.sendKeys("10004");
		Thread.sleep(1000);
	}

	public void continueButtonP() throws InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ContinueButtonP);
		ContinueButtonP.click();
		Thread.sleep(3000);
	}

	public void addNewCard() throws InterruptedException {
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddNewCard);
		AddNewCard.click();
	}

	public void nameCard() throws InterruptedException {
		Thread.sleep(2000);
		NameCard.click();
		Thread.sleep(1000);
		NameCard.sendKeys("debit card");
	}
//	    public void switchToIframe() {
//	        WebDriverWait wait = new WebDriverWait(driver, 15);
//	        
//	        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("spreedly-number-frame-9768")));
//	    }

//	    public void switchToDefaultContent() {
//	        driver.switchTo().defaultContent();
//	    }
	public void cardNumber() {
		// WebDriverWait wait = new WebDriverWait(driver, 10);

//	        wait.until(ExpectedConditions.visibilityOf(CardNo));
//	        wait.until(ExpectedConditions.elementToBeClickable(CardNo));

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'spreedly-number-frame')]")));
		CardNo.sendKeys("4242 4242 4242 4242");

		driver.switchTo().defaultContent();
	}

	public void cVVnumber() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'spreedly-cvv-frame')]")));
		CVV.sendKeys("111");

		driver.switchTo().defaultContent();

	}

	public void month() throws InterruptedException {
		Thread.sleep(2000);
		Month.click();
		Thread.sleep(1000);
		Month.sendKeys("5");
	}

	public void yearYYY() throws InterruptedException {
		Thread.sleep(2000);
		YearYYY.click();

		YearYYY.sendKeys("2026");
	}

	public void addCard() throws InterruptedException {
		Thread.sleep(2000);
		AddCard.click();
	}

	public void confirmOrder() throws InterruptedException {
		Thread.sleep(3000);
		ConfirmOrder.click();

	}

	public void closeIcon() throws InterruptedException {
		Thread.sleep(3000);
		CloseIcon.click();

		Thread.sleep(15000);
	}

}
