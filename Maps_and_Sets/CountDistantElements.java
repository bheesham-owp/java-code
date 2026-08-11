//GFG parctice................
package Maps_and_Sets;

import java.util.HashSet;

public class CountDistantElements {
    static int distant(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size();
    }
}
