package blog.biswas.video.resturantmilmanagement;

public class NonVageBurger extends Burger {
    @Override
    public String name() {
        return "Non Vage Burger";
    }

    @Override
    public float price() {
        return 150.0f;
    }
}
