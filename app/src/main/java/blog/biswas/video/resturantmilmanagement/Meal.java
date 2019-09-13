package blog.biswas.video.resturantmilmanagement;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    public List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost = 0.0f;
        for (Item item:items){
            cost += item.price();
        }
        return cost;
    }
    public void ShowMeal(){
        for (Item item:items){
            System.out.println("Items :" + item.name());
            System.out.println("Packing :" + item.packging().pack());
            System.out.println("Items :" + item.price());
        }
    }
}
