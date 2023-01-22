package co.com.certification.stepdefinitions;

import co.com.certification.models.transversal.TestData;
import co.com.certification.questions.ValidarPost;
import co.com.certification.taks.CrearPostInfo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PostSteps {

    

    @Cuando("se realiza la creacion en la api")
    public void seRealizaLaPeticionEnLaApi() {
        theActorInTheSpotlight().attemptsTo(CrearPostInfo.api(TestData.info()));
    }

    @Entonces("se vizualizara exitosamente la creacion del empleado")
    public void seVizualizaraExitosamenteLaCreacionDelEmpleado() {
        theActorInTheSpotlight().should(seeThat(ValidarPost.transversal(TestData.info())));
    }
}
