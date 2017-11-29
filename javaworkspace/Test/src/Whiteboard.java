import java.util.Scanner;

public class Whiteboard {
	public static void main(String[] args) {
		int getNum = 0;
		int rn = 0, cn = 0;
		int num = 1;

		Scanner scanner = new Scanner(System.in);
		getNum = scanner.nextInt();

		int[][] array = new int[getNum][getNum];

		for (int i = 0; i < getNum; i++) {
			rn += i;
			System.out.println(rn+"/"+cn);
			
			array[rn][cn] = num++;
		}

		for (int k = getNum; k > 0; k--) {
			for (int j = 0; j < k; j++) {
				cn += Math.pow(-1, k);
				array[rn][cn] = num++;
			}
			for (int i = 0; i < k; i++) {
				rn += Math.pow(-1, k - 1);
				array[rn][cn] = num++;
			}
		}

		for (rn = 0; rn < getNum; rn++) {
			for (cn = 0; cn < getNum; cn++)
				System.out.print(array[rn][cn]);
		}

	}
}
