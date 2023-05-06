package videoexamples.module06;

import videoexamples.module06.jsjf.*;
import java.util.Random;


public class ListExamples {

	public static void main(String[] args) {
		OrderedListADT<Integer> orderedList = new ArrayOrderedList<Integer>(2);
		UnorderedListADT<Integer> unorderedList1 = new ArrayUnorderedList<Integer>(2);
		UnorderedListADT<Integer> unorderedList2 = new ArrayUnorderedList<Integer>(2);
		
		Random gen = new Random();
		
		for (int ii=0;ii<10;ii++) {
			int num = gen.nextInt(100);
			orderedList.add(num);
			unorderedList1.addToFront(num);
			unorderedList2.addToRear(num);
		}
		
		System.out.println("OrderedList [" + orderedList.size() + "]: " + orderedList);
		System.out.println("UnorderedList1 [" + unorderedList1.size() + "]: " + unorderedList1);
		System.out.println("UnorderedList2 [" + unorderedList2.size() + "]: " + unorderedList2);
	}

}
