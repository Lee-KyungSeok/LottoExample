import java.util.ArrayList;

public class Lotto {
	
	public static void main(String args[]) {
		
		LottoMachine lotto = new LottoMachine();
		System.out.println("\n=========ù��° �ζ� =========");
		
		int lottoPaper[] = lotto.getLottoNumber();
		for(int number : lottoPaper) {
			System.out.print(number+"\t");
		}
		System.out.println("\n=========�ι�° �ζ� =========");
		
		ArrayList<Integer> lottoPaper2 = lotto.getLottoNumber2();
		for(int number : lottoPaper2) {
			System.out.print(number+"\t");
		}
	}

}
