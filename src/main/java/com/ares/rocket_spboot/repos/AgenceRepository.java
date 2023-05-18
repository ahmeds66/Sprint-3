package com.ares.rocket_spboot.repos;

import com.ares.rocket_spboot.entities.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AgenceRepository extends JpaRepository<Agence, Long> {
    List<Agence> findByNomAg(String name);
    List<Agence> findByNomAgContains(String name);
    List<Agence> findAgenceByIdAg(Long id);

}
