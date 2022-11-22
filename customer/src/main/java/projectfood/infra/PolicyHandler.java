package projectfood.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import projectfood.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import projectfood.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired LogRepository logRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @Autowired
    projectfood.external.OrderService orderService;

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Picked'")
    public void wheneverPicked_Notifycation(@Payload Picked picked){

        Picked event = picked;
        System.out.println("\n\n##### listener Notifycation : " + picked + "\n\n");

        // REST Request Sample
        
        // orderService.getOrder(/** mapping value needed */);


        

        // Sample Logic //
        Log.notifycation(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccepted'")
    public void wheneverOrderAccepted_Notifycation(@Payload OrderAccepted orderAccepted){

        OrderAccepted event = orderAccepted;
        System.out.println("\n\n##### listener Notifycation : " + orderAccepted + "\n\n");

        // REST Request Sample
        
        // orderService.getOrder(/** mapping value needed */);


        

        // Sample Logic //
        Log.notifycation(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderRejected'")
    public void wheneverOrderRejected_Notifycation(@Payload OrderRejected orderRejected){

        OrderRejected event = orderRejected;
        System.out.println("\n\n##### listener Notifycation : " + orderRejected + "\n\n");

        // REST Request Sample
        
        // orderService.getOrder(/** mapping value needed */);


        

        // Sample Logic //
        Log.notifycation(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_Notifycation(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener Notifycation : " + cookStarted + "\n\n");

        // REST Request Sample
        
        // orderService.getOrder(/** mapping value needed */);


        

        // Sample Logic //
        Log.notifycation(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookEnded'")
    public void wheneverCookEnded_Notifycation(@Payload CookEnded cookEnded){

        CookEnded event = cookEnded;
        System.out.println("\n\n##### listener Notifycation : " + cookEnded + "\n\n");

        // REST Request Sample
        
        // orderService.getOrder(/** mapping value needed */);


        

        // Sample Logic //
        Log.notifycation(event);
        

        

    }

}


