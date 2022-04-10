import java.util.HashMap;
import java.util.Set;

public class HashMusic {
    
    public static void main(String[] args) {

        HashMap<String, String> Music = new HashMap<>();
    
        Music.put("swimming pools", "I was in the dark room, loud tunes, lookin' to make a vow soon ");
        Music.put("You Change with the Seasons", "I'm not the one, I'm just trouble And I'm holding on to something I can't have");
        Music.put("wheels on the bus", "the wheels on the bus go round and round");
        Music.put("ABC", "it's easy as 1,2.3");
    
        for (String i : Music.keySet()){
            System.out.println(String.format("Track: %s %nLyrics: %s %n%n", i, Music.get(i)));
        }
    }
}
