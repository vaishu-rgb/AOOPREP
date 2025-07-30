package basic;

public class P_3 {
    public static void main(String[] args) {
        int intVal = 123456789;          
        long longVal = intVal;           
        float floatVal = longVal;        

        System.out.println("----- Widening Type Conversion -----");
        System.out.println("int value   : " + intVal);
        System.out.println("long value  : " + longVal);
        System.out.println("float value : " + floatVal);

        if (intVal == longVal && longVal == (long) floatVal) {
            System.out.println("\n No data loss during conversion.");
        } else {
            System.out.println("\n Possible data loss detected!");
        }
    }
}