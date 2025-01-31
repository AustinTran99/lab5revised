package edu.pcc.cis233j.countries;
import java.util.List;
/**
 * A country in the world
 * @author Cara Tang
 */
public class Country {
	private int id;
	private String name;
	private long population;
	private double medianAge;
	private long coastlineKm;
	private List<String> languages;
	/**
	 * Create a Country object with the given properties
	 */
	public Country(int id, String name, long population, double medianAge, long coastlineKm) {
		this.id = id;
		this.name = name;
		this.population = population;
		this.medianAge = medianAge;
		this.coastlineKm = coastlineKm;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getPopulation() {
		return population;
	}

	public double getMedianAge() {
		return medianAge;
	}

	public long getCoastlineKm() {
		return coastlineKm;
	}

	public void addEmailAddress(String email)
	{
		languages.add(email);
	}

	public List<String> getLanguages()
	{
		return languages;
	}
}
