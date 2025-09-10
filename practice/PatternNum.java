public class PatternNum {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int space = 0; space < 5 - i; space++) {
                System.out.print(" ");
            }

            int num = 1; 

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1); 
            }

            System.out.println(); 
        }
    }
}