import java.util.Scanner;

class Imports {
public static void main(String[] args) {
    Scanner imports = new Scanner(System.in);
    int i = 89;
    int l = 0;
    
while (l<5) {
    System.out.println("Guess the number that was randomly generated");
    int m = imports.nextInt();
    if (m==i) {
    System.out.println("You guessed the number");
    // imports.close();
    break;
}
else if (m<i) {
    System.out.println("The number is too low!");
}
else if (m>i) {
    System.out.println("The number is too high");
}
l = l + 1;
}

}




}
