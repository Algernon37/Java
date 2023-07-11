import java.util.ArrayDeque;
import java.util.Deque;

public class Task1 {

    public static Deque<Integer> multiply(Deque<Integer> num1, Deque<Integer> num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            throw new IllegalArgumentException("Одно или оба числа пусты");
        }

        int n1 = dequeToInt(num1);
        int n2 = dequeToInt(num2);

        int product = n1 * n2;

        Deque<Integer> result = new ArrayDeque<>();
        if (product == 0) {
            result.add(0); 
        } else {
            while (product > 0) {
                int digit = product % 10;
                result.addFirst(digit);
                product /= 10;
            }
        }

        return result;
    }

    private static int dequeToInt(Deque<Integer> deque) {
        int num = 0;
        while (!deque.isEmpty()) {
            num = num * 10 + deque.removeLast();
        }
        return num;
    }

    public static void main(String[] args) {
        Deque<Integer> num1 = new ArrayDeque<>();
        num1.add(9);
        num1.add(9);
        num1.add(9);

        Deque<Integer> num2 = new ArrayDeque<>();
        num2.add(2);
        num2.add(3);

        Deque<Integer> product = multiply(num1, num2);
        System.out.println(product);
    }
}

