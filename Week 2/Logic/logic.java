import java.util.Scanner;

public class logic {
    
    public static void main (String[] args) {
        Scanner party = new Scanner(System.in);
System.out.println("Put in the amount of tea that you want");
int m = party.nextInt();
System.out.println("Put in the amount of candy that you want");
int c = party.nextInt();

        if(m>5) {
        if(c>5) {
        if(m<c*2) {
        if(c<m*2) {
          System.out.println("1");  
        }
    }
}
        }
        else if(m>=c * 2) {
            System.out.println("2");
        }
        else if(c>=m * 2){
            System.out.println("2");
        }
        else if(m<5) {
        if (c<5) {
            System.out.println("0");
 }
}
        
        party.close();
    }
}
