package Player;

public class PlayerNotFoundException extends RuntimeException {
    public PlayerNotFoundException(){
        super("Player has not been found");
    }
}
