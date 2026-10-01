import java.util.*;

public class Odd_even {
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");

        int a = s.nextInt();

        if(a % 2 != 0){
            System.out.println("Odd number");

        } else {
            System.out.println("Even Number");
        }
    }


}

