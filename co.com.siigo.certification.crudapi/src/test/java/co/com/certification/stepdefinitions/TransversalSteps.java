package co.com.certification.stepdefinitions;

import co.com.certification.taks.trasnversal.Cargar;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class TransversalSteps {

    @Dado("^que el (.*) cargo los datos para el proceso$")
    public void queElUsuaroCargoLosDatosParaElProceso(String nomActor, List<Map<String, Object>> infoClienteNuevo) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nomActor).wasAbleTo(Cargar.datosCon(infoClienteNuevo));
    }
}
