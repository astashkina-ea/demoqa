package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationsFormResultComponent {

    private SelenideElement modal = $(".modal-dialog"),
            modalTitle = $("#example-modal-sizes-title-lg"),
            tableResult = $(".table-responsive");

    public RegistrationsFormResultComponent verifyModalAppears(String value) {
        modal.should(appear);
        modalTitle.shouldHave(text(value));
        return this;
    }

    public RegistrationsFormResultComponent verifyResult(String key, String value) {
        tableResult.$(byText(key)).sibling(0).shouldHave(text(value));
        return this;
    }
}