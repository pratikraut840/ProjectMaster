package Exception;

public class Exception2 {
	
	// Study of finally block

	public static void main(String[] args) {
		
		int a=9;
		int b=5;
		String s="Marvel";
		String s1=null;
		
		System.out.println(s1.length()); //When we wrote null value then Nullpointer exception occurs
		
		System.out.println(s);
		
		try { System.out.println(s1.length());
			
		} 
		catch (NullPointerException e) {
			System.out.println("Please check string s1");
			
		}
		catch (ArithmeticException e){
			System.out.println("Please check Arithmatic expression");
			
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			
		}
		catch (Exception e) {
			System.out.println("Generic Expection");
			
		}
		finally {
			System.out.println("Finally block will run always");
		}

	}

}
