package projectfood.domain;

import projectfood.domain.*;
import projectfood.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Picked extends AbstractEvent {

    private Long id;
    private String adress;
    private String storeId;
    private String status;
    private String orderId;

    public Picked(Delivery aggregate){
        super(aggregate);
    }
    public Picked(){
        super();
    }
}
