package Competition;

public class CompetitionNotFoundException extends RuntimeException{
    public CompetitionNotFoundException(){
        super("Competition has not been found");
    }
}
