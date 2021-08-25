import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int firstNumber = sc.nextInt();
        // int secondNumber = sc.nextInt();
        // System.out.println(firstNumber+secondNumber);

        // String firstName = sc.nextLine();
        // String lastName = sc.nextLine();
        // System.out.println(firstName + " " + lastName);

        int principle = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();

        float simpleInterest = principle*rate*time/100;
        System.out.println("The Simple is - " + simpleInterest);
    }
}
