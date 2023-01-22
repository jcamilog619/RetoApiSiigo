package co.com.certification.utils.restconsumo.post;

import co.com.certification.models.transversal.Peticiones;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import static co.com.certification.utils.constantes.ConstantesTrasnversales.*;

public class SetPostDatos {
    private SetPostDatos() {
    }

    public static void empleados(Map<String, Object> testData) throws IOException {
        String js_body = new String(Files.readAllBytes(Paths.get(RUTA)));

        Peticiones.setBodyRequest(js_body
                .replace(NOMBRE_USUARIO, testData.get(NOMBRE_PERSONA).toString())
                .replace(TRABAJO_USUARIO, testData.get(TRABAJO).toString()));
    }
}