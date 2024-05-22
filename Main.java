import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your name:) ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.print("Hello " + name + "!  ");

        System.out.print("Enter your choice: \n");
        System.out.print("1. inr to usd \n2. usd to inr \n3. inr to singapore dollar \n4. singapore dollar to inr\n");

        int given = scanner.nextInt();

        switch(given) {
            case 1:
                System.out.print("inr to usd");
                break;

            case 2:
                System.out.print("usd to inr");
                break;

            case 3:
                System.out.print("inr to singapore");
                break;

            case 4:
                System.out.print("singapore to inr");
                break;
        }

    }
}
