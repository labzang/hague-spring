import java.util.Scanner;

public class Calculator {
    // 덧셈 메소드 선언
    public static int add(int a, int b) {
        return a + b;
    } 

    public static void main(String[] args) {
        System.out.println("계산기 어플");

        // 스캐너 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 두 정수 입력받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();
        
        // 덧셈 메소드 호출
        int result = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result);
        
        // 스캐너 닫기
        scanner.close();
    }
}
