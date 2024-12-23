package food;

public class Potatoes extends Food {

    String type = null;

    public Potatoes (String type){
        super("Картошка");
        this.type = type;
    }

    public String getParam() {
        return type;
    }

    public void setSize(String type) {
        this.type = type;
    }


    public void consume(){
        System.out.println(this + " съедена");
    }

    public String toString() {
        return name + " типа '" + type.toUpperCase() + "'";
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Potatoes)) return false;
            return type.equals(((Potatoes)arg0).type);
        } else
            return false;
    }
    public double calculateCalories(){
        return switch (type) {
            case "Жареная" -> 186;
            case "Вареная" -> 82;
            case "Фри" -> 276;
            default -> 0;
        };
    }

}
