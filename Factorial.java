import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int result = 1;
		
		System.out.println("���� N�� �Է��ϼ���. ( 0 <= N <= 12)");
		int number = scanner.nextInt();
		
		for (int i = number; i >= 1; i--) {
			result = result * i;
		}
		
		System.out.print(result);
		
	}

}
