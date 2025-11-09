import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
       System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your student number");
        int studentNumber = input.nextInt();
        System.out.println("Hello, student "+studentNumber);
        input.close();
    }
}

