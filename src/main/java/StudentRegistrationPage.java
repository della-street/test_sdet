import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentRegistrationPage {
    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;
    @FindBy(css = "input[placeholder='name@example.com']")
    private WebElement email;
    @FindBy(css = "label[for='gender-radio-1']")
    private WebElement genderRadioButton;
    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement mobileNumber;
    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirthField;
    @FindBy(xpath = "//div[@aria-label='Choose Sunday, September 17th, 2023']")
    private WebElement dateOfBirthPicker;
    @FindBy(id = "subjectsInput")
    private WebElement subjectsField;
    @FindBy(xpath = "//div[contains(@class,'menu-is-open')]")
    private WebElement inputSubjects;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPictureButton;
    @FindBy(xpath = "//textarea[@placeholder]")
    private WebElement currentAddressField;
    @FindBy(id = "submit")
    private WebElement submitButton;



    public StudentRegistrationPage inputFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
        return this;
    }
    public StudentRegistrationPage inputLastName(String lastName) {
        this.lastName.sendKeys(lastName);
        return this;
    }
    public StudentRegistrationPage inputEmail(String email) {
        this.email.sendKeys(email);
        return this;
    }
    public StudentRegistrationPage clickGenderButton() {
        this.genderRadioButton.click();
        return this;
    }
    public StudentRegistrationPage inputMobileNumber(String mobileNumber) {
        this.mobileNumber.sendKeys(mobileNumber);
        return this;
    }
    public StudentRegistrationPage clickDateOfBirthField() {
        this.dateOfBirthField.click();
        return this;
    }
    public StudentRegistrationPage chooseDateOfBirth(){
        this.clickDateOfBirthField().dateOfBirthPicker.click();
        return this;
    }
    public StudentRegistrationPage inputCurrentAddress(String currentAddress){
        this.currentAddressField.sendKeys(currentAddress);
        return this;
    }
    public StudentRegistrationPage chooseSubjectsField(){
        this.subjectsField.click();
        return this;
    }
    public StudentRegistrationPage inputSubjectsField(String subjects){
        this.inputSubjects.sendKeys(subjects);
        return this;
    }
//нажать чузсабджектфилд, ввести инпут, нажать просто энтер - такой метод?
    public StudentRegistrationPage clickSubmitButton(){
        this.submitButton.click();
        return this;
    }


}
