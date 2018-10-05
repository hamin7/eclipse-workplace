import java.util.Scanner;

public class Starman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year[] = { 1967, 1969, 1970, 1971, 1972, 1973, 1973, 1974, 1975, 1976, 1977, 1977, 1979, 1980, 1983, 1984,
				1987, 1993, 1995, 1997, 1999, 2002, 2003, 2013, 2016 };
		String album[] = { "DavidBowie", "SpaceOddity", "TheManWhoSoldTheWorld", "HunkyDory",
				"TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars", "AladdinSane", "PinUps", "DiamondDogs",
				"YoungAmericans", "StationToStation", "Low", "Heroes", "Lodger", "ScaryMonstersAndSuperCreeps",
				"LetsDance", "Tonight", "NeverLetMeDown", "BlackTieWhiteNoise", "1.Outside", "Earthling", "Hours",
				"Heathen", "Reality", "TheNextDay", "BlackStar" };
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int count = 0;
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int j = 0; j < year.length; j++) {
				if (year[j] >= x && year[j] <= y) {
					count ++;
				}else
					continue;
			}
			System.out.println(count);
			for (int l = 0; l < year.length; l++) {
				if (year[l] >= x && year[l] <= y) {
					System.out.println(year[l]+" "+album[l]);
				}else
					continue;
			}
			

		}

	}
}