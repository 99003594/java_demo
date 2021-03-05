package string;

public class stringequals {
	public static void main(String args[]){  
		String s1="stringequals";  
		String s2="stringequals";  
		String s3="STRINGEQUALS";  
		String s4="java";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
		}
}