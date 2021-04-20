package com.optym.cityjokes.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "city_jokes")
public class CityJoke {
	
	@Id
	private Long id;
	private String type;
	private String setup;
	private String punchline;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the setup
	 */
	public String getSetup() {
		return setup;
	}
	/**
	 * @param setup the setup to set
	 */
	public void setSetup(String setup) {
		this.setup = setup;
	}
	/**
	 * @return the punchline
	 */
	public String getPunchline() {
		return punchline;
	}
	/**
	 * @param punchline the punchline to set
	 */
	public void setPunchline(String punchline) {
		this.punchline = punchline;
	}
	
	

}
