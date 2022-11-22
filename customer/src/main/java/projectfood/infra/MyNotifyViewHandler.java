package projectfood.infra;

import projectfood.domain.*;
import projectfood.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class MyNotifyViewHandler {


    @Autowired
    private MyNotifyRepository myNotifyRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderPlaced_then_CREATE_1 (@Payload OrderPlaced orderPlaced) {
        try {

            if (!orderPlaced.validate()) return;

            // view 객체 생성
            MyNotify myNotify = new MyNotify();
            // view 객체에 이벤트의 Value 를 set 함
            myNotify.setStatus("주문됨");
            myNotify.setId(orderPlaced.getId());
            // view 레파지 토리에 save
            myNotifyRepository.save(myNotify);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenPaid_then_UPDATE_1(@Payload Paid paid) {
        try {
            if (!paid.validate()) return;
                // view 객체 조회
            Optional<MyNotify> myNotifyOptional = myNotifyRepository.findById(Long.valueOf(paid.getOrderId()));

            if( myNotifyOptional.isPresent()) {
                 MyNotify myNotify = myNotifyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                myNotify.setStatus("결제됨");    
                // view 레파지 토리에 save
                 myNotifyRepository.save(myNotify);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderAccepted_then_UPDATE_2(@Payload OrderAccepted orderAccepted) {
        try {
            if (!orderAccepted.validate()) return;
                // view 객체 조회
            Optional<MyNotify> myNotifyOptional = myNotifyRepository.findById(Long.valueOf(orderAccepted.getOrderId()));

            if( myNotifyOptional.isPresent()) {
                 MyNotify myNotify = myNotifyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                myNotify.setStatus("접수됨");    
                // view 레파지 토리에 save
                 myNotifyRepository.save(myNotify);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderRejected_then_UPDATE_3(@Payload OrderRejected orderRejected) {
        try {
            if (!orderRejected.validate()) return;
                // view 객체 조회
            Optional<MyNotify> myNotifyOptional = myNotifyRepository.findById(Long.valueOf(orderRejected.getOrderId()));

            if( myNotifyOptional.isPresent()) {
                 MyNotify myNotify = myNotifyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                myNotify.setStatus("거절됨");    
                // view 레파지 토리에 save
                 myNotifyRepository.save(myNotify);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenCookStarted_then_UPDATE_4(@Payload CookStarted cookStarted) {
        try {
            if (!cookStarted.validate()) return;
                // view 객체 조회
            Optional<MyNotify> myNotifyOptional = myNotifyRepository.findById(Long.valueOf(cookStarted.getOrderId()));

            if( myNotifyOptional.isPresent()) {
                 MyNotify myNotify = myNotifyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                myNotify.setStatus("요리시작");    
                // view 레파지 토리에 save
                 myNotifyRepository.save(myNotify);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenCookEnded_then_UPDATE_5(@Payload CookEnded cookEnded) {
        try {
            if (!cookEnded.validate()) return;
                // view 객체 조회
            Optional<MyNotify> myNotifyOptional = myNotifyRepository.findById(Long.valueOf(cookEnded.getOrderId()));

            if( myNotifyOptional.isPresent()) {
                 MyNotify myNotify = myNotifyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                myNotify.setStatus("요리끝");    
                // view 레파지 토리에 save
                 myNotifyRepository.save(myNotify);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPicked_then_UPDATE_6(@Payload Picked picked) {
        try {
            if (!picked.validate()) return;
                // view 객체 조회
            Optional<MyNotify> myNotifyOptional = myNotifyRepository.findById(Long.valueOf(picked.getOrderId()));

            if( myNotifyOptional.isPresent()) {
                 MyNotify myNotify = myNotifyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                myNotify.setStatus("배송시작");    
                // view 레파지 토리에 save
                 myNotifyRepository.save(myNotify);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenDelivered_then_UPDATE_7(@Payload Delivered delivered) {
        try {
            if (!delivered.validate()) return;
                // view 객체 조회
            Optional<MyNotify> myNotifyOptional = myNotifyRepository.findById(Long.valueOf(delivered.getOrderId()));

            if( myNotifyOptional.isPresent()) {
                 MyNotify myNotify = myNotifyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                myNotify.setStatus("배송완료");    
                // view 레파지 토리에 save
                 myNotifyRepository.save(myNotify);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderCancelled_then_DELETE_1(@Payload OrderCancelled orderCancelled) {
        try {
            if (!orderCancelled.validate()) return;
            // view 레파지 토리에 삭제 쿼리
            myNotifyRepository.deleteById(orderCancelled.getId());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

