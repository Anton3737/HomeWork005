import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input num: ");
        int num = in.nextInt();

        while (num != 1 && num % 2 == 0 && num > 0) {
            num /= 2;
        }

        System.out.println(num == 1 ? "YES" : "NO");
    }
}
