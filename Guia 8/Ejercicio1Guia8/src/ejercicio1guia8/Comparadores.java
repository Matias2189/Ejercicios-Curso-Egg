
package ejercicio1guia8;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<String> ordenarAsc = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };

}