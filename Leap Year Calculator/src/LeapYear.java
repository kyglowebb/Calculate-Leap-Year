
public class LeapYear {

	public static void main(String[] args) {
		boolean check = isLeapYear(-1600);
		System.out.println(check);
		
		boolean check2 = isLeapYear(1600);
		System.out.println(check2);

		boolean check3 = isLeapYear(2017);
		System.out.println(check3);

		boolean check4 = isLeapYear(2000);
		System.out.println(check4);

		
	}
	 public static boolean isLeapYear(int year) {
	     if(year < 1 || year > 9999) {return false;}
	     else{
	         if((year % 4) == 0 || (year % 400) == 0) {
	             return true;
	         }
	         else {return false;}
	     }	
	 }
}
