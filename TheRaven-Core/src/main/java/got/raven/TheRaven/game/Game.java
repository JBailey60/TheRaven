package got.raven.TheRaven.game;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Game {
    @Id @GeneratedValue
    private Integer gameId;
    @Column(name = "date")
    private Date date;
    @Column(name = "isActive")
    private boolean isActive;
    @Column(name = "currentGameTurn")
    private Integer currentGameTurn;
    @Column(name = "gameWinnerId")
    private Integer gameWinnerId;

    public Game() {
    }

    public Game(Date date,
                boolean isActive,
                Integer currentGameTurn,
                Integer gameWinnerId) {
        this.date = date;
        this.isActive = isActive;
        this.currentGameTurn = currentGameTurn;
        this.gameWinnerId = gameWinnerId;
    }

    public Integer getGameId() {
        return gameId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public Integer getCurrentGameTurn() {
        return currentGameTurn;
    }

    public void setCurrentGameTurn(Integer currentGameTurn) {
        this.currentGameTurn = currentGameTurn;
    }

    public Integer getGameWinnerId() {
        return gameWinnerId;
    }

    public void setGameWinnerId(Integer gameWinnerId) {
        this.gameWinnerId = gameWinnerId;
    }
}
