import java.util.Scanner;

public class Study21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput;

        do {
            System.out.println("버튼을 선택하세요 (1, 2, 3, 0): ");
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("위잉");
                    break;
                case 2:
                    System.out.println("위이이잉");
                    break;
                case 3:
                    System.out.println("위이이이잉!");
                    break;
                case 0:
                    System.out.println("정지합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }

        } while (userInput != 0);

        scanner.close();
    }
}
