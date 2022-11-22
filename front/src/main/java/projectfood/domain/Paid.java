package projectfood.domain;

import projectfood.domain.*;
import projectfood.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
    private String payOption;
    private String price;

    public Paid(Pay aggregate){
        super(aggregate);
    }
    public Paid(){
        super();
    }
}
