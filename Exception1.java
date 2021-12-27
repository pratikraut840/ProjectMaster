package Exception;

public class Exception1 {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=0;   //10/0=infinity
		String s=null;
		
		int arr[]=new int [7];
		
		
	
		try {

			//int div=a/b;// risky code
			//System.out.println(div);
			arr[9]=10;// risky
			System.out.println(arr[1]);
			
		} 
		
		catch (ArithmeticException e) //specific
		{
			
			System.out.println("Good morning");
			System.out.println("Divide by zero not possible");
			System.out.println("Hi All");
			e.printStackTrace();
		}
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array indexOfBoundException");
		}
		
		
		catch (NullPointerException e) {
			
			System.out.println("Cannot perform operation on Null point");
		}
		
		catch (Exception e) {//generic exception
			//e.printStackTrace();
			System.out.println("Something went wrong");
		}
		
		finally {
			System.out.println("This will run always");
			
		}
		
	}

}
