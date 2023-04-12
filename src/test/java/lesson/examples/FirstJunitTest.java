package lesson.examples;

import org.junit.jupiter.api.*;

public class FirstJunitTest {

    //перед всеми тестами в классе
    @BeforeAll
    static void beforeAll(){
        System.out.println("#### @Test beforeAll()");
    }

    //после всех тестов в классе
    @AfterAll
    static void AfterAll(){
        System.out.println("#### @Test afterAll()");
    }

    //перед каждым тестом в классе
    @BeforeEach
    void beforeEach(){
        System.out.println("    #### @Test beforeEach()");
    }

    //после каждого теста в классе
    @AfterEach
    void afterEach(){
        System.out.println("    #### @Test afterEach()");
    }

    @Test
    void firstTest() {
        Assertions.assertTrue(3 > 2);
        System.out.println("        #### @Test firstTest()");
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(3 > 2);
        System.out.println("        #### @Test secondTest()");
    }
}
