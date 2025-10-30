import java.util.HashMap;
import java.util.Set;

public class TrackListHashMap {
        public static void main(String[] args) {

    HashMap<String, String> userMap = new HashMap<String, String>();
    userMap.put("song1", "AAAA");
    userMap.put("song2", "BBBB");
    userMap.put("song3", "CCCC");
    userMap.put("song4", "DDDD");
    

    Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key+":"+userMap.get(key));
        }


}
}