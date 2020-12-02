import java.util.HashMap;
import java.util.Set;

public class HashCity {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Green Eggs & Ham", "Green Eggs & Ham!.... I need Green Eggs & Ham!.... I need  Green Eggs & Ham!....");
        trackList.put("Robot", "I... Ro...Bot....! I... Ro...Bot....!");
        trackList.put("UNO", "UNO! UNO! UNO! Who wants to be Number 1... UNO! UNO! UNO!...");
        trackList.put("Bow of Rain", "Bow of Rain! Rain of Bow! Bow of Rain! Rain of Bow!...");
        System.out.println(trackList.get("UNO"));
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println("Title|" + key + ": " + "Lyrics|" + trackList.get(key));
        }
    }
}