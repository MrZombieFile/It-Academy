package nivell1.Exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    @Test
    @DisplayName("Should check everything is ok before to start using the object extended from CalculoDNI")
    void everythingOk(){
        CalculoDni DNI = new CalculoDni(12345678);
        Assertions.assertNotEquals(null, DNI);
        Assertions.assertEquals(12345678 , DNI.getNumeroDni());
    }

    @Test
    void obtenirLletra() {
        CalculoDni DNI = new CalculoDni(12345678);
        Assertions.assertEquals("Z", DNI.obtenirLletra());
        CalculoDni DNI2 = new CalculoDni(22345678);
        Assertions.assertEquals("M", DNI2.obtenirLletra());
        CalculoDni DNI3 = new CalculoDni(52913419);
        Assertions.assertEquals("X", DNI3.obtenirLletra());
        CalculoDni DNI4 = new CalculoDni(65004204);
        Assertions.assertEquals("V", DNI4.obtenirLletra());
        CalculoDni DNI5 = new CalculoDni(83733552);
        Assertions.assertEquals("M", DNI5.obtenirLletra());
        CalculoDni DNI6 = new CalculoDni(12119900);
        Assertions.assertEquals("G", DNI6.obtenirLletra());
        CalculoDni DNI7 = new CalculoDni(36355244);
        Assertions.assertEquals("H", DNI7.obtenirLletra());
        CalculoDni DNI8 = new CalculoDni(12823771);
        Assertions.assertEquals("Y", DNI8.obtenirLletra());
        CalculoDni DNI9 = new CalculoDni(38347266);
        Assertions.assertEquals("X", DNI9.obtenirLletra());
        CalculoDni DNI10 = new CalculoDni(12312345);
        Assertions.assertEquals("P", DNI10.obtenirLletra());

    }
}