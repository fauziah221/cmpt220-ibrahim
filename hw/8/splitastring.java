//package cmpt220;

import java.util.ArrayList;

public class splitastring {
	public static ArrayList<String> split(String s, String delimiters) {
		ArrayList<String> display = new ArrayList<String>();
		ArrayList<Character> d = new ArrayList<Character>();

		for (int i = 0; i < delimiters.length(); ++i) {
			d.add(delimiters.charAt(i));
		}

		int i = 0;
		int j = i + 1;

		while (j < s.length()) {
			if (d.contains(s.charAt(j))) {
				String t = s.substring(i, j);
				display.add(t);
				i = j + 1;
				++j;
			}

			else {
				++j;
			}
		}

		return display;
	}

	public static void main(String[] args) {
		System.out.println(split("AB#C D?EF#45", "# ?"));
	}
}
