package com.redamessoudi.polydeserialization.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.redamessoudi.polydeserialization.models.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Reda Messoudi
 */
@Configuration
public class DeserializationConfiguration {
  @Bean
  public ObjectMapper objectMapper() {
    SimpleModule module = new SimpleModule();
    module.addDeserializer(Player.class, new PlayerDeserializer());
    return new ObjectMapper().registerModules(module);
  }

}