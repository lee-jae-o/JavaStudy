import java.util.Scanner;

public class Study38 {

    public static void main(String[] args) {

        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputstring;

        do {
            System.out.print(">");

            inputstring = scanner.nextLine();
            System.out.println(inputstring);

        } while( ! inputstring.equals("q") );

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
