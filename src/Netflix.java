
public class Netflix {
	public static void main(String[] args) {
		Movie m1 = new Movie("Toy Story", 5);
		Movie m2 = new Movie("Good Will Hunting", 5);
		Movie m3 = new Movie("Titanic", 5);
		Movie m4 = new Movie("The Bee Movie", 4);
		Movie m5 = new Movie("Are We There Yet?", 1);

		String price = m5.getTicketPrice();
		System.out.println(price);

		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(m1);
		queue.addMovie(m2);
		queue.addMovie(m3);
		queue.addMovie(m4);
		queue.addMovie(m5);
		queue.sortMoviesByRating();
		queue.printMovies();

		System.out.println("The best movie is" + queue.getBestMovie());

		System.out.println("The second best movie is" + queue.getMovie(0));

	}

}
