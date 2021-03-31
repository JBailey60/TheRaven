package got.raven.TheRaven.player;

import org.springframework.stereotype.Service;

@Service
public interface PlayerService {
    Player getPlayerByPlayerName(String playerName);
}
