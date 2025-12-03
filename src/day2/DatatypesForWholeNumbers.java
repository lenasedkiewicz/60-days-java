package day2;

public class DatatypesForWholeNumbers {
    // byte, short, int, long
    // byte => 8 bit -> eight digit in binary number = -128 to 127 - stores 256 values
    // stores 2 to 8 power, and numbers vary from -(2 to power 7) to 2 to power 7 minus one
    private static byte age = (byte) 128;
    // private static byte age5 = 128; java: incompatible types: possible lossy conversion from int to byte
    private static byte age2 = 127;
    private static byte age3 = (byte) 127;
    private static byte age4 = (byte) -127;
    static void main(){
        System.out.println(age); // -128
        System.out.println(age2); // 127
        System.out.println(age3); // 127
        System.out.println(age4); // -127
    }
}
