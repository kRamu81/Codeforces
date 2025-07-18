import java.util.Scanner;

public class BeautifulYear_271A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String year = scan.nextLine();
        for (int i = 1000; i <= 9000; i++) {
            year = String.valueOf(Integer.parseInt(year) + 1);
            if (year.charAt(0) != year.charAt(1) &&
                    year.charAt(0) != year.charAt(2) &&
                    year.charAt(0) != year.charAt(3) &&
                    year.charAt(1) != year.charAt(2) &&
                    year.charAt(1) != year.charAt(3) &&
                    year.charAt(2) != year.charAt(3))
                break;
        }
        System.out.println(year);
    }
}

//input : 1987
//output : 2013
