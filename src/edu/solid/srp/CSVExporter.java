package edu.solid.srp;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author andreza.cascais 
 *         
 *         This class will be responsible for the format of the
 *         recommendations we currently have in a method of
 * 
 *         the recommender class. The signature for the method we will create is
 *         public string export.
 * 
 *         We name it export.
 * 
 *         And as a parameter, we tell it that the list of movies to export.
 *
 */
public class CSVExporter {
	
	public String exportMovie(List<Movie> moviesRecommendations) {

		return moviesRecommendations.stream()
				.map(p -> (p.getTitle() + "," + p.getGenre() + "," + p.getDirector()))
				.collect(Collectors.joining("\n"));
	}

}
