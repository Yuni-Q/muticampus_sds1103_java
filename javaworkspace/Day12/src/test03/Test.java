package test03;

import java.util.HashSet;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		
		for(int i=0; i<6; i++){
			int random = new Random().nextInt(45)+1;
			System.out.println("��������:"+random);
			
			if(lotto.add(random) == false){
				System.out.println("�� ���ڴ� ����!! : "+random);
				i--;
			}
		}
		
		System.out.println(lotto);
	}
}
