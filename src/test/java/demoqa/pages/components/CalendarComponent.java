package demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

public class CalendarComponent {

    private SelenideElement
            monthSelect = $(".react-datepicker__month-select"),
            yearSelect = $(".react-datepicker__year-select");

    private String dayPickerLocator = ".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)";

    public void setDate(String day, String month, String year) {
        monthSelect.selectOption(month);
        yearSelect.selectOption(year);
        $(format(dayPickerLocator, day)).click();
    }
}