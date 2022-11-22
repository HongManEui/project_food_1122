package projectfood.domain;

import projectfood.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class Delivered extends AbstractEvent {

    private Long id;
    private String adress;
    private String storeId;
    private String status;
    private String orderId;
}
