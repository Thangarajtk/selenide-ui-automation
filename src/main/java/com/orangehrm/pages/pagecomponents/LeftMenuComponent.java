package com.orangehrm.pages.pagecomponents;

import com.orangehrm.enums.LeftMenuComponentType;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LeftMenuComponent {

    public void selectMenuFromLeftMenuComponent(LeftMenuComponentType leftMenuComponentType) {
        $(byText(leftMenuComponentType.getMenuName()))
                .shouldBe(visible).click();
    }
}
