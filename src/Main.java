import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.print("Enter your gender: ");
        String gender = scan.nextLine();

        Person person = new Person(name, age, gender);

        System.out.print("Enter a book name: ");
        String book = scan.nextLine();

        System.out.print("Enter number of days: ");
        int num = scan.nextInt();

        LocalDate date = LocalDate.now();
        LocalDate new_date = LocalDate.now().plusDays(num);
        Book book1 = new Book(book, date ,num);

        System.out.println("Your name is "+person.name+" you're "+ person.age +" and you're a "+person.gender+" .You did borrow this book: "+book1.name +" for " + book1.days +" days and you need to return it : "+ new_date);
        scan.close();
    }
}