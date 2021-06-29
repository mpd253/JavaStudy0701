import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();				// ī�� ����
		int m = scanner.nextInt();				// max��
		
		int[] card = new int[n];
		
		for(int i = 0; i < n; i++) {
			card[i] = scanner.nextInt();
		}
		
		System.out.println(BJ(card, m));
	}
	
	public static int BJ(int[] card, int m) {
		int max = m;
		
		for(int i = 0; i < card.length-2; i++) {				// ù��° ī��� n-2����
			for(int j = i+1; j < card.length-1; j++) {			// �ι�° ī��� ù��°���� n-1����
				for(int k = j+1; k < card.length; k++) {		// ����° ī��� �ι�°���� n����
					int sum = card[i] + card[j] + card[k];
				
					if(m == sum) {				// ī���� �հ� max�� ���� ������ ����
						return sum;
					}
				
					if(m < sum) {				// ī���� ���� max�� ���� ������ skip
						continue;
					}
				
					if(max > m - sum) {			// ī���� ���� max�� ���� ���������� ����� ���� ���ؼ� ����
						max = m - sum;
					}	
				}
			}
		}
		return m - max;
	}
}
