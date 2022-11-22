package projectfood.domain;

import projectfood.domain.Picked;
import projectfood.domain.Delivered;
import projectfood.DeliveryFoodApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Delivery_table")
@Data

public class Delivery  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String adress;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String orderId;

    @PostPersist
    public void onPostPersist(){


        Picked picked = new Picked(this);
        picked.publishAfterCommit();



        Delivered delivered = new Delivered(this);
        delivered.publishAfterCommit();

    }

    public static DeliveryRepository repository(){
        DeliveryRepository deliveryRepository = DeliveryFoodApplication.applicationContext.getBean(DeliveryRepository.class);
        return deliveryRepository;
    }




    public static void copyData(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }
    public static void updateStatus(CookEnded cookEnded){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookEnded.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }


}
