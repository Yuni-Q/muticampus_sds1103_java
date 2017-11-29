package test03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] nums = {10,20,30,40};
		
		for( int n: nums ){
			System.out.println("숫자:"+n);
		}
		
		for(int i=0; i<nums.length; i++){
			System.out.println("숫자:"+nums[i]);
		}
		
		String s = "apple";
		switch(s){
		case "abc":
			break;
		case "apple":
			break;
		}
	}
}
