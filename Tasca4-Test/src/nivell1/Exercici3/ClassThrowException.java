package nivell1.Exercici3;

public class ClassThrowException {

    public static boolean Throw() throws ArrayIndexOutOfBoundsException{
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void main (String[] args){
        Throw();
    }

}
