package pixel.academy.setter_injection_app.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class TurkishChef implements Chef {

    public TurkishChef(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepare a Beef Youfka and a cup of Ayran";
    }
}
