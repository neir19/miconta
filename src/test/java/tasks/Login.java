package tasks;

import com.sun.deploy.security.ValidationState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.junit.platform.engine.TestDescriptor;
import userInterface.LoginPage;
public class Login implements Task {

    private String user;
    private  String password;

    public Login(String user, String password){
        this.user=user;
        this.password=password;
    }


    public static Login user(String user, String password) {
        return Tasks.instrumented(Login.class,user,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
                actor.attemptsTo(
                        Enter.theValue(user).into(LoginPage.INPUT_USERNAME),
                        Enter.theValue(password).into(LoginPage.INPUT_PASSWORD),
                        Click.on(LoginPage.BUTTON_LOGIN)
                );

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
