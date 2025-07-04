import java.util.*;
public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int X = 0, Y = 0, Z = 0;
        for (int i = 0; i < n; i++) {
            X += sc.nextInt();
            Y += sc.nextInt();
            Z += sc.nextInt();
        }

        if (X == 0 && Y == 0 && Z == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}