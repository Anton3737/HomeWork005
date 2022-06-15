import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Введіть число для перевірки на відповідність числа до 2-ї степені: ");
        Scanner numbers = new Scanner(System.in);
        int num = numbers.nextInt();    // Введене число через сканер
        while (num % 2 == 0) {
            num = num / 2;
            System.out.println("Число являється степені 2");
        }                                           // розрахунок через цикл while-if
        if (num != 1) {
            System.out.println("Число НЕ являється степені 2");
        }
        System.out.println();
        while (num != 1 && num % 2 == 0 && num > 0) {         // являється коротким записов циклу while ( num != 1 )
            num /= 2;
        }
        System.out.println(num == 1 ? "Число являється степені 2 " : "Число не являється степені 2 "); // Вивод результату через тернарний оператор <?>
    }
}





