package Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

   public PlayerService(){
   }

   public void addPlayer(Player player){
       playerRepository.save(player);
   }

    public void updatePlayer(Player player,long playerId ) {
       if (!playerRepository.existsById(playerId)){
           throw new PlayerNotFoundException();
       }
       player.setPlayerId(playerId);
       playerRepository.save(player);
    }


    @Transactional
    public void daletePlayerById(long playerId){
       if (!playerRepository.existsById(playerId)){
           throw new PlayerNotFoundException();
       }
       playerRepository.deletePlayerById(playerId);
    }

    public List<Player> getAllPlayers(){
       return new ArrayList<>(playerRepository.findAll());
    }


}
