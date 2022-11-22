package projectfood.domain;

import projectfood.domain.OrderPlaced;
import projectfood.domain.OrderCancelled;
import projectfood.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Order_table")
@Data

public class Order  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String price;
    
    
    
    @ElementCollection
    
    private List<String> options;
    
    
    
    
    
    private String adress;
    
    
    
    
    
    private String storeId;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        projectfood.external.AcceptCommand acceptCommand = new projectfood.external.AcceptCommand();
        // mappings goes here
        FrontApplication.applicationContext.getBean(projectfood.external.ShopService.class)
            .accept(/* get???(), */ acceptCommand);



        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();



        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();

        // Get request from Shop
        //projectfood.external.Shop shop =
        //    Application.applicationContext.getBean(projectfood.external.ShopService.class)
        //    .getShop(/** mapping value needed */);

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = FrontApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }




    public static void cancel(OrderRejected orderRejected){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }
    public static void updateStatus(OrderRejected orderRejected){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }


}
