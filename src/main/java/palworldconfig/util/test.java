package palworldconfig.util;

public class test {
	public static void main(String[] args) {
		String s = "3000.000000";
		System.out.println(s.contains("."));
		System.out.println(s.contains("\\."));


		for (String s1 : s.split(".")) {
			System.out.println(" s1 : " + s1);
		}
		for (String s2 : s.split("\\.")) {
			System.out.println(" s2 : " + s2);
		}
	}
}
