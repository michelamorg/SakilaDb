package dto;

public class FilmDto {
private String first_name;
private String last_name;
private String title;
private String description;
private int film_id;

public FilmDto() {
	
}

public FilmDto(String first_name, String last_name, String title, String description, int film_id) {
	
	this.first_name = first_name;
	this.last_name = last_name;
	this.title = title;
	this.description = description;
	this.film_id = film_id;
}

public String getFirst_name() {
	return first_name;
}

public void setFirst_name(String first_name) {
	this.first_name = first_name;
}

public String getLast_name() {
	return last_name;
}

public void setLast_name(String last_name) {
	this.last_name = last_name;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getFilm_id() {
	return film_id;
}

public void setFilm_id(int film_id) {
	this.film_id = film_id;
}



}
