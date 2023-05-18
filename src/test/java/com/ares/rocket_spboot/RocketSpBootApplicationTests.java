package com.ares.rocket_spboot;

import com.ares.rocket_spboot.entities.Agence;
import com.ares.rocket_spboot.entities.Rocket;
import com.ares.rocket_spboot.repos.RocketRepository;
import com.ares.rocket_spboot.service.RocketService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

@SpringBootTest
class RocketSpBootApplicationTests {
    @Autowired
    private RocketRepository rocketRepository;

    @Autowired
    private RocketService rocketService;

    @Test
    public void testCreateRocket() {
        Rocket rock = new Rocket("Falcon 9", 22800L, 8300L, new Date(), 2010L, 0L);
        rocketRepository.save(rock);
    }

    @Test
    public void testFindRocket() {
        Rocket rock = rocketRepository.findById(1L).get();
        System.out.println(rock);
    }

    @Test
    public void testUpdateRocket() {
        Rocket rock = rocketRepository.findById(1L).get();
        rock.setFails(1L);
        rocketRepository.save(rock);
    }

    @Test
    public void testDeleteRocket() {
        rocketRepository.deleteById(1L);
    }

    @Test
    public void testListRockets() {
        List<Rocket> rocks = rocketRepository.findAll();
        for (Rocket r : rocks) {
            System.out.println(r);
        }
    }

    @Test
    public void testFindByNameRocketContains() {
        Page<Rocket> rocks = rocketService.getAllRocketsPerPage(0, 2);
        System.out.println(rocks.getSize());
        System.out.println(rocks.getTotalElements());
        System.out.println(rocks.getTotalPages());
        rocks.getContent().forEach(r -> {
            System.out.println(r.toString());
        });
    }

    @Test
    public void testFindByNameRocket() {
        List<Rocket> rocks = rocketRepository.findByNameRocket("Falcon 9");
        rocks.forEach(r -> {
            System.out.println(r.toString());
        });
    }

    @Test
    public void testfindByNameLowOrbitPayloadGreaterThanEqual() {
        List<Rocket> rocks = rocketRepository.findByNameLowOrbitPayload("Falcon 9", 10000L);
        rocks.forEach(r -> {
            System.out.println(r.toString());
        });
    }

    @Test
    public void testfindByAgence(){
        Agence agence = new Agence();
        agence.setIdAg(1L);
        List<Rocket> rocks = rocketRepository.findByAgence(agence);
        rocks.forEach(r -> {
            System.out.println(r.toString());
        });
    }

    @Test
    public void testfindByAgenceIdAg(){
        List<Rocket> rocks = rocketRepository.findByAgenceIdAg(1L);
        rocks.forEach(r -> {
            System.out.println(r.toString());
        });
    }

    @Test
    public void testfindByOrderByNomAsc(){
        List<Rocket> rocks = rocketRepository.findByOrderByNameAsc();
        rocks.forEach(r -> {
            System.out.println(r.toString());
        });
    }

    @Test
    public void testTrierRocketsNomsPayload(){
        List<Rocket> rocks = rocketRepository.orderRocketsNamePayloads();
        rocks.forEach(r -> {
            System.out.println(r.toString());
        });
    }
}
