package co.com.certification.interactions.trasnversal;


import co.com.certification.models.transversal.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.annotations.Subject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static co.com.certification.utils.constantes.ConstantesExcepcion.EXCEPTION_DATOS_VACIOS;


public class CargarDatoFeature implements Interaction {
    private static final Logger LOGGER = LogManager.getLogger(CargarDatoFeature.class.getName());
    private final List<Map<String, Object>> dataTest;

    public CargarDatoFeature(List<Map<String, Object>> dataTest) {
        this.dataTest = dataTest;
    }


    @Subject("Recorre la info que se tiene en el feature, para almacenar")
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!dataTest.isEmpty()) {
            Set<Map.Entry<String, Object>> setMapaAux = dataTest.get(0).entrySet();
            Map<String, Object> mapAux = setMapaAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            if (TestData.info() == null) {
                TestData.setMap(mapAux);
            } else {
                TestData.info().putAll(mapAux);
            }
        } else {
            actor.remember("", new HashMap<>());
            LOGGER.error(EXCEPTION_DATOS_VACIOS);
        }
    }

}