package com.redamessoudi.polydeserialization.controllers;

import com.redamessoudi.polydeserialization.models.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Reda Messoudi
 */
@RestController
public class PlayerControllerImpl implements PlayerController {

  private static final Logger log = LoggerFactory.getLogger(PlayerControllerImpl.class);

  @Override
  public ResponseEntity<?> createPlayer(Player player) {
    log.info("received {}", player);
    return ResponseEntity.status(HttpStatus.CREATED)
        .body("Player created");
  }
}
