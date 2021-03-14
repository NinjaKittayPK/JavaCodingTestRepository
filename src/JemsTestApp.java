public class JemsTestApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Fuck the World! Cause Teddy A Bich");
    

//This is how you comment a single line.
// "main()" runs as the program is run, must be in every program.
// the file must be named the same as what is in: public class [Name] {

        int saturdayFahrenheit;
        int sundayFahrenheit;
        saturdayFahrenheit = 78;
        sundayFahrenheit = 81;
        double saturdayCelsius = (5.0/9) * (saturdayFahrenheit - 32);
        double sundayCelsius = (5.0/9) * (sundayFahrenheit - 32);
        System.out.println("Weekend Averages");
        System.out.println("Saturday: " + saturdayCelsius);
        System.out.println("Sunday: " + sundayCelsius);
    } 
    
}

// int and double are variable storage int can't store decimals though while double can.

/*

This comments out lines

final int [variable]
final [declarer] [variable] => makes constant, no changes allowed.
*/

/*

char yes = 'Y', no = 'N', west = 'W', cat ='C';
char wha = '\''  // stores wha = '

is legal

*/

