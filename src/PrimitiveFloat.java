public class PrimitiveFloat {

    //static float varFloat; // in default = 0.0
    static float varFloat = 45.55f;

    public static void main(String[] args) {
        float numberFloat = 1.5e4f; //15000f // Between 1.4E-45 to 3.4028235E38
        float negativeNumberFloat = 1.5e-10f; //0.00000000015f
        System.out.println("numberFloat = " + numberFloat);
        System.out.println("negativeNumberFloat = " + negativeNumberFloat);

        System.out.println("numberFloat = " + numberFloat);
        System.out.println("float type corresponds to byte in = " + Float.BYTES);
        System.out.println("float type corresponds to bit in = " + Float.SIZE);

        System.out.println("Max value in float = " + Float.MAX_VALUE);
        System.out.println("Min value in float = " + Float.MIN_VALUE);
        
        double numberDouble = 3.423243E3; // Between 4.9E-324c to 1.7976931348623157E308
        System.out.println("numberDouble = " + numberDouble);
        System.out.println("double type corresponds to byte in = " + Double.BYTES);
        System.out.println("double type corresponds to bit in = " + Double.SIZE);

        System.out.println("Max value in double = " + Double.MAX_VALUE);
        System.out.println("Min value in double = " + Double.MIN_VALUE);
        System.out.println("varFloat = " + varFloat);
    }
}
