# Lotto 번호 추출 문제

## __문제__
Lotto 번호(1~45)를 랜덤으로 6개 선택

### __풀이__
배열과 랜덤함수, 반복문 이용
1. 6개의 숫자를 랜덤으로 받는다.
2. 중복이 될 경우 예외처리를 한다.
</br>- 중복된다면 앞으로 돌아가서 다시 선택

#### __소스 코드__
``` java
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
  }
  return result;
}
```

위의 예외처리를 아래와 같이 무한루프를 이용하여 작성할 수도 있다.
```java
//중복 값 예외처리 2
for(int overlapIndex=0 ; overlapIndex<index ; overlapIndex++) {
  while(true) {
    if(result[index]!=result[overlapIndex]) {
      break;
    } else {
      result[index] = random.nextInt(45)+1;
    }
  }
}
```

### __풀이-2__
List를 이용
1. List와 Set과 Random을 정의한다.
2. Set에 로또의 번호를 저장한다.
3. Set에 저장된 번호를 List에 저장한다.

#### __소스 코드__
```java
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
```
#### 참고
-참고-</br>
동적 배열 : 크기를 제한하지 않는 객체 배열</br>
종류 : List, Set, Map</br>
		List = 인덱스와 값을 가지고 있는 배열</br>
 		Set = 리스트와 유사하지만 중복값이 입력되지 않는다.</br>
		Map = 키와 값을 가지고 있는 동적 배열, 값의 중복이 허용된다.</br>
			  Map map = new Hashmap();</br>
				map.put("키", 값);</br>
