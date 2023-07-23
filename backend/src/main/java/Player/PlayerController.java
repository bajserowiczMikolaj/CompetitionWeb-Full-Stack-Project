package Player;

import Competition.CompetitionNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PlayerController {


    @Autowired
    PlayerService playerService;

    @ExceptionHandler
    public ResponseEntity<String> handleExceptions(CompetitionNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @GetMapping("/testP")
    public String testP() {
        return "Hello World! Communication ok";
    }


    @PostMapping("/addPlayer")
    public Player addPlayer (@RequestBody Player player){
        playerService.addPlayer(player);
        return player;
    }
    @GetMapping("/players")
    public List<Player>getPlayers(){
        return playerService.getAllPlayers();
    }

}
