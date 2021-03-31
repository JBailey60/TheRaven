package got.raven.TheRaven.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService{
    @Autowired
    PlayerRepository repository;
    @Override
    public Player getPlayerByPlayerName(String playerName){
        return repository.findByPlayerName(playerName);
    }
}
