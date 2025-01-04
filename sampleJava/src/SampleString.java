public class SampleString {

	private static void testStringBuilderAndBuffer() {
		String string = "abc";
		System.out.println(string.hashCode());

		string = "123";
		System.out.println(string.hashCode());

		string = "abc";
		System.out.println(string.hashCode());

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("abc");
		System.out.println(stringBuffer.hashCode());

		stringBuffer.append("123");
		System.out.println(stringBuffer.hashCode());
	}

	private static void appendAndAddOperator() {
		String str1 = "he";
		String str2 = "llo";
		String str3 = "world";
		String str4 = str1 + str2 + str3;
	}

	private static void addOperatorConstantsANdVariable() {
		String str1 = "str";
		String str2 = "ing";
		String str3 = "str" + "ing";
		String str4 = str1 + str2;
		String str5 = "string";
		String str6 = str4.intern();
		System.out.println(str3 == str4);
		System.out.println(str3 == str5);
		System.out.println(str4 == str5);
		System.out.println(str6 == str5);
	}

	private static void testInternMethod() {
		// s1 指向字符串常量池中的 "Java" 对象
		String s1 = "Java";
	// s2 也指向字符串常量池中的 "Java" 对象，和 s1 是同一个对象
		String s2 = s1.intern();
	// 在堆中创建一个新的 "Java" 对象，s3 指向它
		String s3 = new String("Java");
	// s4 指向字符串常量池中的 "Java" 对象，和 s1 是同一个对象
		String s4 = s3.intern();
	// s1 和 s2 指向的是同一个常量池中的对象
		System.out.println(s1 == s2); // true
	// s3 指向堆中的对象，s4 指向常量池中的对象，所以不同
		System.out.println(s3 == s4); // false
	// s1 和 s4 都指向常量池中的同一个对象
		System.out.println(s1 == s4); // true
	}

	public static void main(String[] args) {
		addOperatorConstantsANdVariable();


		Integer a1 = 3;
		Integer a2 = 3;
		System.out.println(a1 == a2);

		Integer a3 = 128;
		Integer a4 = 128;
		System.out.println(a3 == a4);
	}

}
