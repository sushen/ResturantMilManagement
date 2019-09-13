package blog.biswas.video.resturantmilmanagement;

public abstract class ColdDrink implements Item {

    @Override
    public  Packging packging(){
        return new Bottle();
    }
}
