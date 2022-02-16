import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        int[] money = {25, 10, 5, 1};
        int[][] answer = new int[T][money.length];

        for (int i = 0; i < T; i++) {
            int num = kb.nextInt();

            for (int j = 0; j < money.length; j++) {
                answer[i][j] = num / money[j];
                num %= money[j];
            }
        }

        for (int[] arr : answer) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
