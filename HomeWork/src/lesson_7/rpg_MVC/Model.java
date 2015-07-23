package lesson_7.rpg_MVC;


import lesson_7.rpg_MVC.game.GameBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ITyan on 22.07.2015.
 */
public class Model {

    private GameBuilder game;

    private int health1;
    private int health2;
    private String health1Str;
    private String health2Str;
    private String historyText;
    private String endGameMessage;
    private boolean isDead;

    private List<GameObserver> gameObservers = new ArrayList<>();


    public Model() {
        game = new GameBuilder();
        health1 = game.getPlayer1().getHealth();
        health2 = game.getPlayer2().getHealth();
    }

    public void registerObserver(View view) {
        gameObservers.add(view);
    }

    public void notifyGameObservers() {
        gameObservers.forEach(GameObserver::gameChanged);
    }

    public void player1Attack() {
        int result = game.getPlayer2().takeHealth(game.getPlayer1().getPersonageDamage());
        health2 = result;
        health2Str = "Health " + result + " %";
        historyText = game.getPlayer1().getName() + " attacks " + game.getPlayer2().getName() +
                " in " + game.getPlayer1().getPersonageDamage() + " points damage.";
        if (game.getPlayer2().isDead()) {
            isDead = true;
        }

        notifyGameObservers();
    }

    public void player2Attack() {
        int result = game.getPlayer1().takeHealth(game.getPlayer2().getPersonageDamage());
        health1 = result;
        health1Str = "Health " + result + " %";
        historyText = game.getPlayer2().getName() + " attacks " + game.getPlayer1().getName() +
                " in " + game.getPlayer2().getPersonageDamage() + " points damage.";

        if (game.getPlayer1().isDead()) {
            isDead = true;
        }

        notifyGameObservers();
    }

    public String getPlayer1Name() {
        return game.getPlayer1().toString();
    }

    public String getPlayer2Name() {
        return game.getPlayer2().toString();
    }

    public int getHealth1Value() {
        return health1;
    }

    public int getHealth2Value() {
        return health2;
    }

    public String getString1Value() {
        return health1Str;
    }

    public String getString2Value() {
        return health2Str;
    }

    public String getHistoryText() {
        return historyText;
    }

    public String getEndGameMessage() {
        return endGameMessage;
    }

    public boolean isDead() {
        return isDead;
    }

    public void gameOver() {
        historyText = "END GAME";
        if (game.getPlayer1().isDead()) {
            endGameMessage = game.getPlayer2().getName() + " - WIN!";
        }
        if (game.getPlayer2().isDead()) {
            endGameMessage = game.getPlayer1().getName() + " - WIN!";
        }
    }
}
