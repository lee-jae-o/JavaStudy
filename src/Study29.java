import java.util.Scanner;

public class Study29 {

    public static void main(String[] args) {
        // 사용자에게 이름 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        // 이름 반전 및 출력
        String[] words = name.split("\\s+");
        StringBuilder reversedName = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedName.append(words[i]).append(" ");
        }

        System.out.println("반전된 이름: " + reversedName.toString().trim());
    }
}

