// файл Job.java
import java.util.List;

public class Job {

    // TODO 1 (одна строка): вызвать callback.onDone("готово"), потом вернуть true
    public boolean run(Callback callback) {
        // ▼ ВАШ КОД ЗДЕСЬ

        // ▲ КОНЕЦ
        return false;
    }

    // TODO 2 (цикл): для каждого слова из words вызвать callback.onDone(word),
    //               вернуть количество вызовов
    public int runAll(List<String> words, Callback callback) {
        int count = 0;
        // ▼ ВАШ КОД ЗДЕСЬ

        // ▲ КОНЕЦ
        return count;
    }

    public static void main(String[] args) {
        Job job = new Job();

        // должно вывести: готово
        boolean ok = job.run(msg -> System.out.println(msg));
        System.out.println(ok);   // true

        // должно вывести: a / b / c, потом 3
        int n = job.runAll(List.of("a", "b", "c"), msg -> System.out.println(msg));
        System.out.println(n);    // 3
    }
}
