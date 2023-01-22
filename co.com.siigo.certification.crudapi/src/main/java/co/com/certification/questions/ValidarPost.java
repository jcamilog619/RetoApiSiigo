package co.com.certification.questions;

import co.com.certification.models.transversal.Peticiones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

import static co.com.certification.utils.constantes.ConstantesTrasnversales.*;

public class ValidarPost implements Question<Boolean> {

    private final Map<String, Object> testData;


    public ValidarPost(Map<String, Object> testData) {
        this.testData = testData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (STATUS_OK_POST.toString().equals(Peticiones.getRsEstadoCodigo())) {
            String responseGet = Peticiones.getInfoEmpleado();
            String infoData = testData.get(NOMBRE_PERSONA).toString() + testData.get(TRABAJO).toString();
            return infoData.contains(responseGet);
        }else {
            return false;
        }
    }

    public static ValidarPost transversal(Map<String, Object> testData) {
        return new ValidarPost(testData);
    }
}
