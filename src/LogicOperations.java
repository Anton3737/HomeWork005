public class LogicOperations {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = 15;

        x += y >> x++ * z;   // результат розрахунку операції складає = 5
        z = ++x & y * 5;     // результат розрахунку операції складає = 2
        y /= x + 5 | z;         // результат розрахунку операції складає = 0
        z = x++ & y * 5;     // результат розрахунку операції складає = 0
        x = y << x++ ^ z;    // результат розрахунку операції складає = 335

        System.out.println();

    }
}
