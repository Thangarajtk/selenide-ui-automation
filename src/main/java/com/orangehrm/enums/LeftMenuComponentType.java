package com.orangehrm.enums;

public enum LeftMenuComponentType {

    ADMIN("Admin"),
    PIM("PIM");

    private String menuName;

    LeftMenuComponentType(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return menuName;
    }
}
