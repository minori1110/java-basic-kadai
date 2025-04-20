package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.nextLine();

			if (input.length() == 1) {
				if (input.equals("r") || input.equals("s") || input.equals("p"));
				return input;
			}

		}

	}

	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		//配列でじゃんけんの手をセット
		String[] jyankenArray = { "r", "s", "p" };

		//乱数でじゃんけんを選ぶ
		int index = (int) (Math.floor(Math.random() * jyankenArray.length));
		String opponent = jyankenArray[index];

		//じゃんけんの手を返す
		return opponent;
	}

	//じゃんけんを行う
	public void playGame() {

		HashMap<String, String> jyankenMap = new HashMap<String, String>();

		String myChoice = getMyChoice();
		String opponentChoice = getRandom();
		String key = myChoice + "," + opponentChoice;

		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");

		//自分と対戦相手のじゃんけんの手を出力する
		System.out.println("自分の手は" + jyankenMap.get(myChoice) + ",対戦相手の手は" + jyankenMap.get(opponentChoice));

		//自分と対戦相手のじゃんけんの手を比較する
		switch (key) {
		case "r,r", "s,s", "p,p" -> System.out.println("あいこです");
		case "r,s", "s,p", "p,r" -> System.out.println("自分の勝ちです");
		case "r,p", "s,r", "p,s" -> System.out.println("自分の負けです");
		}

	}

}
