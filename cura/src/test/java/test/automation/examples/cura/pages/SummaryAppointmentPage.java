package test.automation.examples.cura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryAppointmentPage {

    @FindBy(css = "#facility")
    private WebElement facilityLabel;

    @FindBy(css = "#hospital_readmission")
    private WebElement hospitalReadmissionLabel;

    @FindBy(css = "#program")
    private WebElement programLabel;

    @FindBy(css = "#visit_date")
    private WebElement visitDateLabel;

    @FindBy(css = "#comment")
    private WebElement commentLabel;

    public SummaryAppointmentPage(WebDriver wd) {
        PageFactory.initElements(wd, this);
    }

    public String displayedFacility() {
        return facilityLabel.getText();
    }

    public String displayedHospitalReadmission() {
        return hospitalReadmissionLabel.getText();
    }

    public String displayedHealthcareProgram() {
        return programLabel.getText();
    }

    public String displayedVisitDate() {
        return visitDateLabel.getText();
    }

    public String displayedComment() {
        return commentLabel.getText();
    }
}
