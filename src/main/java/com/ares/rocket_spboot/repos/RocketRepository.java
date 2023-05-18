package com.ares.rocket_spboot.repos;

import com.ares.rocket_spboot.entities.Agence;
import com.ares.rocket_spboot.entities.Rocket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "rest")
public interface RocketRepository extends JpaRepository<Rocket,Long> {
    //List<Rocket> findByNameRocket(String name);
    //List<Rocket> findByNameRocketContains(String name);

    @Query("select r from Rocket r where r.name like %:name and r.lowOrbitPayload > :lowOrbitPayload")
    List<Rocket> findByNameLowOrbitPayload (@Param("name") String name , @Param("lowOrbitPayload") Long lowOrbitPayload);

    @Query("select r from Rocket r where r.agence = ?1")
    List<Rocket> findByAgence (Agence agence);

    List<Rocket> findByAgenceIdAg(Long id);

    List<Rocket> findByOrderByNameAsc();

    @Query("select r from Rocket r order by r.name ASC, r.lowOrbitPayload DESC")
    List<Rocket> orderRocketsNamePayloads();
}
