package Game;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("<UP AND DOWN 게임>");
		System.out.println("0부터 255까지 숫자 중에 하나를 뽑겠습니다.");
		System.out.println("랜덤 숫자를 주어진 기회 안에 찾아야 합니다.");
		System.out.println("제가 뽑은 숫자를 맞춰보세요.");


		Random random = new Random();
		int randomNuber = random.nextInt(256);

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println(10 - i + "번 기회가 있습니다.");

			try {
				String guess = sc.nextLine();
				int guessNubmer = Integer.parseInt(guess);

				if (guessNubmer == randomNuber) {
					System.out.println("축하합니다. 숫자를 맞추셨습니다!");
					break;

				} else if (guessNubmer < randomNuber) {
					System.out.println("추측하신 숫자가 예상보다 작습니다.");

				} else {
					System.out.println("추측하신 숫자가 예상보다 큽니다.");

				}
				if (i == 9) {
					System.out.println("기회가 없습니다.");
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요!!");
			}
		}
		sc.close();
		System.out.println("게임을 종료합니다.");
	}
}