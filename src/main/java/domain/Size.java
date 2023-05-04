package domain;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonPropertyOrder({"id", "productId", "backSoon", "special"})
public class Size {

    private Integer id;
    private Integer productId;
    private Boolean backSoon;
    private Boolean special;
}
