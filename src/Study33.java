import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Study33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("로또 게임 수를 입력하세요: ");
        int numberOfGames = scanner.nextInt();

        for (int i = 1; i <= numberOfGames; i++) {
            int[] lottoNumbers = generateLottoNumbers();
            Arrays.sort(lottoNumbers);

            System.out.println("게임 #" + i + ": " + Arrays.toString(lottoNumbers));
        }

        scanner.close();
    }

    private static int[] generateLottoNumbers() {
        Random random = new Random();
        int[] lottoNumbers = new int[6];

        for (int i = 0; i < 6; i++) {
            int number;
            do {
                number = random.nextInt(45) + 1;
            } while (contains(lottoNumbers, number));

            lottoNumbers[i] = number;
        }

        return lottoNumbers;
    }

    private static boolean contains(int[] array, int number) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }
}