public class PrimitiveCharacters {
    public static void main(String[] args) {

        char character = '\u0040'; // usamos un solo caracter, con mas de 1 caracter va a marcar error ya que es un string
        char decimalChar = 64;
        char simbChar = '@';
        System.out.println("character = " + character);
        System.out.println("decimalChar = " + decimalChar);
        System.out.println("(decimalChar == character) = " + (decimalChar == character));
        System.out.println("(character == simbChar) = " + (simbChar == character));

    }
}
