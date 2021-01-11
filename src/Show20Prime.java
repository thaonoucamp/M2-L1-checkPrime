import java.util.Scanner;

public class Show20Prime {
    public static void main(String[] args) {

        int count = 0;
        int num;
        int i = 2;

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num > i) {
            System.out.println(num + "no is prime");
        } else {
            while (count < num) {
                if (num % i == 0) {
                    System.out.println(num + "is not prime");
                } else if (num % i != 0) {
                    System.out.println(num + "is a prime");
                    count++;
//                    if (count == 20) {
//                        return;
//                    } else
                    if (num >= 100) {
                        return;
                    }
                }
                i++;
            }
        }
    }
}
