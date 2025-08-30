import java.time.LocalDate;
import java.util.Date;

public class Book{
    String name;
    LocalDate date;
    int days;
    Book(String name, LocalDate date, int days){
        this.name = name;
        this.date = date;
        this.days = days;
    }
}
