package Семинар_4;
import java.util.ArrayDeque;
import java.util.Deque;

public class Task2 {

    public static Deque<Integer> add(Deque<Integer> num1, Deque<Integer> num2) {
        int n1 = dequeToInt(num1);
        int n2 = dequeToInt(num2);

        int sum = n1 + n2;

        Deque<Integer> result = new ArrayDeque<>();
        if (sum == 0) {
            result.add(0);
        } else {
            while (sum > 0) {
                int digit = sum % 10;
                result.addFirst(digit);
                sum /= 10;
            }
        }

        return result;
    }

    private static int dequeToInt(Deque<Integer> deque) {
        int num = 0;
        while (!deque.isEmpty()) {
            num = num * 10 + deque.removeFirst();
        }
        return num;
    }

    public static void main(String[] args) {
        Deque<Integer> num1 = new ArrayDeque<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);

        Deque<Integer> num2 = new ArrayDeque<>();
        num2.add(4);
        num2.add(5);
        num2.add(6);

        Deque<Integer> sum = add(num1, num2);
        System.out.println(sum); 
    }
}
