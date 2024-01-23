import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Study26 {
    public static void main(String[] args) {
        // 사용자로부터 로또 번호 입력 받기
        int[] userNumbers = getUserNumbers();

        // 로또 번호 생성
        int[] lottoNumbers = generateLottoNumbers();

        // 로또 번호 출력
        System.out.println("로또 당첨 번호: " + Arrays.toString(lottoNumbers));

        // 당첨 여부 확인 및 결과 출력
        int matchingCount = countMatchingNumbers(userNumbers, lottoNumbers);
        System.out.println("일치하는 번호 개수: " + matchingCount);
        if (matchingCount == 6) {
            System.out.println("로또 1등에 당첨되셨습니다!");
        } else {
            System.out.println("아쉽게도 당첨되지 않았습니다. 다음 기회를 기대해주세요!");
        }
    }

    // 사용자로부터 로또 번호 입력 받는 메소드
    private static int[] getUserNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[6];

        System.out.println("로또 번호 6개를 선택하세요 (1부터 45까지의 숫자 중 중복 없이):");
        for (int i = 0; i < 6; i++) {
            System.out.print("번호 " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextInt();
        }

        Arrays.sort(userNumbers); // 입력된 번호를 정렬
        return userNumbers;
    }

    // 로또 번호 생성 메소드
    private static int[] generateLottoNumbers() {
        Random random = new Random();
        int[] lottoNumbers = new int[6];

        for (int i = 0; i < 6; i++) {
            lottoNumbers[i] = random.nextInt(45) + 1; // 1부터 45까지의 난수 생성
        }

        Arrays.sort(lottoNumbers); // 생성된 번호를 정렬
        return lottoNumbers;
    }

    // 일치하는 번호 개수를 세는 메소드
    private static int countMatchingNumbers(int[] userNumbers, int[] lottoNumbers) {
        int count = 0;

        for (int userNumber : userNumbers) {
            if (Arrays.binarySearch(lottoNumbers, userNumber) >= 0) {
                count++;
            }
        }

        return count;
    }
}
