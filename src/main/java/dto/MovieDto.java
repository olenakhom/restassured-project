package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MovieDto {

    @JsonProperty("Metascore")
    private String Metascore;

    @JsonProperty("BoxOffice")
    private String BoxOffice;

    @JsonProperty("Website")
    private String Website;

    @JsonProperty("imdbRating")
    private String imdbRating;

    @JsonProperty("imdbVotes")
    private String imdbVotes;

    @JsonProperty("Ratings")
    private List<RatingDto> Ratings;

    @JsonProperty("Runtime")
    private String Runtime;

    @JsonProperty("Language")
    private String Language;

    @JsonProperty("Rated")
    private String Rated;

    @JsonProperty("Production")
    private String Production;

    @JsonProperty("Released")
    private String Released;

    @JsonProperty("imdbID")
    private String imdbID;

    @JsonProperty("Plot")
    private String Plot;

    @JsonProperty("Director")
    private String Director;

    @JsonProperty("Title")
    private String Title;

    @JsonProperty("Actors")
    private String Actors;

    @JsonProperty("Response")
    private String Response;

    @JsonProperty("Type")
    private String Type;

    @JsonProperty("Awards")
    private String Awards;

    @JsonProperty("DVD")
    private String DVD;

    @JsonProperty("Year")
    private String Year;

    @JsonProperty("Poster")
    private String Poster;

    @JsonProperty("Country")
    private String Country;

    @JsonProperty("Genre")
    private String Genre;

    @JsonProperty("Writer")
    private String Writer;

}
