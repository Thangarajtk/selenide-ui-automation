package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;
import com.orangehrm.entity.EmployeeDetails;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public final class EmployeeInformationPage {

    private static final SelenideElement ADD_EMPLOYEE_BUTTON = $(byTagAndText("a", "Add Employee"));
    private static final SelenideElement FIRST_NAME = $(byName("firstName"));
    private static final SelenideElement LAST_NAME = $(byName("lastName"));
    private static final SelenideElement MIDDLE_NAME = $(byName("middleName"));
    private static final SelenideElement SAVE_BUTTON = $(byText("Save"));
    private static final SelenideElement IMAGE = $(byAttribute("type", "file"));
    private static final SelenideElement SUCCESS_MESSAGE = $(byText("Success"));

    public EmployeeInformationPage addNewEmployee(EmployeeDetails employeeDetails) {
        ADD_EMPLOYEE_BUTTON.shouldBe(enabled).click();
        FIRST_NAME.shouldBe(visible).setValue(employeeDetails.getFirstName());
        MIDDLE_NAME.shouldBe(visible).setValue(employeeDetails.getLastName());
        LAST_NAME.shouldBe(visible).setValue(employeeDetails.getMiddleName());
        IMAGE.shouldBe(enabled).uploadFromClasspath("image.jpg");
        SAVE_BUTTON.shouldBe(enabled).click();
        return this;
    }

    public void checkWhetherEmployeeCreatedSuccessfully() {
        SUCCESS_MESSAGE.shouldHave(visible, text("Success"));
    }

}
