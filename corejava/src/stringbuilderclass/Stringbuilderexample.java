package stringbuilderclass;

public class Stringbuilderexample {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("welcome");
		System.out.println(s);
		s.append("to tkr");
		System.out.println(s);
		s.insert(1, "csg");
		System.out.println(s);
	}

}
