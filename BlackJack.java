import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();				// 카드 개수
		int m = scanner.nextInt();				// max값
		
		int[] card = new int[n];
		
		for(int i = 0; i < n; i++) {
			card[i] = scanner.nextInt();
		}
		
		System.out.println(BJ(card, m));
	}
	
	public static int BJ(int[] card, int m) {
		int max = m;
		
		for(int i = 0; i < card.length-2; i++) {				// 첫번째 카드는 n-2까지
			for(int j = i+1; j < card.length-1; j++) {			// 두번째 카드는 첫번째부터 n-1까지
				for(int k = j+1; k < card.length; k++) {		// 세번째 카드는 두번째부터 n까지
					int sum = card[i] + card[j] + card[k];
				
					if(m == sum) {				// 카드의 합과 max의 값이 같으면 리턴
						return sum;
					}
				
					if(m < sum) {				// 카드의 합이 max의 값을 넘으면 skip
						continue;
					}
				
					if(max > m - sum) {			// 카드의 합이 max의 값을 넘지않으면 가까운 것을 비교해서 리턴
						max = m - sum;
					}	
				}
			}
		}
		return m - max;
	}
}
