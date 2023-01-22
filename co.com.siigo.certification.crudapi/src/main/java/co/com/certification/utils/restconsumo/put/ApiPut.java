package co.com.certification.utils.restconsumo.put;

import co.com.certification.models.transversal.Peticiones;
import io.restassured.http.ContentType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;

import static co.com.certification.enums.EndPoint.ENDPOINT_UPDATE;
import static co.com.certification.utils.constantes.ConstantesExcepcion.EXCEPTION_SERVICO;
import static co.com.certification.utils.constantes.ConstantesTrasnversales.*;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.rest;

public class ApiPut {
    private static final Logger LOGGER = LogManager.getLogger(ApiPut.class.getName());

    private ApiPut() {
    }

    public static void procesarPut(Map<String, Object> testData) throws IOException {
        SetPutDatos.empleados(testData);
        rest().contentType(ContentType.JSON)
                .relaxedHTTPSValidation()
                .body(Peticiones.getBodyRequest())
                .when()
                .put(ENDPOINT_UPDATE.toString() + testData.get(USUARIO));

        lastResponse().prettyPrint();
        JSONObject jsPost = new JSONObject(lastResponse().asString());
        try {
            if (STATUS_OK_POST == lastResponse().statusCode()) {
                String nombre = jsPost.getString(NOMBRE_PERSONA);
                String job = jsPost.getString(TRABAJO);
                String info = nombre + job;
                Peticiones.setInfoEmpleado(info);

            }
        } catch (Exception e) {
            LOGGER.error(EXCEPTION_SERVICO, e);
        }
    }
}