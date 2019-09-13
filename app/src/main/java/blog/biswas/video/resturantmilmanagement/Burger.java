package blog.biswas.video.resturantmilmanagement;

public abstract class Burger implements Item {

    @Override
    public  Packging packging(){
        return new Wrapping();
    }
}
