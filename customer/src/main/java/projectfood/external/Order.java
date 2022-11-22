package projectfood.external;

import lombok.Data;
import java.util.Date;
@Data
public class Order {

    private Long id;
    private String customerId;
    private String foodId;
    private String status;
    private String price;
    private Object options;
    private String adress;
    private String storeId;
}


