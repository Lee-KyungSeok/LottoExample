import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoMachine {
	
	//ù��° ���
	public int[] getLottoNumber() {
		
		//6���� ���� ����
		int[] result = new int[6];
		Random random = new Random();
		
		//�ζ� ���ڸ� ���� �ִ´�.
		for(int index=0 ; index<6 ; index++) {
			result[index]= random.nextInt(45)+1;
			
			// �ߺ��� �� ����ó�� 1
			for(int overlapIndex=0 ; overlapIndex<index ; overlapIndex++) {
				if(result[index]==result[overlapIndex]) {
					index--;
				}
			}
			
			// �ߺ��� �� ����ó�� 2
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
	
	//�ι�° ��� - List�� �̿�
	
	public ArrayList<Integer> getLottoNumber2() {
		
		//List, Set, Random ����
		ArrayList<Integer> result = new ArrayList<>();		
		Set<Integer> lottoStore  = new TreeSet<>();
		Random random = new Random();
		
		//Set �� ���� 6������ ����
		while(true) {
			lottoStore.add(random.nextInt(45)+1);
			if(lottoStore.size()==6) {
				break;
			}
		}
		
		//List�� ���� ����
		Iterator<Integer> iterator = lottoStore.iterator();
		while(iterator.hasNext()) {
			result.add(iterator.next());
		}
		
		return result;
	}
}

// -����-
// ���� �迭 : ũ�⸦ �������� �ʴ� ��ü �迭
// ���� : List, Set, Map
// 		List = �ε����� ���� ������ �ִ� �迭
// 		Set = ����Ʈ�� ���������� �ߺ����� �Էµ��� �ʴ´�.
//		Map = Ű�� ���� ������ �ִ� ���� �迭, ���� �ߺ��� ���ȴ�.
//			Map map = new Hashmap();
//				map.put("Ű", ��);
