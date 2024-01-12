import java.util.Scanner;

public class Study20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int 숫자1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int 숫자2 = scanner.nextInt();

        int 합 = 숫자1 + 숫자2;
        System.out.println("두 숫자의 합은: " + 합);

        scanner.close();
    }


}
