package nivell1.Exercici1;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

class Ex1Test {

    private ArrayList<String> mes;

    @BeforeAll
    public static void setupAll() {
        System.out.println("Test Junit, Tasca 4 Sprint 1");
    }

    @BeforeEach
    public void setup(){
        System.out.println("Instantiating new ArrayList");
        mes = new ArrayList<String>();
    }

    @Test
    @DisplayName("Should check if ArrayList is properly created")
    void shouldDoInitialTest() {
        Assertions.assertNotNull(mes);
        Assertions.assertEquals(0, mes.size());
    }

    @Test
    @DisplayName("Should populate ArrayList")
    void shouldCheckIfFilled() {
        mes.add("Gener");
        Assertions.assertEquals(1, mes.size());

    }

    @Test
    @DisplayName("Should fill all the items ArrayList")
    void shouldCheckIfFilledForTheHoleValue() {
        mes.add("Gener");
        mes.add("Febrer");
        mes.add("Març");
        mes.add("Abril");
        mes.add("Maig");
        mes.add("Juny");
        mes.add("Juliol");
        mes.add("Agost");
        mes.add("Setembre");
        mes.add("Octubre");
        mes.add("Novembre");
        mes.add("Desembre");
        Assertions.assertEquals(12, mes.size());
        Assertions.assertNotNull(mes);
    }

    @Test
    @DisplayName("Should match returned with position number")
    void matchReturnWithPosition(){
        mes.add("Gener");
        mes.add("Febrer");
        mes.add("Març");
        mes.add("Abril");
        mes.add("Maig");
        mes.add("Juny");
        mes.add("Juliol");
        mes.add("Agost");
        mes.add("Setembre");
        mes.add("Octubre");
        mes.add("Novembre");
        mes.add("Desembre");


        Assertions.assertEquals("Agost", this.mes.get(7));

    }

}