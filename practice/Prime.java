public class Prime {
    public static void main(String[] args) {
        int num = 5;
        String str = "prime";
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                str = "not a prime";

            }

        }
        System.out.println(str);

    }

}
