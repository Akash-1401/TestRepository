
public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a proogram for reverse string
		String str = "Akash", nstr = " ";
		char ch;
		System.out.println("Original String");
		System.out.println("Akash");
		for (int i=0;i<str.length();i++) {
			// extract each chractor 
			ch = str.charAt(i);
			//add each chrator of existing string 
			nstr = ch+nstr;
		}
		System.out.println("Reverse Word:"+ nstr);

	}	

}

