package projectfood.external;

import lombok.Data;
import java.util.Date;
@Data
public class Pay {

    private Long id;
    private String orderId;
    private String status;
    private String payOption;
    private String price;
}


