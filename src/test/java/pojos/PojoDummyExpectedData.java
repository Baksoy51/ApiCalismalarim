package pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PojoDummyExpectedData {

    private String status;
    private PojoDummyData data;
    private String message;

}
