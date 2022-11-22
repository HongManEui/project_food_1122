package projectfood.domain;

import projectfood.domain.*;
import projectfood.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CookEnded extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
    private Object options;
    private String adress;
    private String price;
    private String customerId;
    private String storeId;
}


