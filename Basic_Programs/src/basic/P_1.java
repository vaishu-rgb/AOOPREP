package basic;

public class P_1 {
    public static void main(String[] args) {
        //primitive data types
        byte a = 5;
        short s = 100;
        int n = 5000;
        long l = 10000;
        float f = 5.5f;
        double d = 10.5;
        char c = 'a';
        boolean b = true;

        // Printing sizes using wrapper class 
        System.out.println("Size : " + Byte.SIZE + " bits" + " Value" + " " + a);
        System.out.println("Size : " + Short.SIZE + " bits" + " Value" +" " + s);
        System.out.println("Size : " + Integer.SIZE + " bits" + " Value" +" " + n);
        System.out.println("Size : " + Long.SIZE + " bits" + " Value" + " " +l);
        System.out.println("Size : " + Float.SIZE + " bits"+ " Value" + " " +f);
        System.out.println("Size : " + Double.SIZE + " bits" + " Value" + " " +d);
        System.out.println("Size : " + Character.SIZE + " bits"+ " Value" +" " + c);
        System.out.println("Value" + " " +b);
    }
}