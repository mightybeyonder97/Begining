package projects.project6stackqueue.csc205;

import java.util.Arrays;

import projects.project6stackqueue.jsjf.*;

public class StackQueueUtil {
	
	
	public static boolean isPalindrome(String s) {
		 LinkedQueue <String> pal = new LinkedQueue <String>();
		
		
		while (pal.isEmpty()) {
			
		s.equalsIgnoreCase(s); 
		pal.enqueue(s);
		}
				
		
		while(!pal.isEmpty()) {
			
			if (s.length() == 0 || s.length() == 1) {
				pal.dequeue();
				return true;
			}
				else if(s.charAt(0) == s.charAt(s.length() - 1)) {
					pal.dequeue();
					return isPalindrome(s.substring(1 , s.length() -1));
			} 
			pal.dequeue();
		
		
	}
		return false;
	}

	public static String reverseWords(String s) {
		LinkedStack<String> stk = new LinkedStack<String>();
		String tempS = " ";
		
		while(stk.isEmpty()) {
			
			stk.push(s);
			for (int i = s.length()-1; i >=0 ; i--) {
				
				tempS+= s.charAt(i);	
			}
			
		}
			while(!stk.isEmpty()) {
					
				stk.pop();
				
				System.out.print(s +" .");			
		}
			return tempS;
	} 
		
	
	
		
	

	public static boolean checkArrays(int min, int max, int arr1[], int arr2[]) {
		LinkedQueue<Integer> check = new LinkedQueue<Integer>();
		
		
		for(int i = 0; i < arr1.length; i ++) {
			check.enqueue(i);
			System.out.print( arr1[i] + " ");
			
		}
		System.out.println();
			for(int l = 0; l < arr2.length; l++ ) {
				check.enqueue(l);
				System.out.print( arr2[l] + " ");
			
			}
			
		if (arr1[min] < arr2[max]) {
			Arrays.equals(arr1, arr2);
			return true;
		}
		
		return false;
	
}
}
