package projectfood.domain;

import projectfood.domain.*;
import projectfood.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private String foodId;
    private String status;
    private String price;
    private Object options;
    private String adress;
    private String storeId;
}


