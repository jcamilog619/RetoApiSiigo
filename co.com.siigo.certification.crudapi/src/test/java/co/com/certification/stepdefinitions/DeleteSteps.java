package co.com.certification.stepdefinitions;

import co.com.certification.models.transversal.TestData;
import co.com.certification.questions.ValidarDelete;
import co.com.certification.taks.CrearPostInfo;
import co.com.certification.taks.trasnversal.EliminarDeleteInfo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DeleteSteps {

    @Cuando("se realiza la creacion del usuario")
    public void seRealizaLaCreacionDelUsuarioi() {
        theActorInTheSpotlight().attemptsTo(CrearPostInfo.api(TestData.info()));
    }

    @Y("elimino la informacion del usuario")
    public void eliminoLaInformacionDelUsuario() {
        theActorInTheSpotlight().attemptsTo(EliminarDeleteInfo.api());
    }

    @Entonces("^se vizualizara exitosamente la eliminacion del empleado con el codigo (.*)$")
    public void seVizualizaraExitosamenteLaEliminacionDelEmpleadoConElCodigo(String codigo) {
        theActorInTheSpotlight().should(seeThat(ValidarDelete.transversal(codigo)));
    }
}
