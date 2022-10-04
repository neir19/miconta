package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MiContabilidadPage extends PageObject {
    public static final Target TITLE_MICONTABILIDAD= Target.the("titulo micontabilidad").located(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-home-page/app-header/ion-header/ion-toolbar/ion-title"));
}
