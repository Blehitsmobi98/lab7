package xpathfolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class xpaths {
	WebDriver driver;
	public xpaths(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[contains(@id,'vchLogin_Name')]")
	public
	WebElement username;


    @FindBy (xpath="//input[contains(@id,'vchPassword')]")
	public
    WebElement password;
    
    @FindBy (xpath="//button[contains(text(),'Login')]")
   	public
       WebElement loginButton;
    
    @FindBy (xpath="//img[contains(@id,'patientBtn')]")
   	public
       WebElement patientButton;
    
    @FindBy (xpath="//td[contains(@title,'Add Patient')]")
   	public
       WebElement addPatient;
    
    @FindBy (xpath="//select[contains(@id,'cmbVTitle')]//option[contains(text(),'Mr')]")
   	public
       WebElement selectTitle;
    
    @FindBy (xpath="//input[contains(@id,'txtVFNAME')]")
   	public
       WebElement firstName;
    
    @FindBy (xpath="//input[contains(@id,'txtVLNAME')]")
   	public
       WebElement lastName;
    
    @FindBy (xpath="//select[contains(@id,'cmbVSEX')]//option[contains(text(),'M')]")
   	public
       WebElement selectGender;
    
    @FindBy (xpath="//input[contains(@id,'txtDDOB')]")
   	public
       WebElement DOB;
    
    @FindBy (xpath="//select[contains(@name,'cmbILOCID')]//child::option[(@value='8')]")
   	public
       WebElement location;
    
    @FindBy (xpath="//td[contains(@id,'tdsave')]")
   	public
       WebElement save;
    
    @FindBy (xpath="//iframe[contains(@id,'DynamicBHdialogbox')]")
   	public
       WebElement frame3;

    
    @FindBy (xpath="//button[contains(@id,'saveAsNewButton')]")
   	public
       WebElement saveAsNew;

    
}