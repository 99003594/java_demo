package stringbuffer;

public class stringbuffer_length {
	public static void main(String[] args) {
		  
	      StringBuffer buff = new StringBuffer("Tutorials");
	      
	      // printing the length of stringbuffer
	      System.out.println("length = " + buff.length());

	      buff = new StringBuffer("");
	      
	      // printing the length of empty stringbuffer
	      System.out.println("length = " + buff.length());
	   }
}