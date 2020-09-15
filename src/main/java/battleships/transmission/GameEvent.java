package battleships.transmission;

import battleships.players.Player;

public class GameEvent {

    private final EventType type;
    private final Player sourcePlayer;
    private final Player targetPlayer;

    public enum EventType{
        GAME_STARTED,
        PLAYER_SHOOT,
        PLAYER_MISS,
        PLAYER_HIT_A_SHIP,
        PLAYER_SANK_A_SHIP,
        DRAW;

        public GameEvent event(Player sourceplayer, Player targetPlayer){
            return new GameEvent(this,sourceplayer,targetPlayer);

        }
    }

    private GameEvent(EventType type, Player sourcePlayer, Player tragetPlayer) {
        this.type = type;
        this.sourcePlayer = sourcePlayer;
        this.targetPlayer = tragetPlayer;
    }

    public EventType getType() {
        return type;
    }

    public Player getSourcePlayer() {
        return sourcePlayer;
    }

    public Player getTargetPlayer() {
        return targetPlayer;
    }

}
