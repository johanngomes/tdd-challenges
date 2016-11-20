package arraycount9;

import java.util.ArrayList;
import java.util.Collections;

public class Counter {

    public static int countNumberOf9s(ArrayList<Integer> numbers) {
        return Collections.frequency(numbers, 9);
    }
}
