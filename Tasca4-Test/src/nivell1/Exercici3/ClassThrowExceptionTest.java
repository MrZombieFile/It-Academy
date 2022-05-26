package nivell1.Exercici3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClassThrowExceptionTest {

    @Test
    @DisplayName("Should throw an ArraIndexOutOfBounds exception")
    void ThrowArrayIndexOutOfBounds(){

        ArrayIndexOutOfBoundsException thrown = assertThrows(ArrayIndexOutOfBoundsException.class, ()->ClassThrowException.Throw());


    }
}