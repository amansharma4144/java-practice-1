import java.util.*;
import java.lang.*;

class TypeOfCharacter {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner ini = new Scanner(System.in);
        char a = ini.next().charAt(0);

        if (a >= 'A' && a <= 'Z')
            System.out.println("\nCapital");

        else if (a >= 'a' && a <= 'z')
            System.out.println("\nSmall");

        else if (a >= '0' && a <= '9')
            System.out.println("\nNumber");

        else
            System.out.println("\nSpecial Character");

    }
}
