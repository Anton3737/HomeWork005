import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;   // вислуга роботи в роках
        int d = 20;
        int e = 25;
        int f = 100;
        double vsegoVar = 0;    //  сума остаточної ЗП
        double sumPrem = 0;     //  сума премії
        Scanner in = new Scanner(System.in);
        System.out.println("Ведіть Ваш стаж роботи: ");
        int stazhVar = in.nextInt();    //   приймає суму стажу роботи
        System.out.println("Введіть суму Вашої заробітної плати: ");
        int okladVar = in.nextInt();    // приймає існуючу суму заробітної плати

        if (0 <= stazhVar && stazhVar <= a) {   // 0 - 5 років  = 10 %
            sumPrem = okladVar * 0.10;          // сума премії  =  сума окладу * коефіцієнт
            vsegoVar = okladVar + sumPrem;      //  сума остаточної ЗП  = оклад + сума премії
            System.out.println("Сумма Вашої ЗП: " + okladVar + " при стажі роботи: " + stazhVar + " років матиме щомісячну надбавку в розміні: " + sumPrem + " і складатиме: "  + vsegoVar );
        }
        if (a <= stazhVar && stazhVar <= b) {   // 5 - 10 років = 15 %
            sumPrem = okladVar * 0.15;
            vsegoVar = okladVar + sumPrem;
            System.out.println("Сумма Вашої ЗП: " + okladVar + " при стажі роботи: " + stazhVar + "років матиме щомісячну надбавку в розміні: " + sumPrem + " і складатиме: "  + vsegoVar );
        }
        if (b <= stazhVar && stazhVar <= c) {   // 10 - 15 років = 25 %
            sumPrem = okladVar * 0.25;
            vsegoVar = okladVar + sumPrem;
            System.out.println("Сумма Вашої ЗП: " + okladVar + " при стажі роботи: " + stazhVar + "років матиме щомісячну надбавку в розміні: " + sumPrem + " і складатиме: "  + vsegoVar );
        }
        if (c <= stazhVar && stazhVar <= d) {    // 15 - 20 років = 35 %
            sumPrem = okladVar * 0.35;
            vsegoVar = okladVar + sumPrem;
            System.out.println("Сумма Вашої ЗП: " + okladVar + " при стажі роботи: " + stazhVar + "років матиме щомісячну надбавку в розміні: " + sumPrem + " і складатиме: "  + vsegoVar );
        }
        if (d <= stazhVar && stazhVar <= e) {     // 20 - 25 років = 45 %
            sumPrem = okladVar * 0.45;
            vsegoVar = okladVar + sumPrem;
            System.out.println("Сумма Вашої ЗП: " + okladVar + " при стажі роботи: " + stazhVar + "років матиме щомісячну надбавку в розміні: " + sumPrem + " і складатиме: "  + vsegoVar );
        }
        if (e <= stazhVar && stazhVar <= f) {  // 50 і більше (до 100 )  = 50 %
            sumPrem = okladVar * 0.50;
            vsegoVar = okladVar + sumPrem;
            System.out.println("Сумма Вашої ЗП: " + okladVar + " при стажі роботи: " + stazhVar + "років матиме щомісячну надбавку в розміні: " + sumPrem + " і складатиме: "  + vsegoVar );
        }
    }
}

