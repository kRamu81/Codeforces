import java.util.Scanner;

public class LightsOut_275A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] press = new int[3][3];
        int[][] lights = new int[3][3];

        // Initialize all lights as on
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                lights[i][j] = 1;

        // Read input: how many times each button is pressed
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                press[i][j] = sc.nextInt();

        // Directions: self, up, down, left, right
        int[] dx = {0, -1, 1, 0, 0};
        int[] dy = {0, 0, 0, -1, 1};

        // Process toggles
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int times = press[i][j];
                if (times % 2 != 0) {  // only toggle if odd
                    for (int k = 0; k < 5; k++) {
                        int ni = i + dx[k];
                        int nj = j + dy[k];
                        if (ni >= 0 && ni < 3 && nj >= 0 && nj < 3)
                            lights[ni][nj] ^= 1;  // toggle (1 -> 0, 0 -> 1)
                    }
                }
            }
        }

        // Print final state
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(lights[i][j]);
            System.out.println();
        }
    }
}
