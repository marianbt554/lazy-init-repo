package pixel.academy.setter_injection_app.common;

public class TurkishChef implements Chef {

    public TurkishChef(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepare a Beef Youfka and a cup of Ayran";
    }
}
