/** Name: Miguelito Jean
 * Class : CSC205
 */
package activities.activity6;


public class activity6 {

	public static void main(String[] args) {
		Team<String> city = new LinkedListTeam<String>();
		Team<String> favMovies = new LinkedListTeam<String>();
		
		city.add("New York");
		city.add("Las Vegas");
		city.add("Paris");
		city.add("London");
		
		favMovies.add("Dune");
		favMovies.add("Blade Runner 2049");
		favMovies.add("Man Of Steel");
		
		System.out.println("Cities around the world: ");
		for(String c : city) {
			System.out.println(" " + c);
		}
		
		System.out.println();
		
		System.out.println("My favorite movies are: ");
			for(String f : favMovies) {
				System.out.println(" " + f);
			}
		}

	}


