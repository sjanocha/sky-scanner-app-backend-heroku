package pl.studia.android.skyscanner.backend.kiwi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Date;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostAttr {
    @JsonProperty("fly_from")
    String flyFrom;
    @JsonProperty("fly_to")
    String flyTo;
    @JsonProperty("date_from")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
    Date dateFrom;
    @JsonProperty("date_to")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
    Date dateTo;
    @JsonProperty("max_stopovers")
    Integer maxStopovers;
    Integer passengers;
    Integer adults;
    Integer children;
    @JsonProperty("price_to")
    Integer maximumPrice;
}
