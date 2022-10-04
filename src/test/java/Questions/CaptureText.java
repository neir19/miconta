package Questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class CaptureText implements Question<String> {

    private Target t;

    public CaptureText(Target t){
        this.t=t;
    }

    public static CaptureText is(Target t) {
        return new CaptureText(t);
    }

    @Override
    public String answeredBy(Actor actor) {

        System.out.println ( Text.of(t).answeredBy(actor));
        return Text.of(t).answeredBy(actor);
    }
}
