package com.orangehrm.tests;

import com.orangehrm.entity.EmployeeDetails;
import com.orangehrm.entity.LoginDetails;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testdata.EmployeeTestData;
import com.orangehrm.testdata.LoginTestData;
import com.orangehrm.tests.base.TestSetUp;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

class AddEmployeeTest extends TestSetUp {

    private final EmployeeDetails employee = EmployeeTestData.getRandomEmployeeDetails();
    private final LoginDetails login = LoginTestData.getValidLoginDetails();

    @Test
    void testAddEmployee() {
        LoginPage.getInstance()
                .loginToApplication(login)
                .navigateToEmployeeInformationPage()
                .addNewEmployee(employee)
                .checkWhetherEmployeeCreatedSuccessfully();
    }
}
