package projectfood.domain;

import projectfood.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class Paid extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
    private String payOption;
    private String price;
}
