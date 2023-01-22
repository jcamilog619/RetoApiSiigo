package co.com.certification.questions;

import co.com.certification.models.transversal.Peticiones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certification.utils.constantes.ConstantesTrasnversales.STATUS_BAD_REQUEST;

public class ValidarGetNull implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
            String responseGet = Peticiones.getRsEstadoCodigo();
            return responseGet.equals(STATUS_BAD_REQUEST.toString());
    }

    public static ValidarGetNull info() {
        return new ValidarGetNull();
    }
}
