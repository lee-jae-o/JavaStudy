import java.util.Scanner;

public class Study31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("계산할 수식을 입력하세요 (종료: 'exit'): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            try {

                double result = evaluateExpression(input);
                System.out.println("결과: " + result);
            } catch (Exception e) {
                System.out.println("올바른 수식이 아닙니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }

    private static double evaluateExpression(String expression) {
        String[] tokens = expression.split("\\s+");
        double operand1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double operand2 = Double.parseDouble(tokens[2]);

        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
        }
    }
}