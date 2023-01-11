package com.orangehrm.pages;

import com.orangehrm.pages.pagecomponents.LeftMenuComponent;

import static com.orangehrm.enums.LeftMenuComponentType.PIM;

public final class HomePage {

    private final LeftMenuComponent leftMenuComponent;

    public HomePage() {
        leftMenuComponent = new LeftMenuComponent();
    }

    public LeftMenuComponent getLeftMenuComponent() {
        return leftMenuComponent;
    }

    public EmployeeInformationPage navigateToEmployeeInformationPage() {
        this.getLeftMenuComponent().selectMenuFromLeftMenuComponent(PIM);
        return new EmployeeInformationPage();
    }
}
