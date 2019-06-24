package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RatingDto {

    @JsonProperty("Value")
    private String Value;

    @JsonProperty("Source")
    private String Source;

}
