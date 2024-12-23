import food.*;

import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void Calculated_Food (Food a, Food[] breakfast){
        int f_counter = 0;

        for (Food i: breakfast){
            if(i != null){
            if(a.equals(i))
                f_counter++;
            }
            else break;
        }
        System.out.println(f_counter);
    }

    public static void Calculated_Calories (Food[] breakfast){
        double calories = 0;

        for (Food i: breakfast){
        if (i!=null)
            calories += i.calculateCalories();
        else
            break;
        }
        System.out.println("Калорийность завтрака: " + calories);
    }


    public static void main(String[] args) {

            Food[] breakfast = new Food[20];

            int itemsSoFar = 0;
            for (String arg: args) { // итерация по элементам массива аргументов
                String[] parts = arg.split("/");
                switch (parts[0]){
                    case "Cheese":  breakfast[itemsSoFar] = new Cheese();
                    break;
                    case "Apple":  breakfast[itemsSoFar] = new Apple(parts[1]);
                    break;
                    case "Potatoes":  breakfast[itemsSoFar] = new Potatoes(parts[1]);
                    break;
                    case "-calories": Calculated_Calories(breakfast);
                    break;
                    case "-sort": Arrays.sort(breakfast, new FoodComparator());
                    break;

                    default: break;
                }

                itemsSoFar++;
            }

            for (Food i: breakfast){
                if (i!=null){
                    i.consume();
//                    System.out.println(i.calculateCalories());
                }
                else
                    break;}

            System.out.println("Введите тип продукта, количество которого вы хотите сосчитать: ");

        Scanner scanner = new Scanner(System.in);
        String type_prod = scanner.nextLine();
        String[] parts = type_prod.split("/");
        Food a = null;
        switch (parts[0]){
            case "Cheese":  a = new Cheese();
                break;
            case "Apple":  a =new Apple(parts[1]);
                break;
            case "Potatoes":  a = new Potatoes(parts[1]);
                break;
            default: break;
        }

        Calculated_Food(a, breakfast);
        }




    }


