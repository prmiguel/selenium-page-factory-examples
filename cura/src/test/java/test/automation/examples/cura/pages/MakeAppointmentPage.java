package test.automation.examples.cura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MakeAppointmentPage {

    @FindBy(css = "#combo_facility")
    private WebElement facilityDropdown;

    @FindBy(css = "#chk_hospotal_readmission")
    private WebElement hospitalReadmissionCheckbox;

    @FindBy(css = "#txt_visit_date")
    private WebElement visitDateTextField;

    @FindBy(css = "#txt_comment")
    private WebElement commentTextArea;

    @FindBy(css = "#btn-book-appointment")
    private WebElement bookAppointmentButton;

    @FindBy(css = "[name='programs']")
    private List<WebElement> programs;

    public MakeAppointmentPage(WebDriver wd) {
        PageFactory.initElements(wd, this);
    }

    public void selectFacility(String facility) {
        Select selectFacility = new Select(facilityDropdown);
        selectFacility.selectByValue(facility);
    }

    public void applyForHospitalReadmission() {
        hospitalReadmissionCheckbox.click();
    }

    public void chooseHealthcareProgram(String program) {
        programs.stream()
                .filter(e -> e.getAttribute("value").equals(program))
                .findFirst().get().click();
    }

    public void scheduleVisitDate(String date) {
        visitDateTextField.sendKeys(date);
    }

    public void addCommentForAppointment(String comment) {
        commentTextArea.sendKeys(comment);
    }

    public void bookAppointment() {
        bookAppointmentButton.click();
    }
}
