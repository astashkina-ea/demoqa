package properties.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void systemProperties0Test() {
        String browser = System.getProperty("browser");
        System.out.println(browser); //null
    }

    @Test
    void systemProperties1Test() {
        System.setProperty("browser","chrome");//не использ в тестах
        String browser = System.getProperty("browser");
        System.out.println(browser); //chrome
    }

    @Test
    void systemProperties2Test() {
        String browser = System.getProperty("browser", "mozilla"); //mozilla - дефолт
        System.out.println(browser); //mozilla
    }

    @Test
    void systemProperties3Test() {
        System.setProperty("browser","chrome");
        String browser = System.getProperty("browser", "mozilla");
        System.out.println(browser); //chrome
    }

    @Test
    @Tag("property")
    void systemProperties4Test() {
        String browser = System.getProperty("browser", "mozilla"); //mozilla - дефолт
        System.out.println(browser); //mozilla
    }
}
