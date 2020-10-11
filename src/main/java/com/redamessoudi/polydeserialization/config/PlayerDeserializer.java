package com.redamessoudi.polydeserialization.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.redamessoudi.polydeserialization.models.FootballPlayer;
import com.redamessoudi.polydeserialization.models.Player;
import com.redamessoudi.polydeserialization.models.SportType;
import com.redamessoudi.polydeserialization.models.TennisPlayer;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import org.springframework.boot.jackson.JsonComponent;

/**
 * @author Reda Messoudi
 */
// uncomment line below only if you don't want to use {@link com.redamessoudi.polydeserialization.config.DeserializationConfiguration}
// @JsonComponent
public class PlayerDeserializer extends StdDeserializer<Player> {

  private static final Logger log = LoggerFactory.getLogger(PlayerDeserializer.class);

  public PlayerDeserializer() {
    this(null);
  }

  public PlayerDeserializer(final Class<?> vc) {
    super(vc);
  }

  @Override
  public Player deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
      throws IOException {

    final ObjectMapper mapper = (ObjectMapper) jsonParser.getCodec();
    final JsonNode playerNode = mapper.readTree(jsonParser);

    final SportType sportType = SportType.fromValue(playerNode.get("sportType").asText());

    switch (sportType) {
      case FOOTBALL:
        return mapper.treeToValue(playerNode, FootballPlayer.class);
      case TENNIS:
        return mapper
            .treeToValue(playerNode, TennisPlayer.class);
      default:
        log.warn("Unexpected Player type : {}", sportType.toString());
        throw new IllegalStateException("Unexpected Player type : " + sportType.toString());
    }
/*    if (playerNode.has("position")) {
      return mapper.treeToValue(playerNode, FootballPlayer.class);
    }
    if (playerNode.has("atpPoints")) {
      return mapper.treeToValue(playerNode, TennisPlayer.class);
    }
    log.warn("Unexpected Player type : {}", sportType.toString());
    throw new IllegalStateException("Unexpected Player type : " + sportType.toString());*/

  }
}
