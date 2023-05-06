/** Name: Miguelito Jean
 * Class : CSC205
 */
package activities.activity3;


public class Task implements Priority {
	
	private int priority;
    private String toDo;

	
	public Task(int pNum , String doTask) {
		priority = pNum;
		toDo = doTask;
	}
	
	
	@Override
	public void setPriority(int p) {
		priority  = p;
		
		 

	}

	@Override
	public int getPriority() {
		
		 
		return priority;
	}
	
	public String toString() {
		return ("Current priority: " + priority + "-" + toDo);
	}

}
