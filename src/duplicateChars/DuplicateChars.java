package duplicateChars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateChars {

	public static void main(String args[]) {

		duplicateChars();

	}

	public static void duplicateChars() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scanner.next();
		System.out.println(word);

		char[] chars = word.toCharArray();
		int duplicateCount = 0;
		List<Character> duplicateList = new ArrayList<Character>();
		List<Integer> alreadyChecked = new ArrayList<Integer>();

		for (int i = 0; i <= chars.length - 1; i++) {

			for (int x = 0; x <= chars.length - 1; x++) {

				if (i == x) {
					continue;
				}

				if (alreadyChecked.contains(i)) {
					continue;
				}

				if (chars[i] == chars[x]) {

					if (duplicateList.contains(chars[i])) {
						continue;
					}

					duplicateCount++;
					alreadyChecked.add(i);
					duplicateList.add(chars[x]);
				}
			}
		}

		if (duplicateCount != 0) {
			System.out.println("Duplicate character count: " + duplicateCount);
		} else {
			System.out.println("There are no duplicates");
		}

		for (char c : duplicateList) {
			System.out.print(c + " - ");
		}

	}

}
