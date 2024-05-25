import java.util.Scanner;
import java.time.LocalDate;

class Common{
    public static void printLine() {
        System.out.print("-----------------------------------------------------------------------------\n");
    }
}

class User {     //for user complete details collection process
    String name, number;
    int age;

    void gettingInfo(){
        Scanner scanner = new Scanner(System.in);
        Common.printLine();
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        System.out.print("Hello " + name + ", we are very glad to welcome you !\n");

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        System.out.print("Please enter your contact number: ");
        number = scanner.nextLine();
        scanner.nextLine();
        Common.printLine();
    }
}
class Book{    //Getting user requirement and taking action
    String bookName, author;

    void bookRegistration(){    //book registration method
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your book name: ");
        bookName = scanner.nextLine();

        System.out.print("Enter your book Author: ");
        author = scanner.nextLine();

        Common.printLine();
        System.out.print("For your kind information! \n");
        LocalDate today = LocalDate.now();
        System.out.print("Book taken date: " + today);
        LocalDate dueDay = today.plusDays(30);
        System.out.println("\nBook return date: " + dueDay);

        System.out.println("Thank you for your visit !");
    }

    void bookRequirement(){      // book requirement method
        System.out.println("Kindly refer our Librarian for Book requirement! ");
        System.out.println("Thank you !");
    }

    void bookReturn(){          // method for book return process
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your book name: ");
        bookName = scanner.nextLine();

        System.out.print("Enter your book Author: ");
        author = scanner.nextLine();

        System.out.print("Please enter your registered date: ");
        String subDate = scanner.nextLine();

        System.out.println("Your book is verified !");
        System.out.println("Thank you for your visit !");
    }

    void bookInfo(){           // method for getting book complete process similar to head
        Scanner scanner = new Scanner(System.in);

        Common.printLine();
        System.out.println("How can i help you with? ");
        System.out.print("1. Book registration\n2. Book requirement\n3. Book return\n4. None of these\n");
        int option = scanner.nextInt();

        switch(option){
            case 1:
                Common.printLine();
                bookRegistration();
                Common.printLine();
                break;
            case 2:
                Common.printLine();
                bookRequirement();
                Common.printLine();
                break;
            case 3:
                Common.printLine();
                bookReturn();
                Common.printLine();
                break;
            case 4:
                Common.printLine();
                System.out.print("I would like to kindly refer our Librarian for your queries");
                System.out.print("Thank you !");
                Common.printLine();
                break;
        }
    }
}
class Access{
    String cardNo;

    void cardVerification(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your card number or email: ");
        cardNo = scanner.nextLine();

        //if (cardNo ) {
        System.out.println("Your Access is verified ! ");
        //}
    }
}

public class Main{
    public static void main(String []args) {
        //Scanner scanner = new Scanner(System.in);

        Common.printLine();
        System.out.println("We are very happy welcoming you to Ranz library !");

        User details = new User();
        details.gettingInfo();

        Access verify = new Access();
        verify.cardVerification();

        Book process = new Book();
        process.bookInfo();
    }
}