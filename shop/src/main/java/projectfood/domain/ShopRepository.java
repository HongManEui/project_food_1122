package projectfood.domain;

import projectfood.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="shops", path="shops")
public interface ShopRepository extends PagingAndSortingRepository<Shop, Long>{

}
