import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Ch9HW {
    static int m;
    static int y;
    static int n;
    static int a;
    static int b;
    public static void main(String[] args) {
     
            Scanner ChHw = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter Month Jan(1), Feb(2), ...etc: ");
            m = ChHw.nextInt(); // Scans the next token of the input as an int.
            System.out.println("Enter Year (0000): ");
            y = ChHw.nextInt();
            AgeCalcInMonths();
            System.out.println("Age in months: " + n);
            ChHw.close();
    }  //once finished
    static void AgeCalcInMonths() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
        a = ((year*12)+month);
        b = ((y*12)+m);
        n = (a-b);
    } 
    
}
