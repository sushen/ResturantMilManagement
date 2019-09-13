package blog.biswas.video.resturantmilmanagement;

import java.util.ArrayList;
import java.util.List;

public class MealBuilder {
    public List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }
}
