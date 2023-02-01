package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private static BigCharFactory instance = new BigCharFactory();
    private Map<Character, BigChar> pool = new HashMap<>();

    public BigChar getBigChar(char c) {
        if (pool.containsKey(c)) {
          return pool.get(c);
        }
        else {
            BigChar bc = new BigChar(c);
            pool.put(c, bc);
            return bc;
        }
    }

    static public BigCharFactory getInstance() {
      return instance;
    }
  
}
