import java.util.Scanner;

public class Study32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("암호화할 문자열을 입력하세요: ");
        String originalText = scanner.nextLine();

        // 암호화
        String encryptedText = encrypt(originalText);
        System.out.println("암호화된 문자열: " + encryptedText);

        // 복호화
        String decryptedText = decrypt(encryptedText);
        System.out.println("복호화된 문자열: " + decryptedText);

        scanner.close();
    }

    private static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                int shifted = (ch - base + 3) % 26 + base;
                encryptedText.append((char) shifted);
            } else {
                encryptedText.append(ch);
            }
        }

        return encryptedText.toString();
    }

    private static String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                int shifted = (ch - base - 3 + 26) % 26 + base;
                decryptedText.append((char) shifted);
            } else {
                decryptedText.append(ch);
            }
        }

        return decryptedText.toString();
    }
}