package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage  extends PageObject {

    public static final Target LABEL_TITULO = Target.the("Label titulo").located(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-aplicaciones/app-header/ion-header/ion-toolbar/ion-title[1]"));
    public static final Target LABEL_MICONTABILIDAD= Target.the("titulo micontabilidad").located(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-aplicaciones/div/div/div/div/a[3]/mbsc-card/mbsc-card-header/div/div[2]/div/h2"));

}
