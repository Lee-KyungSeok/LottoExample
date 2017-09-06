import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoMachine {
	
	//첫번째 방법
	public int[] getLottoNumber() {
		
		//6개의 숫자 받음
		int[] result = new int[6];
		Random random = new Random();
		
		//로또 숫자를 각각 넣는다.
		for(int index=0 ; index<6 ; index++) {
			result[index]= random.nextInt(45)+1;
			
			// 중복된 값 예외처리 1
			for(int overlapIndex=0 ; overlapIndex<index ; overlapIndex++) {
				if(result[index]==result[overlapIndex]) {
					index--;
				}
			}
			
			// 중복된 값 예외처리 2
			/*
			for(int overlapIndex=0 ; overlapIndex<index ; overlapIndex++) {
				while(true) {
					if(result[index]!=result[overlapIndex]) {
						break;
					} else {
						result[index] = random.nextInt(45)+1;
					}
				}
			}
			*/
		}
		
		return result;
	}
	
	//두번째 방법 - List를 이용
	
	public ArrayList<Integer> getLottoNumber2() {
		
		//List, Set, Random 정의
		ArrayList<Integer> result = new ArrayList<>();		
		Set<Integer> lottoStore  = new TreeSet<>();
		Random random = new Random();
		
		//Set 에 값을 6개까지 저장
		while(true) {
			lottoStore.add(random.nextInt(45)+1);
			if(lottoStore.size()==6) {
				break;
			}
		}
		
		//List에 값을 저장
		Iterator<Integer> iterator = lottoStore.iterator();
		while(iterator.hasNext()) {
			result.add(iterator.next());
		}
		
		return result;
	}
}

// -참고-
// 동적 배열 : 크기를 제한하지 않는 객체 배열
// 종류 : List, Set, Map
// 		List = 인덱스와 값을 가지고 있는 배열
// 		Set = 리스트와 유사하지만 중복값이 입력되지 않는다.
//		Map = 키와 값을 가지고 있는 동적 배열, 값의 중복이 허용된다.
//			Map map = new Hashmap();
//				map.put("키", 값);
