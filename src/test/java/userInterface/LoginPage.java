package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Input username").located(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-login/div/div/form/mbsc-card/mbsc-card-content/mbsc-form-group/form/mbsc-form-group-content/app-prisma-mbsc-input[1]/mbsc-input/label/span[2]/input"));
    public static final Target INPUT_PASSWORD = Target.the("Input password").located(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-login/div/div/form/mbsc-card/mbsc-card-content/mbsc-form-group/form/mbsc-form-group-content/app-prisma-mbsc-input[2]/mbsc-input/label/span[2]/input"));
    public static final Target BUTTON_LOGIN = Target.the("button login").located(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-login/div/div/form/mbsc-card/mbsc-card-content/mbsc-form-group/form/app-prisma-button/ion-button"));


}
