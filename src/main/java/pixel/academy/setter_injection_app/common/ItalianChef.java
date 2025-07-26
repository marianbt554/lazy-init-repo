package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;


@Component
public class ItalianChef implements Chef {

    public ItalianChef(){
        System.out.println("In constructor: " +  getClass().getSimpleName());
    }
    @Override
    public String getDailyRecipe() {
        return " Prepare pasta al pomodoro with fresh tomatoees and basil.";
    }
}
