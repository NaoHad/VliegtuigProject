package com.vliegtuig.Vliegtuig.repositories;


import com.vliegtuig.Vliegtuig.models.Vliegtuig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "vliegtuig")
public interface VliegtuigRepository extends JpaRepository<Vliegtuig,Long> {

}
