import java.util.ArrayList;

public class Lotto {
	
	public static void main(String args[]) {
		
		LottoMachine lotto = new LottoMachine();
		System.out.println("\n=========첫번째 로또 =========");
		
		int lottoPaper[] = lotto.getLottoNumber();
		for(int number : lottoPaper) {
			System.out.print(number+"\t");
		}
		System.out.println("\n=========두번째 로또 =========");
		
		ArrayList<Integer> lottoPaper2 = lotto.getLottoNumber2();
		for(int number : lottoPaper2) {
			System.out.print(number+"\t");
		}
	}

}
