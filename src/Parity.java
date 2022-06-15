import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        System.out.println("Введіть число для перевірки на парність або непарність: ");
        Scanner numbers = new Scanner(System.in);
        int num = numbers.nextInt();
        if ((num % 2) == 0)  // Цілочислене ділення на 2 без залишку і == 0 ( через if - else )
        {
            System.out.println("Число " + num + " є парним і молодший біт якого рівний 0:");
        }
        else{
            System.out.println("Число " + num + " є НЕ парним і молодший біт якого НЕ рівний 0:");
        }

        
    }
}

