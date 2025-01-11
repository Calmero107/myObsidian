package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAndArray {
	public static void main(String[] args) {
//		array();

		Integer a = 128;
		Integer b = 128;

		System.out.println(a == b);
	}

	private static void array() {
		String[] stringArr = new String[]{"hello", "world", "!"};
		stringArr[0] = null;
		System.out.println(Arrays.toString(stringArr));// [goodbye, world, !]
		System.out.println(stringArr.length);

		for (int i = 0; i < stringArr.length - 1; i++) {
			stringArr[i] = stringArr[i + 1];
		}
		stringArr[stringArr.length - 1] = null;
		System.out.println(stringArr.length);
		System.out.println(Arrays.toString(stringArr));// [world, !, null]
	}

	private static void arrayList() {
		ArrayList<String> stringList = new ArrayList<>(Arrays.asList("hello", "world", "!"));
		stringList.add(null);
		System.out.println(stringList);// [hello, world, !, goodbye]
		stringList.set(0, "hi");
		System.out.println(stringList);// [hi, world, !, goodbye]
		System.out.println(stringList.size());

		stringList.remove(0);
		System.out.println(stringList.size());

		System.out.println(stringList); // [world, !, goodbye]
	}
}
