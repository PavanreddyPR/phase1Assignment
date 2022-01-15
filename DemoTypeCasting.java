package phase1Assignment;

public class DemoTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		// 1- widening casting  --> auto 
		
		// byte--> short--> char--> int--> long--> float--> double 
		byte c = 90; 
		int a= c; 
		double b=c; 
		System.out.println(a); 
		System.out.println(b); 
		 
		/* 
		 * 2- Narrow casting --> manual 
		 * 
		 * double--> float --> long-->int --> char --> short -->byte 
		 */ 
		double d= 2.15; 
		int i=(int)d; 
		long l =(long)d; 
		System.out.println("double to int "+i); // output = 2
		System.out.println("double to long "+l);// output= 2
		
		// String --> int, double,long, byte....
		
		String s= "2.15"; 
		double sDoub = Double.valueOf(s); 
		double sumDoub= sDoub + 3.1; 
		System.out.println("String to double  "+sDoub);
		System.out.println("sum double  "+sumDoub); 
		
		String s1= "90"; 
		long sByte = Long.valueOf(s1); 
		System.out.println("String to byte  "+sByte);
		
		// int,long,short,double,...--> String 
		long num =1826; 
		String stNum = String.valueOf(num);  
		System.out.println("Long to String  "+(stNum + 123)); 
	
		/* Integer.valueOf() returns an integer object 
		 * which is equivalent to a new Integer(Integer.parseInt(s)).
		 * 
		 */
		
		String str = "25";
        try{
            Integer number = Integer.valueOf(str);
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        
        /*Now, let's try to break the above code
         *  by inputting an invalid integer number: 
         */
        String str1 = "25TA";
        try{
            Integer number = Integer.valueOf(str);
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
		
	}

}
