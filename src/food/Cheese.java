package food;
public class Cheese extends Food {
    public Cheese() {
        super("Сыр");
    }
    public void consume() {
        System.out.println(this + " съеден");
    }
    public String getParam() {
        return "";
    }
    public double calculateCalories(){
        return 330;
    }
}

