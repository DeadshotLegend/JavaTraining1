import java.util.Scanner;

public class Homework {
    public static void main (String[] args) {
System.out.println("Are you ready to use the calculator");
    Scanner math = new Scanner(System.in);
    System.out.println("Put in first number:");
    double num1 = math.nextDouble();
    System.out.println("Put in the symbol");
    String symbol = math.next();
System.out.println("Put in the the second number");
    double num2 = math.nextDouble();
   
   //Setting variables
   String s1 = "+";
   String s2 = "-";
   String s3 = "/";
   String s4 = "*";
   String s5 = "%";
   String s6 = "^";
   String s7 = "sqrroot";
   String s8 = "cuberoot";
   String s9 = "hypotenuse";
    // If else statements for computations
   

    if(symbol.equals(s1)) {
        System.out.println(num1 + num2);
     }
     else if(symbol.equals(s2)) {
     System.out.println(num1 - num2);
    }
    else if(symbol.equals(s3)) {
        System.out.println(num1/num2);
    }
    else if(symbol.equals(s4)){
        System.out.println(num1*num2);
    }
    else if(symbol.equals(s5)){
        System.out.println(num1%num2);
    }
    else if(symbol.equals(s6)) {
    System.out.println(Math.pow(num1, num2));
    }
    else if (symbol.equals(s7)) {
    System.out.println(Math.sqrt(num1));
    System.out.println(Math.sqrt(num2));
    }
    else if(symbol.equals(s8)){
    System.out.println(Math.cbrt(num1));
    System.out.println(Math.cbrt(num2));
    }
    else if(symbol.equals(s9)) {
        System.out.println(Math.sqrt((num1 * num1) + (num2 * num2)));
         }
         else {
             System.out.println("None of the correct operations were chosen");
             math.close();

    

         }
    
}
}

