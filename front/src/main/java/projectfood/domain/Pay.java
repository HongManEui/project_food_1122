package projectfood.domain;

import projectfood.domain.Paid;
import projectfood.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Pay_table")
@Data

public class Pay  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String payOption;
    
    
    
    
    
    private String price;

    @PostPersist
    public void onPostPersist(){


        Paid paid = new Paid(this);
        paid.publishAfterCommit();

    }

    public static PayRepository repository(){
        PayRepository payRepository = FrontApplication.applicationContext.getBean(PayRepository.class);
        return payRepository;
    }




    public static void cancelPay(OrderCancelled orderCancelled){

        /** Example 1:  new item 
        Pay pay = new Pay();
        repository().save(pay);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(pay->{
            
            pay // do something
            repository().save(pay);


         });
        */

        
    }
    public static void cancelPay(OrderRejected orderRejected){

        /** Example 1:  new item 
        Pay pay = new Pay();
        repository().save(pay);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(pay->{
            
            pay // do something
            repository().save(pay);


         });
        */

        
    }


}
