package blog.biswas.video.resturantmilmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.makeVegMeal();
        vegMeal.ShowMeal();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal NonvegMeal = builder.makeNonVegMeal();
        NonvegMeal.ShowMeal();
        System.out.println("Total Cost:" + NonvegMeal.getCost());

    }
}
