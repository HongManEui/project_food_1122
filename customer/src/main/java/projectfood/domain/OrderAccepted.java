package projectfood.domain;

import projectfood.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
    private List<String> options;
    private String adress;
    private String price;
    private String customerId;
    private String storeId;
}
