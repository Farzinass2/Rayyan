package farzinaTechzmatrix;

public class stringcmp12 {

	public static void main(String[] args) {
		String str1 = "seleniumA";
		String str2 = "SELENIUM";
		String str3 = "seleniumC";
		String str4 = "selenium";
        System.out.println(str1.compareTo(str2));//Positive value
		System.out.println(str1.compareTo(str3));//Negative value
		System.out.println(str1.compareTo(str4));//0
	}
}
