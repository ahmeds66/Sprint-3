package com.ares.rocket_spboot.restcontrollers;

import com.ares.rocket_spboot.entities.Rocket;
import com.ares.rocket_spboot.service.RocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RocketRESTController {
    @Autowired
    private RocketService rocketService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Rocket> getAllRockets() {
        return rocketService.getAllRockets();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Rocket getRocketById(@PathVariable("id") Long id) {
        return rocketService.getRocket(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Rocket createRocket(@RequestBody Rocket rocket) {
        return rocketService.saveRocket(rocket);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Rocket updateRocket(@RequestBody Rocket rocket) {
        return rocketService.updateRocket(rocket);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRocket(@PathVariable("id") Long id)
    {
        rocketService.deleteRocketById(id);
    }

    @RequestMapping(value = "/rockag/{id}", method = RequestMethod.GET)
    public List<Rocket> getRocketByAgence(@PathVariable("id") Long id) {
        return rocketService.findByAgenceIdAg(id);
    }

}
