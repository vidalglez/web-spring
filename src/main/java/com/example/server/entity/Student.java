package com.example.server.entity;

import java.util.LinkedHashMap;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> languagesOptions;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("GR", "Germany");
		countryOptions.put("MX", "Mexico");
		countryOptions.put("FR", "France");
		countryOptions.put("DN", "Denmark");
		
		languagesOptions = new LinkedHashMap<>();
		languagesOptions.put("Java", "Java");
		languagesOptions.put("PHP", "PHP");
		languagesOptions.put("Python", "Python");
		languagesOptions.put("Pearl", "Pearl");
		languagesOptions.put("Ruby", "Ruby");
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favouriteLanguaje) {
		this.favoriteLanguage = favouriteLanguaje;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public LinkedHashMap<String, String> getLanguagesOptions() {
		return languagesOptions;
	}

	public void setLanguagesOptions(LinkedHashMap<String, String> languagesOptions) {
		this.languagesOptions = languagesOptions;
	}

}
