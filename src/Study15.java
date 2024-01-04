import java.util.Scanner;

public class Study15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 시작 값과 최종 값 입력 받기
        System.out.print("시작 값을 입력하세요: ");
        int 시작값 = scanner.nextInt();

        System.out.print("최종 값을 입력하세요: ");
        int 최종값 = scanner.nextInt();

        // 시작 값부터 3씩 더해가며 최종 값에 도달하는지 확인
        boolean 딱맞아떨어짐 = false;
        while (시작값 <= 최종값) {
            if (시작값 == 최종값) {
                딱맞아떨어짐 = true;
                break;
            }
            시작값 += 3;
        }

        // 결과 출력
        if (딱맞아떨어짐) {
            System.out.println("최종 값에 딱 맞아떨어집니다.");
        } else {
            System.out.println("최종 값에 딱 맞아떨어지지 않습니다.");
        }

        // Scanner 닫기
        scanner.close();
    }
}
