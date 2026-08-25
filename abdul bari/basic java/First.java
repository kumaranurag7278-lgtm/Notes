import java.util.Scanner;

class First {
    public static void main(String args[]) {
        System.out.println("Hello world");
    }
}


class KeybRead {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter 2 numbers");

        a = s.nextInt();
        b = s.nextInt();

        c = a + b;

        System.out.println("The sum of 2 numbers is " + c);

// now what if we need to greet someone by taking a name---
        String name;

        System.out.println("May I know your name?");

        s.nextLine();       // consumes leftover Enter
        name = s.nextLine();

        System.out.println("Welcome Mr/Ms " + name);
    }
}
// reading with scanner---

class ReadKeyboard
{       public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // made scanner objecct to take input
        int x = sc.nextInt();   // it will read the input and put it in X
        System.out.println(x);  // print the x


//ADD TWO NUMBERS
        Scanner c = new Scanner(System.in);
        int g,h;
        System.out.println("enter two numbers");
        g= c.nextInt();
        h = c.nextInt();
        int p = g+h;
        System.out.println(p);
        

} 
}
