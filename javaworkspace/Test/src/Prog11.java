import java.util.Scanner;

public class Prog11 {
	public static void main(String[] args) {
		int year, month, days;

		int total_days = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력해: ");
		year = scan.nextInt();
		System.out.print("월 입력해: ");
		month = scan.nextInt();
		System.out.print("일 입력해: ");
		days = scan.nextInt();

		total_days += (year - 1900) * 365;
		total_days += (year - 1900) / 4;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			total_days -= 1;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;

		}
	}
}
