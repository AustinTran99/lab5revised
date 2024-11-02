package edu.pcc.cis233j.countries;

import java.util.List;

/**
 * Read from the Country database and print data on the countries
 * @author Cara Tang
 */
public class Main {
	public static void main(String[] args) {
		CountryDB cdb = new CountryDB();
		List<Country> countries = cdb.getCountries();
		for(Country x: countries)
		{
			System.out.println("Country Information");
			System.out.println("Name: " + x.getName()
					+ "  Population: " + x.getPopulation()
					+ "  Median Age: " + x.getMedianAge()
					+ "  Coastline: " + x.getCoastlineKm() + "km");
			for(String y: x.getLanguages())
			{
				System.out.println(y);
			};
		}
	}
}
