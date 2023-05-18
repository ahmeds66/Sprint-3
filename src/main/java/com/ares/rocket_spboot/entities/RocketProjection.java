package com.ares.rocket_spboot.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nameRock", types = {Rocket.class})
public interface RocketProjection {
    public String getName();
}
