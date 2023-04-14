package examples;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void cssXpathExamples() {
        //спец тестовый атрибут
        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");

        //id
        // <input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("[id=email]").setValue("1");
        $("#email").setValue("1");
        $("input#email").setValue("1");
        $(byId("email")).setValue("123");
        $(By.id("email")).setValue("123");
        $x("//input[@id='email']").setValue("1");
        $(byXpath("//input[@id='email']")).setValue("1");

        //name
        // <input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]").setValue("1");
        $(byName("email")).setValue("1");

        //class
        // <input type="email" class="inputtext login_form_input_box">
        $("[class=login_form_input_box]").setValue("1");
        $(".login_form_input_box").setValue("1");
        $(".inputtext.login_form_input_box").setValue("1");
        $("input.inputtext.login_form_input_box").setValue("1");
        $x("//input[@class='login_form_input_box']").setValue("123");
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("1");

        //если нужно достучаться до вложенного элемента
        // <div class="inputtext">
        //      <input type="email" class="login_form_input_box">
        // </div>
        $(".inputtext .login_form_input_box").setValue("1");
        $("div.inputtext input.login_form_input_box").setValue("1");
        $("div.inputtext").$("input.login_form_input_box").setValue("1");

        //все локаторы выше по максимум
        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("input.inputtext.login_form_input_box#email[name=email][data-testid=email]").setValue("123");

        //по тексту
        // <div>Hello, qa.guru!</div>
        $x("//div[text()='Hello, qa.guru!']").click();
        $x("//div[contains(text(), 'ello qa.gur')]");
        $x("//div[text()[contains(.,'ello qa.gur')]]");
        $(byText("Hello, qa.guru!")).click();
        $(withText("lo, qa.gur")).click();
    }
}