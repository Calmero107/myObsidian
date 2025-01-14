package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAndArray {

	private final int id;
	private final String code;
	private final String domain;

	public ArrayListAndArray(int id, String code, String domain) {
		this.id = id;
		this.code = code;
		this.domain = domain;
	}

	public static ArrayListAndArray of(int id) {
		return new ArrayListAndArray(id, null, null);
	}

	public static void main(String[] args) {
//		array();

		Integer i = null;
		System.out.println(i > 0);
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
