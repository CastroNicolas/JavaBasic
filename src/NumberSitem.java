import javax.swing.*;

public class NumberSitem {
    public static void main(String[] args) {
        String numberStirg = JOptionPane.showInputDialog(null, "Enter a Number");//input
        int numerDecim = Integer.parseInt(numberStirg);//parseInt = combierto un string en numero
        System.out.println("numerDecim = " + numerDecim);
        System.out.println("binary number = " + numerDecim + " = " + Integer.toBinaryString(numerDecim));

        int numerbinary = numerDecim;
        System.out.println("numerbinary = " + numerbinary);
        System.out.println("numer Octal = " + numerbinary + " = " + Integer.toOctalString(numerDecim));
        // numer octal = 0764 = 500 (hay que poner 0 por delante)
        // numer hexadecimal = 0x1f4 = 500 (hay que poner 0x por delante)
        //String messaje = "binary Number:" + numerbinary + " = " + Integer.toHexString(numerDecim)
        //messaje +="numer Octal = " + numerbinary + " = " + Integer.toOctalString(numerDecim)
        //JOptionPane.showMessageDialog(null, messaje);
        //Para bajar una linea \n al principio del string
        //_____________________________________________________________________________________________
    }
}
