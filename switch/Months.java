
public class Months {
    public static void main(String[] args) {      

    int month =12;
    String monthString="";

    switch(month){
        case 1 : monthString="1-jan";
        break;

        case 2 : monthString="2-Feb";
        break;

        case 3 : monthString="3-March";
        break;

        case 4 : monthString="4-April";
        break;

        case 5 : monthString="5-May";
        break;

        case 6 : monthString="6-june";
        break;

        case 7 : monthString="7-July";
        break;

        case 8 : monthString="8-Aug";
        break;

        case 9 : monthString="9-sep";
        break;

        case 10 : monthString="10-Oct";
        break;

        case 11 : monthString="11-Nov";
        break;


        case 12 : monthString="12-Dec ";
        break;
        default: System.out.println("Invalid Months");
    }
    System.out.println(monthString);
}
}