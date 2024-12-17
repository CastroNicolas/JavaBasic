public class PrimitiveNumbers {
    public static void main(String[] args) {
        byte numberByte = 67; //Between -128 to 127
        System.out.println("numberByte = " + numberByte);
        System.out.println("byte type corresponds to byte in = " + Byte.BYTES);
        System.out.println("byte type corresponds to bit in = " + Byte.SIZE);

        System.out.println("Max value in byte = " + Byte.MAX_VALUE);
        System.out.println("Min value in byte = " + Byte.MIN_VALUE);

        short numerShort = 3000; // Between -32768 to 32767
        System.out.println("numerShort = " + numerShort);
        System.out.println("short type corresponds to byte in = " + Short.BYTES);
        System.out.println("short type corresponds to bit in = " + Short.SIZE);

        System.out.println("Max value in short = " + Short.MAX_VALUE);
        System.out.println("Min value in short = " + Short.MIN_VALUE);

        int numerInt = 300000000; // Between -2147483648 to 2147483647
        System.out.println("numerInt = " + numerInt);
        System.out.println("int type corresponds to byte in = " + Integer.BYTES);
        System.out.println("int type corresponds to bit in = " + Integer.SIZE);

        System.out.println("Max value in int = " + Integer.MAX_VALUE);
        System.out.println("Min value in int = " + Integer.MIN_VALUE);

    }
}
