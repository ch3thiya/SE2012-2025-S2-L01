import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = sc.nextLine();

        System.out.println("Enter your last name:");
        String lastName = sc.nextLine();

        System.out.printf("Welcome to the Second Year %s %s!", firstName, lastName);
    }
}