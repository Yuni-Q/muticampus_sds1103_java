





// break 문장이 실행되면 현재 진행중이던 반복문이 종료됨.
public class Test15 {
	public static void main(String[] args) {
		for(int i=1; i<=20; i++){
			
			if(i == 10){
				break;
			}
			System.out.println("i:" +i);
		}
	}
}
