package food;

import java.util.Objects;

public class Apple extends Food {

    private String size;
public Apple(String size) {

    super("Яблоко");

    this.size = size;
}

public void consume() {
    System.out.println(this + " съедено");
}

public String getParam() {
    return size;
}

public void setSize(String size) {
    this.size = size;
}
@Override
public boolean equals(Object arg0) {
    if (super.equals(arg0)) {
        if (!(arg0 instanceof Apple)) return false;
        return size.equals(((Apple)arg0).size);
    } else
        return false;
}

public String toString() {
    return super.toString() + " размера '" + size.toUpperCase() + "'";
}

    public double calculateCalories(){
        return switch (size) {
            case "Большое" -> 47;
            case "Малое" -> 30;
            default -> 0;
        };
    }
}
