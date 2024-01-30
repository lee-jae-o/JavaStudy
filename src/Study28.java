import java.util.Random;
import java.util.Scanner;

public class Study28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 선택하세요:");
        int userChoice = scanner.nextInt();


        int computerChoice = random.nextInt(3) + 1;


        System.out.println("사용자의 선택: " + convertToChoice(userChoice));
        System.out.println("컴퓨터의 선택: " + convertToChoice(computerChoice));


        determineWinner(userChoice, computerChoice);
    }

    private static String convertToChoice(int choice) {
        switch (choice) {
            case 1:
                return "가위";
            case 2:
                return "바위";
            case 3:
                return "보";
            default:
                return "잘못된 선택";
        }
    }

    private static void determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            System.out.println("비겼습니다!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            System.out.println("사용자가 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
        }
    }
}