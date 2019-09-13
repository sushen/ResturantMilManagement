package blog.biswas.video.resturantmilmanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvMetal);

        List<Meal> meals = new ArrayList<>();
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.makeVegMeal();
        vegMeal.ShowMeal();
        System.out.println("Total Cost: " + vegMeal.getCost());
        meals.add(vegMeal);

        Meal NonvegMeal = builder.makeNonVegMeal();
        NonvegMeal.ShowMeal();
        System.out.println("Total Cost: " + NonvegMeal.getCost());
        meals.add(NonvegMeal);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Robot(meals));

    }
}
