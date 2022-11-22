package projectfood.external;

import lombok.Data;
import java.util.Date;
@Data
public class Shop {

    private Long id;
    private String orderId;
    private String status;
    private Object options;
    private String adress;
    private String price;
    private String customerId;
    private String storeId;
}


