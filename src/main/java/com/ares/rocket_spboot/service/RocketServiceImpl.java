package com.ares.rocket_spboot.service;

import com.ares.rocket_spboot.entities.Agence;
import com.ares.rocket_spboot.entities.Rocket;
import com.ares.rocket_spboot.repos.RocketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RocketServiceImpl implements RocketService{
    @Autowired
    RocketRepository rocketRepository;

    @Override
    public Rocket saveRocket(Rocket rocket) {
        return rocketRepository.save(rocket);
    }

    @Override
    public Rocket updateRocket(Rocket rocket) {
        return rocketRepository.save(rocket);
    }

    @Override
    public void deleteRocket(Rocket rocket) {
        rocketRepository.delete(rocket);
    }

    @Override
    public void deleteRocketById(Long id) {
        rocketRepository.deleteById(id);
    }

    @Override
    public Rocket getRocket(Long id) {
        return rocketRepository.findById(id).get();
    }

    @Override
    public List<Rocket> getAllRockets() {
        return rocketRepository.findAll();
    }

    @Override
    public Page<Rocket> getAllRocketsPerPage(int page, int size) {
        return rocketRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public List<Rocket> findByOrderByNameAsc() {
        return rocketRepository.findByOrderByNameAsc();
    }

    /*@Override
    public List<Rocket> findByNameRocket(String name) {
        return rocketRepository.findByNameRocket(name);
    }*/

    /*@Override
    public List<Rocket> findByNameRocketContains(String name) {
        return rocketRepository.findByNameRocketContains(name);
    }*/

    @Override
    public List<Rocket> findByNameLowOrbitPayload (String name , Long lowOrbitPayload) {
        return rocketRepository.findByNameLowOrbitPayload(name, lowOrbitPayload);
    }

    @Override
    public List<Rocket> findByAgenceIdAg(Long id) {
        return rocketRepository.findByAgenceIdAg(id);
    }

    @Override
    public List<Rocket> findByAgence (Agence agence) {
        return rocketRepository.findByAgence(agence);
    }

    @Override
    public List<Rocket> orderRocketsNamePayloads() {
        return rocketRepository.orderRocketsNamePayloads();
    }



}
