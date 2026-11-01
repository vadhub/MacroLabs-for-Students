// файл Calc.java

import java.util.Arrays;

public class Calc {

    // ДАНО — работает
    public int run(int a, int b, Operation op) {
        return op.apply(a, b);
    }

    // TODO 2 (цикл): применить op к каждой паре (as[i], bs[i]),
    //               положить результат в result[i]
    public int[] runAll(int[] as, int[] bs, Operation op) {
        int[] result = new int[as.length];
        for (int i = 0; i < as.length; i++) {
            // ▼ ВАШ КОД ЗДЕСЬ (одна строка)
            result[i] = 0;
            // ▲ КОНЕЦ
        }
        return result;
    }

    public static void main(String[] args) {
        Calc c = new Calc();

        // ДАНО: анонимный класс — работает
        int sum = c.run(2, 3, new Operation() {
            public int apply(int a, int b) { return a + b; }
        });
        System.out.println("sum=" + sum);   // sum=5

        // TODO 1: перепишите через лямбду
        // ▼ ВАШ КОД ЗДЕСЬ (одна строка: int mul = c.run(2, 3, ???);)
        int mul = 0;                        // ← замените 0 на лямбду
        // ▲ КОНЕЦ
        System.out.println("mul=" + mul);   // должно быть mul=6

        // ДАНО: работает после TODO 2
        int[] sums = c.runAll(new int[]{1, 2, 3},
                new int[]{10, 20, 30},
                (a, b) -> a + b);
        System.out.println(Arrays.toString(sums));   // [11, 22, 33]
    }
}
