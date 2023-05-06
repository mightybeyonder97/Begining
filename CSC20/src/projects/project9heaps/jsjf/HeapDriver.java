/** Name: Miguelito Jean
 * Class : CSC205
 */
package projects.project9heaps.jsjf;

/**
 * @author migue
 *
 */
//import projects.project9heaps.csc205.*;
//import projects.project9heaps.jsjf.HeapQueue;
//import projects.project9heaps.jsjf.HeapStack;
import projects.project9heaps.csc205.Sorting;
public class HeapDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] myString = {"This", "is", "my", "heaps", "project", "for", "CSC205"};
		HeapStack<String> hstack = new HeapStack<String>();
		HeapQueue<String> hqueue = new HeapQueue<String>();
		LinkedHeap<String> hyppo = new LinkedHeap<String>();
		System.out.println("First 4 of mystring: " +	Sorting.smallest_n(myString, 4));
		
		
		System.out.println();
		hstack.push("This");
		hstack.push("is");
		hstack.push("my");
		hstack.push("heaps");
		//hstack.push("project");
		//hstack.push("for");
		//hstack.push("CSC205");
		for(String s: myString) {
			//hstack.push(s);
			
			hqueue.enqueue(s);
			hyppo.addElement(s);
		}
		System.out.println("Top of HeapStack : " + hstack.peek());
		System.out.println("Top of HeapQueue : " + hqueue.first());
		System.out.println();
		
		System.out.print("HeapStatk of: " + hstack.size()+ ": ");
		while(hstack.size() > 0) {
			System.out.print(" " + hstack.pop());
		}
		System.out.println();

		System.out.print("HeapQueue of " + hqueue.size() + ": ");
		while(hqueue.size() > 0) {
			System.out.print(hqueue.dequeue() + " ");
	}
		System.out.println();
		System.out.print("Min heap of : " + hyppo.size()+ ": ");
		while(hyppo.size() > 0) {
			System.out.print(hyppo.removeMin() + " ");
	}
	}
}
