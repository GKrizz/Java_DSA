public class PrimitiveDataType {
    public static void main(String[] args) {
        // Integer example (4 bytes)
        int a = 2147483647 + 1;
        System.out.println("Integer overflow result: " + a);

        // Integer example (4 bytes)
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);

        // Float example (4 bytes)
        float b = 1.0f; // Declare a float using 'f' suffix
        System.out.println("Float MIN_VALUE: " + Float.MIN_VALUE);
        System.out.println("Float MAX_VALUE: " + Float.MAX_VALUE);

        // Double example (8 bytes)
        double c = 3.42; // Declare a double (default type for decimals in Java)
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Double MAX_VALUE: " + Double.MAX_VALUE);

        // Char example (2 bytes) stores a single character like 'A' or 'Z'
        char ch = 'A';  // Declare a char, 'A' is stored as its Unicode value
        System.out.println("Character: " + ch);
        System.out.println("Unicode code point for '" + ch + "': " + (int) ch);  // Prints 65 (Unicode value of 'A')
        System.out.println("Character.MIN_VALUE: "+ (int)Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE: "+(int)Character.MAX_VALUE);

        // Boolean
        boolean isPlaced = false;
        isPlaced = !isPlaced;  // Flip the boolean value
        System.out.println("Boolean : " + isPlaced);

        // Constant (final variable)
        final double pi = 3.142;
        System.out.println("Value of pi: " + pi);

        // Arithmetic Operators
        int x = 10, y = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("x + y = " + (x + y));  // Addition
        System.out.println("x - y = " + (x - y));  // Subtraction
        System.out.println("x * y = " + (x * y));  // Multiplication
        System.out.println("x / y = " + (x / y));  // Division
        System.out.println("x % y = " + (x % y));  // Modulus

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("x == y: " + (x == y));  // Equal to
        System.out.println("x != y: " + (x != y));  // Not equal to
        System.out.println("x > y: " + (x > y));    // Greater than
        System.out.println("x < y: " + (x < y));    // Less than
        System.out.println("x >= y: " + (x >= y));  // Greater than or equal to
        System.out.println("x <= y: " + (x <= y));  // Less than or equal to

        // Logical Operators
        boolean a1 = true, a2 = false;
        System.out.println("\nLogical Operators:");
        System.out.println("a1 && a2: " + (a1 && a2));  // AND
        System.out.println("a1 || a2: " + (a1 || a2));  // OR
        System.out.println("!a1: " + !a1);               // NOT

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int n1 = 5, n2 = 3;  // 5 = 0101, 3 = 0011 in binary
        System.out.println("n1 & n2: " + (n1 & n2));    // AND
        System.out.println("n1 | n2: " + (n1 | n2));    // OR
        System.out.println("n1 ^ n2: " + (n1 ^ n2));    // XOR
        System.out.println("~n1: " + (~n1));            // NOT (Inverts all bits)
        System.out.println("n1 << 1: " + (n1 << 1));    // Left shift (5 << 1 = 10)
        System.out.println("n1 >> 1: " + (n1 >> 1));    // Right shift (5 >> 1 = 2)

        //check odd or even;
        int num=5;
        int res=num&1;
        if(res==1){
            System.out.println("odd");
        }

        //Type casting

        //Implicit
        int a_ = 100;
        long b_ = a_;  // int is implicitly cast to long
        float c_ = b_; // long is implicitly cast to float
        System.out.println("Long value: " + b_);  // 100
        System.out.println("Float value: " + c_); // 100.0

        //Explicit
        double d = 9.99;
        int i = (int) d;  // Explicitly casting double to int
        System.out.println("Double value: " + d);  // 9.99
        System.out.println("Int value after casting: " + i);  // 9

    }
}
