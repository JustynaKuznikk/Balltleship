package battleships.transmission;

import java.util.LinkedHashSet;
import java.util.Set;

//jest to komentator gry
public class Announcer {
    //zbiór widzów których komentator będzie powiadamiał
    Set<Spectator> spectators= new LinkedHashSet<>();

    public void addSpectator(Spectator spectator){
        spectators.add(spectator);
    }
    public void removeSpectator(Spectator spectator){
        spectators.remove(spectator);
    }
    public void announce(GameEvent event){
        for (Spectator s: spectators) {
            s.spectate(event);
        }
    }


}
