package mypack;

public class Population {

	public static void main(String[] args) {
		
		int starting_population = 175000;
		int population_after_decade = 262500;
		int remaining_population = 262500 - 175000;
		int total_no_of_years = 10;
		
		int total_population = (remaining_population*100)/175000;
		int population_increased_per_year = total_population/total_no_of_years;
		
		System.out.println("Average population increased "+ population_increased_per_year + "%");
		

	}

}
