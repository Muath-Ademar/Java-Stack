import java.util.HashMap;
import java.util.Set;


public class Hash {
public static void main(String[] args) {
    HashMap <String, String> trackList = new HashMap<String, String> ();
    trackList.put("Beleiver", " First things first ");
    trackList.put("thrift shop", " I am gonna pop some tags ");
    trackList.put("stressed out", " wish we could turn back times ");
    trackList.put(" 8 miles ", " his palms are heavy ");
    String title = trackList.get("thrift shop");
    System.out.println("the song lyric: " + title);

    Set<String> keys = trackList.keySet();
    for (String key:keys ){
        
        System.out.println( key + ": "+ trackList.get(key));
    }
}
}