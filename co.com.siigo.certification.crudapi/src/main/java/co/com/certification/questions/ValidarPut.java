package co.com.certification.questions;

import co.com.certification.models.transversal.Peticiones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

import static co.com.certification.utils.constantes.ConstantesTrasnversales.NOMBRE_PERSONA;
import static co.com.certification.utils.constantes.ConstantesTrasnversales.TRABAJO;

public class ValidarPut implements Question<Boolean> {
    private final Map<String, Object> testData;

    public ValidarPut(Map<String, Object> testData) {
        this.testData = testData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
            String responseGet = Peticiones.getInfoEmpleado();
            String infoData = testData.get(NOMBRE_PERSONA).toString() + testData.get(TRABAJO).toString();
            return infoData.contains(responseGet);

    }

    public static ValidarPut info(Map<String, Object> testData) {
        return new ValidarPut(testData);
    }

}
