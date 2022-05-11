import java.util.Scanner;

public class CalculatorThirdVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        reportHelloMessage(scanner);
        int execution = scanner.nextInt();
        askForFirstNum(scanner);
        int firstNum = scanner.nextInt();
        askForSecondNum(scanner);
        int secondNum = scanner.nextInt();
        int result;
        if (execution == 1) {
            result = firstNum + secondNum;
            System.out.println(result);
        }else if (execution == 2){
            result = firstNum - secondNum;
            System.out.println(result);
        }else if (execution == 3){
            result = firstNum * secondNum;
            System.out.println(result);
        }else if (execution == 4){
            result = firstNum / secondNum;
            System.out.println(result);
        }else System.out.println("Error !");



    }

    static void reportHelloMessage(Scanner scanner) {
        String helloMessage = "Hello!\nChoose operation u want to execute:\n1 - addition\n2 - subtraction" +
                "\n3 - multiply\n4 - division";
        System.out.println(helloMessage);
    }

    static void askForFirstNum(Scanner scanner) {
        String enterFirstNum = "Please, enter ur first number:";
        System.out.println(enterFirstNum);
    }

    static void askForSecondNum(Scanner scanner) {
        String enterSecondNum = "Please, enter ur second number:";
        System.out.println(enterSecondNum);
    }
}
