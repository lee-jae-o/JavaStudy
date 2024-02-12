import java.util.Random;
import java.util.Scanner;

public class Study30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("1에서 100 사이의 숫자를 맞춰보세요!");

        while (!hasGuessedCorrectly) {
            System.out.print("추측한 숫자를 입력하세요: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess == secretNumber) {
                hasGuessedCorrectly = true;
                System.out.println("축하합니다! 숫자를 맞췄습니다!");
            } else if (userGuess < secretNumber) {
                System.out.println("좀 더 큰 수를 입력하세요.");
            } else {
                System.out.println("좀 더 작은 수를 입력하세요.");
            }
        }

        System.out.println("정답은 " + secretNumber + "이었습니다.");
        System.out.println("시도 횟수: " + numberOfAttempts);

        scanner.close();
    }
}