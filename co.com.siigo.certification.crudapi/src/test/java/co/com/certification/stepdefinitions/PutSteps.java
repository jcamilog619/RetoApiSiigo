package co.com.certification.stepdefinitions;

import co.com.certification.models.transversal.TestData;
import co.com.certification.questions.ValidarPut;
import co.com.certification.taks.CrearPostInfo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PutSteps {

    @Cuando("se realiza la actualizacion en la api")
    public void seRealizaLaActualizacionEnLaApi() {
        theActorInTheSpotlight().attemptsTo(CrearPostInfo.api(TestData.info()));
    }

    @Entonces("se vizualizara exitosamente la actualizacion del usuario")
    public void seVizualizaraExitosamenteLaActualizacionDelUsuario() {
        theActorInTheSpotlight().should(seeThat(ValidarPut.info(TestData.info())));
    }
}
