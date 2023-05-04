package dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SizeDTO {

    private Integer id;
    private Integer productId;
    private Boolean backSoon;
    private Boolean special;
}
