package googledrivecarpe.domain;

import googledrivecarpe.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "drives", path = "drives")
public interface DriveRepository
    extends PagingAndSortingRepository<Drive, Long> {}
