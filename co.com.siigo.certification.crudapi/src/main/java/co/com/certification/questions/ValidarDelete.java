package co.com.certification.questions;

import co.com.certification.models.transversal.Peticiones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarDelete implements Question<Boolean> {
    private final String codigo;

    public ValidarDelete(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String responsePost = Peticiones.getRsEstadoCodigo();
        return codigo.contains(responsePost);
    }

    public static ValidarDelete transversal(String codigo) {
        return new ValidarDelete(codigo);
    }
}
