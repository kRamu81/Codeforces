import java.util.Scanner;

public class QueueattheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of students
        int t = sc.nextInt(); // number of seconds
        String s = sc.next(); // queue of boys and girls

        char[] arr = s.toCharArray();

        while (t-- > 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    // swap B and G
                    arr[i] = 'G';
                    arr[i + 1] = 'B';
                    i++; // skip next index
                }
            }
        }

        System.out.println(new String(arr));
    }
}