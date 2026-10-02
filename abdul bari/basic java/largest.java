import java.util.* ;

public class largest{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt() ;
        int b = s.nextInt() ;
        int c = s.nextInt();

        if(a > b && a > c){
            System.out.println("A is largest number");
        }else if(b > a && b > c)
        {
            System.out.println("B is largest number");

        }else {
            System.out.println("C is the largest number");
        }

    }
}

