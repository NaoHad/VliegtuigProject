package com.vliegtuig.Vliegtuig.repositories;

import com.vliegtuig.Vliegtuig.models.Vliegveld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path ="vliegveld")
public interface VliegveldRepository extends JpaRepository<Vliegveld,Long> {

}
