/** Name: Miguelito Jean
 * Class : CSC205
 */
package projects.project4.csc205;



public class Recursion {
	
	
    
    public static int fib (int n)
    {
    	int fibNum;
    	if (n <= 0) {
    		fibNum = 0;
    	}
    	else if(n <= 2) {
    		fibNum = 1;
    	}
    	else {
    	
        fibNum = (fib(n -1) + fib(n-2));
    	}
    	return fibNum;
    	
    }
     
    public static int power (int x, int y)
    {
    	if (y <= 0) {
    		return 1;
    	}
    	else {
        return (x * power(x, y-1));
    	}
    }
     
    public static int ackermann(int m, int n)
    {
    	if( m  == 0) {
    		return n + 1;
    	}
    	else if ( m > 0 & n == 0) {
    		return (ackermann(m-1, 1));
    	}
    	else  {
        return (ackermann(m-1,ackermann(m, n -1)));
    	}
    }

   
    
    public static int balance (int x, int y)
    {	
    	int mean;
    	
    	
    	if (x + 1 == y  && y-1 == x) {
    	
    		return x;
    	}
    	
    	else if(y + 1 == x && x - 1 == y) {
    		
    		return y;
    	}
    	 if (y<=0) {
     		return 0;
     	}
     	
    	
    	if (x < y ) {
    		y-= 1;
    		
    		mean = (1 +  balance(x ,y-1));
    		return mean;
    	}
    	
    	else  {
    	x -= 1;
    	
    	mean =	( 1 +  balance(x-1,y) );
    	
    	return  mean;
    	}
    	
    	}

	public static double pi_approximation(int n)
	{
		
		if (n <= 0) {
			return 0;
		}
		
		else {
			return ((Math.pow(-1, n+1) * 4) / ((2*n)-1)) + pi_approximation(n-1);
		}
			
	}

	public static boolean isPalindrome(String s)
	{ 
		if(s.length() == 0 || s.length()==1) {
            return true;
        }
        
        else if (s.charAt(0) == s.charAt(s.length()-1)) {
        
        return isPalindrome(s.substring(1, s.length()-1)); 
        }
        
        return false;
    }
		
	
		
	public static boolean monotonicallyIncreasing(Integer[] a)
	{ 
			return false;
		}
	
	public static Integer func1 (int n) {
		if (n == 1) {
			return 10;
		}
			else {
				return func1(n-1) + 3;
			}
		}
	public static Integer func2 (int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return (n*n) * func2(n - 1);
		}
	}
	public static Integer func3 (int n) {
		if (n == 1) {
			return -1;
		}
		else {
			return  n-2- func3(n-1);
		}
	}
	public static Integer tribonacci (int n) {
		if (n == 1 || n == 2) {
			return 1;
	}
		else if (n == 3) {
			return 2;
		}
		else {
			return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
		}
	}
	public static Integer add(int x , int y) {
		if (y == 0) {
			return x;
		}
		else {
			return (1 +  add(x , y-1));
		}
	}
	public static Integer printDownFrom(int n) {
		int downNum = 0;
		System.out.print(" " + n);
		if (n == 1) {
			return 1;
		} 
		
		else 
			
			  downNum = n+ printDownFrom(n-1);
		
		
		return downNum;
		
	}
	public static Integer printUpTo(int n) {
		int upNum = 0 ;
		
		if (n >=1 && n <= 20) 
			 upNum =  1 + printUpTo(n - 1);
		
		System.out.print(" " + n);
		return upNum;
		
	}
	public static Integer gcd(int x , int y) {
		if ( y == 0 ) {
			return x;
		}
		else if ( x < y) {
			return gcd( y , x);
		}
		else {
			return gcd(y , x % y);
		}
	}
	public static Integer collatz(int n) {
		if(n == 1) {
			System.out.print(" "+ n);
			System.out.println();
			return 1;
	} 
		 if ( n % 2 == 0) {
			 
			System.out.print(" " + n);
			
			return collatz(n/2);
			
		 }
		
		else {
			
			System.out.print(" " + n);
			return collatz((3 * n) + 1);
			
		}
		
	}
}
	
	
	


