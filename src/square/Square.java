package square;

public class Square 
{
	 public static void main(String[] args)
	    {
	        //Number for which square root is to be found
	        double number = 1000;
	  
	        //This method finds out the square root
	        findSquareRoot(number);
	  
	    }
	  
	    /*This method finds out the square root without using
	    any built-in functions and displays it */
	    public static void findSquareRoot(double number)
	    {
	  
	        boolean isPositiveNumber = true;
	        double g1;
	        int count = 0;
	        //if the number given is a 0
	        if(number == 0)
	        {
	            System.out.println("Square root of "+number+" = "+0);
	        }
	  
	        //If the number given is a -ve number
	        else if(number < 0)
	        {  
	            number = -number;
	            isPositiveNumber = false;
	        }
	          
	        //Proceeding to find out square root of the number
	        double squareRoot = number/2;
	        do
	        {
	        	count++;
	            g1 = squareRoot;
	            squareRoot = (g1 + (number/g1))/2;
	        }
	        while((g1-squareRoot)!=0);
	  
	        //Displays square root in the case of a positive number
	        if(isPositiveNumber)
	        {
	            System.out.println("Square roots of "+number+" are ");
	            System.out.println("+"+squareRoot);
	            System.out.println("-"+squareRoot);
	        }
	        //Displays square root in the case of a -ve number
	        else
	        {
	            System.out.println("Square roots of -"+number+" are ");
	            System.out.println("+"+squareRoot+" i");
	            System.out.println("-"+squareRoot+" i");
	        }
	        System.out.println("Count " + count);
	    }	
}
