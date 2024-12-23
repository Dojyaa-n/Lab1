package food;

import java.util.Comparator;

public class  FoodComparator implements Comparator<Food> {
    public int compare(Food arg0, Food arg1) {
        if (arg0==null || arg0.getParam().equals("")) return 1;

        if (arg1==null || arg1.getParam().equals("")) return -1;

        return arg0.getParam().compareTo(arg1.getParam());
    }
}
