package projectfood.domain;

import projectfood.domain.*;
import projectfood.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
    private List<String> options;
    private String adress;
    private String price;
    private String customerId;
    private String storeId;

    public OrderAccepted(Shop aggregate){
        super(aggregate);
    }
    public OrderAccepted(){
        super();
    }
}
