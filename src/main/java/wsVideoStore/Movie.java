package wsVideoStore;

public abstract class Movie
{
	private String title;
    private int priceCode;

	public Movie(String title) {
		this.title 		= title;
	}
		
	public String getTitle () {
		return this.title;
	}
	public int getPriceCode(){
		return this.priceCode;
	}
	public static final int REGULAR = 5;
	public static final int NEW_RELEASE = 4;
	public static final int CHILDRENS = 3;

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);
}