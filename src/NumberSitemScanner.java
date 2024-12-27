import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSitemScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number!");
//        String numberString = scanner.nextLine();
        int numberDecim = 0;
        try {
            numberDecim = scanner.nextInt(); // Integer.parseInt(numberString);
        }catch (InputMismatchException e){
            System.out.println("Error you need write a Number!");
            main(args);
            System.exit(0);
        }
        System.out.println("numberDecimal = " + numberDecim);
        String resultBinary = "Number Binary that = " + numberDecim + " = " + Integer.toBinaryString(numberDecim);
        String resultOctal = "Number OCtal that = " + numberDecim + " = " + Integer.toOctalString(numberDecim);
        String resultHexa = "Number Hexa that = " + numberDecim + " = " + Integer.toHexString(numberDecim);

        String message = resultBinary;
        message += "\n" + resultOctal;
        message += "\n" + resultHexa;

        System.out.println(message);
    }

}
