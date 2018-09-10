import java.util.*;
import java.lang.*;

public class EvenOrOddChecker {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner ini = new Scanner(System.in);
        int num = ini.nextInt();

        EvenOrOddChecker instance1 = new EvenOrOddChecker();;
        System.out.println("\n"+instance1.evenOrOdd(num)+"\n");
    }


    public String evenOrOdd(int num){

        if (num % 2 == 0 && (num > 20 && num < 30)) {
            return "Jerry";
        }

        if (num % 2 != 0 && (num > 20 && num < 30)) {
            return "Tom";
        }

        return "null";
    }

}