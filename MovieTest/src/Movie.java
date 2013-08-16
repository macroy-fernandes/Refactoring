
public class Movie {
	MovieType movieType;
	String movieName;
	int price;
	
	public Movie(String name, MovieType type) {
		// TODO Auto-generated constructor stub
		this.movieName = name;
		this.movieType=type;
	}

	public int getCharge(String movieName,int daysRented)
	{
		MovieType movieType=this.getMovieType(movieName);
				int price=this.getPrice(daysRented);
		return price;
		
	}

	private int getPrice(int daysRented) {
		// TODO Auto-generated method stub
		return daysRented*100;
	}

	private MovieType getMovieType(String movieName) {
		return this.movieType;
		// TODO Auto-generated method stub
		
	}
}
