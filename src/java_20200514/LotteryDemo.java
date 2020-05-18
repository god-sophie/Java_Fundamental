package java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		// 로또복권
		// 1. 1부터 45까지의 숫자 중 6개를 생성한다.
		// 2. 6개의 숫자 중 중복된 숫자가 나오면 안된다.
		// 3. Math.random() => 0 보다 크거나 같고 1보다 작은 양수를 
		//    double 값으로 반환한다. 0.00000 ~ 0.999999
		
		// 1~45의 임의 랜던값을 반환
		
		int [] lotto = new int[6];
		
		for(int i = 0; i<lotto.length; i++) {
			int random = (int)(Math.random()*45) + 1;
			
			// 중복되는 값이 있는지 체크
			boolean isExisted = false;
			
			// 중복 체크하는 코드 *가장중요* 이해하쟝쟝쟝쟝쟝쟈얒ㅇ
			for (int j = 0; j < i; j++) {
				if(lotto[j]==random) {
					isExisted = true;
					break;
				}
			}
			if(!isExisted) {
				lotto[i] = random;
			}else {
				i--;	// 중복이되는값이있으면 계속 그 자리에 있어야함 그래서 i-- 
				// i-- 가 없으면 중복되었을 경우 0으로 출력됨.
			}
			/*
			for(int j = 0; j<i; j++) {
				while (random == lotto[j]) {
					random = (int)(Math.random()*45) + 1;
				}
			}
			lotto[i] = 
			*/
		}
		
		// bubble sort(ascending)
		// 버블솔팅하지마 쓸대없는크기증가14번만하면될걸22번하고있네
		// 오름차순
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - (i+1); j++) {
				if(lotto[j] > lotto[j + 1]) {
					int temp = lotto[j+1];
					lotto[j+1] = lotto[j];
					lotto[j] = temp;
					
				}
			}
		}
		
		/*
		// 내림차순
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - (i+1); j++) {
				if(lotto[j] < lotto[j + 1]) {
					int temp = lotto[j+1];
					lotto[j+1] = lotto[j];
					lotto[j] = temp;
					
				}
			}
			*/
			
		for(int value : lotto) {
			System.out.print(value +"\t");
		}
		
		// 역시 git은 조하!
		
	}
}
