package got.raven.TheRaven.player;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "playerName")
    private String playerName;
    @Column(name = "password")
    private String password;

    public Player() {
    }

    public Player(String playerName, String password) {
        this.playerName = playerName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
