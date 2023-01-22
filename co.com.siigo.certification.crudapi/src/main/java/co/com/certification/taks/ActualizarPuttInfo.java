package co.com.certification.taks;

import co.com.certification.utils.restconsumo.put.ApiPut;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.io.IOException;
import java.util.Map;

public class ActualizarPuttInfo implements Task {
    private final Map<String, Object> testData;

    public ActualizarPuttInfo(Map<String, Object> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            ApiPut.procesarPut(testData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ActualizarPuttInfo api(Map<String, Object> testData) {
        return Tasks.instrumented(ActualizarPuttInfo.class, testData);
    }
}
