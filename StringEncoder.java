package string.encoder;

import java.util.Scanner;

public class StringEncoder {

	private static final int OFFSET_ONE = 1;
	private static final int OFFSET_TWO = -1;
	private static final char INITIAL_CHAR = 'a';
	private static final char LAST_CHAR = 'z';

	private static String encode(int offset, String original) throws InvalidOffset {
		System.out.println("offset is"+ offset);
		System.out.println("original is"+ original);
		if (!(offset == OFFSET_ONE || offset == OFFSET_TWO))
			throw new InvalidOffset("offset not valid");
		
		
		StringBuilder output = new StringBuilder();
		for (char i = 0; i < original.length(); i++) {
			char ch = original.charAt(i);
			if (ch >= INITIAL_CHAR && ch <= LAST_CHAR) {
				if (offset == OFFSET_ONE) {

					if (ch != LAST_CHAR)
						output.append((char) (original.charAt(i) + offset));
					else
						output.append(INITIAL_CHAR);
				} else {

					if (ch != INITIAL_CHAR)
						output.append((char) (original.charAt(i) + offset));
					else
						output.append(LAST_CHAR);
				}

			}else {
			output.append(ch);}
		}
		return output.toString();
	}

	public static void main(String[] args) {
		System.out.println("Please input your string\n");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println("Please input the offset\n");
		int  offset = sc.nextInt();
		StringEncoder test = new StringEncoder();
		try {
			System.out.println(test.encode(offset, inputString));
		} catch (InvalidOffset e) {
			System.out.println(e.getMessage());
		}

	}
}
