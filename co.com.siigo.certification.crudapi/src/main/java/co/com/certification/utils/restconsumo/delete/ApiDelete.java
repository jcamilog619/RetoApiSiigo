package co.com.certification.utils.restconsumo.delete;

import co.com.certification.models.transversal.Peticiones;
import io.restassured.http.ContentType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static co.com.certification.enums.EndPoint.ENDPOINT_DELETE;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.rest;

public class ApiDelete {
    private static final Logger LOGGER = LogManager.getLogger(ApiDelete.class.getName());

    private ApiDelete() {
    }

    public static void procesarDelete() {
        rest().contentType(ContentType.JSON)
                .relaxedHTTPSValidation()
                .when()
                .delete(ENDPOINT_DELETE.toString() + Peticiones.getId());

        lastResponse().prettyPrint();
        Peticiones.setRsEstadoCodigo(String.valueOf(lastResponse().statusCode()));
    }
}