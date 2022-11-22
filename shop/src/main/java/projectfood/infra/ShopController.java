package projectfood.infra;
import projectfood.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@RestController
// @RequestMapping(value="/shops")
@Transactional
public class ShopController {
    @Autowired
    ShopRepository shopRepository;



    @RequestMapping(value = "shops/{id}/accept",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Shop accept(@PathVariable(value = "id") Long id, @RequestBody AcceptCommand acceptCommand, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /shop/accept  called #####");
            Optional<Shop> optionalShop = shopRepository.findById(id);
            
            optionalShop.orElseThrow(()-> new Exception("No Entity Found"));
            Shop shop = optionalShop.get();
            shop.accept(acceptCommand);
            
            shopRepository.save(shop);
            return shop;
            
    }
    





}
