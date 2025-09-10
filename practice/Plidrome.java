public class Plidrome {
    public static void main(String[] args) {
      int num = 121;
      int str =num;
      int result =0;
      
      while (num>0) {
        int digit = num%10;
        result = result*10+digit;
        num = num/10;
      }
      if (str== result) {
        System.out.println("palidrome");
      } else {
        System.out.println("not palidrome");
      }
    }
}
 