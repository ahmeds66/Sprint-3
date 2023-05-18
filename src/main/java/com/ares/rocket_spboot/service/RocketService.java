package com.ares.rocket_spboot.service;

import com.ares.rocket_spboot.entities.Agence;
import com.ares.rocket_spboot.entities.Rocket;
import org.springframework.data.domain.Page;

import java.util.List;

public interface RocketService {

    Rocket saveRocket(Rocket rocket);
    Rocket updateRocket(Rocket rocket);
    void deleteRocket(Rocket rocket);
    void deleteRocketById(Long id);
    Rocket getRocket(Long id);
    List<Rocket> getAllRockets();
    Page<Rocket> getAllRocketsPerPage(int page, int size);

    List<Rocket> findByOrderByNameAsc();

    //List<Rocket> findByNameRocket(String name);
    //List<Rocket> findByNameRocketContains(String name);
    List<Rocket> findByNameLowOrbitPayload (String name , Long lowOrbitPayload);
    List<Rocket> findByAgenceIdAg(Long id);
    List<Rocket> findByAgence (Agence agence);
    List<Rocket> orderRocketsNamePayloads();



}
