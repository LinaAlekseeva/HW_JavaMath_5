public class Main {
    public static void main(String[] args) {

    int a = 34;
    int b = 53;
    byte c = 125;
    double d = 1.5;

    // Mathematical operators
    int result_1 = a + b - 1 * a / 2;
        System.out.println("Mathematical operators: " +result_1);
    // Boolean operators
        if (a != 0 && b < 1000) {
            System.out.println("Boolean operators");
        }
    //Overflows in calculations of the Byte type
        byte result_3 = c * 5;
        System.out.println("Overflows in calculations of the Byte type: " + result_3);
    //Combinations of data types (int and double)
      double result_5 = a + d + (b / 2);
        System.out.println( "Combinations of data types (int and double): " + result_5);
}
}
