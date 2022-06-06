package nivell1.Exercici2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculoDniTest {
    private int numero;
    private String lletra;
    private String expected;

    public CalculoDniTest(int numero, String lletra, String expected){
        this.numero = numero;
        this.lletra = lletra;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection numerosDni(){
        return Arrays.asList(new Object[][]{
                {12345678, "Z", "Z"}, {22345678, "M", "M"}, {52913419, "X", "X"}, {65004204, "V", "V"}, {83733552, "M", "M"}, {12119900, "G", "G"}, {36355244, "H", "H"}, {12823771, "Y", "Y"}, {38347266, "X", "X"}, {12312345, "P", "P"}
        });
    }

    @Test
    public void testCalculoDni(){
        CalculoDni nouDni = new CalculoDni(numero);
        assertEquals(nouDni.getLletraDni(), expected);
    }



}