package got.raven.TheRaven.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/TheRaven-Core")
public class PlayerController {
    
    @Autowired
    PlayerRepository repository;
    @Autowired
    PlayerService service;

    @GetMapping("/login/{playerName}")
    public Player findByPlayerName(@PathVariable("playerName") String playerName){
        return service.getPlayerByPlayerName(playerName);
    }

    @GetMapping("/Players")
    public List<Player> getAll() {
        List<Player> list = repository.findAll();
        return list;
    }

}
