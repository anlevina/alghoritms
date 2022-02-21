import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int newArray[] = new int[100];
        int i=0;

        for (int in: newArray) {
            newArray[in] = i;
            i++;
        }
        Random random = new Random();
        int guess = random.nextInt(newArray.length);
        //System.out.println(guess);
        Scanner in = new Scanner(System.in);
        System.out.println("Попробуй угадать число, которое псевдорандомно записалось в переменную guess класса random");
        int tryN = in.nextInt();
        while (tryN != guess) {
            System.out.println("Попробуй еще:");
                if (tryN > guess) {
                    System.out.println("Нужно число меньше");
                    tryN = in.nextInt();
                } else if (tryN < guess) {
                    System.out.println("Нужно число больше");
                    tryN = in.nextInt();
                }
        }
        System.out.println("Круто, десептеконы побеждены, программа корректно завершилась! Поздравляю с первым написанным самостоятельно алгоритмом бинарного поиска!!!");
    }
}
