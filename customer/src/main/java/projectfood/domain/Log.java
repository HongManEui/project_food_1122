package projectfood.domain;

import projectfood.CustomerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Log_table")
@Data

public class Log  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;


    public static LogRepository repository(){
        LogRepository logRepository = CustomerApplication.applicationContext.getBean(LogRepository.class);
        return logRepository;
    }




    public static void notifycation(Picked picked){

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(picked.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

        
    }
    public static void notifycation(OrderAccepted orderAccepted){

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderAccepted.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

        
    }
    public static void notifycation(OrderRejected orderRejected){

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

        
    }
    public static void notifycation(CookStarted cookStarted){

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

        
    }
    public static void notifycation(CookEnded cookEnded){

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookEnded.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

        
    }


}
