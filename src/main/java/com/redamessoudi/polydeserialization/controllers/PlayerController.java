package com.redamessoudi.polydeserialization.controllers;

import com.redamessoudi.polydeserialization.models.Player;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Reda Messoudi
 */
@RequestMapping(value = "/api", produces = { MediaType.APPLICATION_JSON_VALUE })
public interface PlayerController {

    @PostMapping(value = "/players", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> createPlayer(@RequestBody Player player);

}
