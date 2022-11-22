package projectfood.infra;
import projectfood.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class ShopHateoasProcessor implements RepresentationModelProcessor<EntityModel<Shop>>  {

    @Override
    public EntityModel<Shop> process(EntityModel<Shop> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/accept").withRel("accept"));

        
        return model;
    }
    
}
