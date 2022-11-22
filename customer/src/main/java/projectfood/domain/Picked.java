package projectfood.domain;

import projectfood.domain.*;
import projectfood.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Picked extends AbstractEvent {

    private Long id;
    private String adress;
    private String storeId;
    private String status;
    private String orderId;
}


