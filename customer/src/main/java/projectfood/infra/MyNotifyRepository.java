package projectfood.infra;

import projectfood.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="myNotifies", path="myNotifies")
public interface MyNotifyRepository extends PagingAndSortingRepository<MyNotify, Long> {

    

    
}
