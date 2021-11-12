package edu.solid.srp;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author andreza.cascais
 * 
 * The recommender class is therefore only responsible for obtaining recommendations for a client.
 *
 */
public class Recommender {

	public List<Movie> recommendations(Client client) {

		List<Movie> recommended = new ArrayList<>();

		for (Movie favorite : client.getFavorites())
			recommended.addAll(BBDD.MOVIES_BY_DIRECTOR.get(favorite.getDirector()));
		
		// recommended.removeAll(client.getFavorites());

		return recommended;
	}

}
