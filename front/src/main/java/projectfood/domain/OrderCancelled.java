package projectfood.domain;

import projectfood.domain.*;
import projectfood.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String foodId;
    private String status;
    private String price;
    private List<String> options;
    private String adress;
    private String storeId;

    public OrderCancelled(Order aggregate){
        super(aggregate);
    }
    public OrderCancelled(){
        super();
    }
}
