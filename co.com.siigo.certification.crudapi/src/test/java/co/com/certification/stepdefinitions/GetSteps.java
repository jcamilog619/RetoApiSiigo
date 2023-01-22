package co.com.certification.stepdefinitions;

import co.com.certification.models.transversal.TestData;
import co.com.certification.questions.ValidarGet;
import co.com.certification.questions.ValidarGetNull;
import co.com.certification.taks.ObtenerGetInfo;
import co.com.certification.taks.trasnversal.Cargar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetSteps {

    @Dado("^que el (.*) cargo la informacion a consultar$")
    public void queElUsuaroCargoLaInformacionAConsultar(String nomActor,List<Map<String, Object>> cliente) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nomActor).wasAbleTo(Cargar.datosCon(cliente));
    }


    @Cuando("se realiza la consulta a la api")
    @Cuando("se realiza la consulta a la api erronea")
    @Cuando("se realiza la consulta de la informacion a la api get")
    public void seRealizaLaPeticionALaApi() {
        theActorInTheSpotlight().attemptsTo(ObtenerGetInfo.api(TestData.info()));
    }


    @Entonces("se vizualizara exitosamente la informacion del response")
    public void seVizualizaraExitosamenteLaInformacionDelResponseesponse() {
        theActorInTheSpotlight().should(seeThat(ValidarGet.transversal(TestData.info()).exioso()));
    }
    @Entonces("se vizualizara el error del response")
    public void seVizualizaraElErrorDelResponse() {
        theActorInTheSpotlight().should(seeThat(ValidarGet.transversal(TestData.info()).error()));
    }

    @Entonces("se vizualizara un Bad Request")
    public void seVizualizaraUnBadRequest() {
        theActorInTheSpotlight().should(seeThat(ValidarGetNull.info()));
    }
}
