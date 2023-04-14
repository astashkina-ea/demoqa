package demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static demoqa.data.FieldsRegistrationsModal.sizesTitleField;

public class ResultsRegistrationsModal {

    private SelenideElement
            modal = $(".modal-dialog"),
            modalTitle = $("#example-modal-sizes-title-lg"),
            tableResult = $(".table-responsive");

    public void verifyModalAppears() {
        modal.should(appear);
        modalTitle.shouldHave(text(sizesTitleField));
    }

    public void verifyResult(String key, String value) {
        tableResult.$(byText(key)).sibling(0).shouldHave(text(value));
    }
}