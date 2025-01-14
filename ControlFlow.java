public class ControlFlow {
    public static void main(String[] args) {
/*
//If-else
        int a = 5;
        System.out.println((a & 1) == 1 ? "Odd" : "Even");
//Else if
        String gender = "M";
        if (gender.equals("M")) {
            System.out.println("Male");
        } else if (gender.equals("F")) {
            System.out.println("Female");
        } else if (gender.equals("TF")) {
            System.out.println("Transgender Female");
        } else {
            System.out.println("Transgender Male");
        }

// IF-else-else if
        char ch = 'v';
        if (ch == 'v')
            System.out.println("Violet");
        else if (ch == 'i')
            System.out.println("Indigo");
        else if (ch == 'g')
            System.out.println("Green");
        else if (ch == 'b')
            System.out.println("Blue");
        else if (ch == 'y')
            System.out.println("yellow");
        else if (ch == 'o')
            System.out.println("Orange");
        else if (ch == 'r')
            System.out.println("Red");
        else
            System.out.println("Invalid input");
// Switch
        switch (ch) {
            case 'v':System.out.println("Violet");break;
            case 'i':System.out.println("Indigo");break;
            case 'g':System.out.println("Green");break;
            case 'b':System.out.println("Blue");break;
            case 'y':System.out.println("Yellow");break;
            case 'o':System.out.println("Orange");break;
            case 'r':System.out.println("Red");break;
            default:System.out.println("Invalid color");
        }
//Looping

//for loop
        //for (initialization;condition;increment/decrement)
        for(int i=0;i<5;i++){
            System.out.print(i);
        }
        System.out.println();
        //print all even num till 50
        for(int i=0;i<=50;i+=2)
                System.out.println(i);
        System.out.println();
        //FizzBuzz

        for(int i=1;i<=50;i++){
            if((i%3==0)&&(i%5==0)){
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");

            } else if (i%3==0) {
                System.out.println("Fizz");

            }else {
                System.out.println(i);
            }
        }

//While loop
        int i= 1;
        while (i<= 50) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
            i++;
        }

//do while loop
        int i=0;
        do {
            System.out.print(i);
            i++;
        }while (i<10);
 */
// Conditional statements
//continue and brake
        for(int i=1;i<=50;i++){
            if((i%3==0)&&(i%5==0)){
                System.out.println("Skipped");
                continue;
            }
            System.out.println(i*2);
        }


        
    }
}
