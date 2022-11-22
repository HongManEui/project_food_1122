package projectfood.domain;

import projectfood.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private String foodId;
    private String status;
    private String price;
    private List<String> options;
    private String adress;
    private String storeId;
}
