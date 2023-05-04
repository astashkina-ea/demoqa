package simple.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple") //для запуска конкретных тестов (в build.gradle необходимо прописать также)
public class NegativeTests {

    @Test
    @Tag("not_simple")
    void someTest() {
        assertTrue(false);
    }

    @Test
    void someTest1() {
        assertTrue(false);
    }

    @Test
    void someTest2() {
        assertTrue(false);
    }

    @Test
    void someTest3() {
        assertTrue(false);
    }

    @Test
    void someTest4() {
        assertTrue(false);
    }

    @Test
    void someTest5() {
        assertTrue(false);
    }

    @Test
    void someTest6() {
        assertTrue(false);
    }

}
