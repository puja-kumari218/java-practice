public class Divisible {
    public static void main(String[] args) {
        int number = 55;  

        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(" divisible by both 5 and 11.");
        } else {
            System.out.println(" NOT divisible by both 5 and 11.");
        }
    }
}
