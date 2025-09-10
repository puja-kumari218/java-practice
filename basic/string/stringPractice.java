package basic.string;

public class stringPractice {
    public static void main(String[] args) {
        String str1 ="java pro";
        String str2 = "hello puja";
        char c[] = {'H', 'E','l','l'};
        String str3= new String(c);
        byte b[] ={64,65,67,68};
        String str4 = new String(b,2,2);
        System.out.println(str4);
    }
    
}
