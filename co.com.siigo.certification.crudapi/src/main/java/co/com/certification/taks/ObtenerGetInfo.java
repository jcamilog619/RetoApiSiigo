package co.com.certification.taks;

import co.com.certification.utils.restconsumo.get.ApiGet;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class ObtenerGetInfo implements Task {
    private final Map<String, Object> testData;

    public ObtenerGetInfo(Map<String, Object> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ApiGet.procesarGet(testData);
    }

    public static ObtenerGetInfo api(Map<String, Object> testData) {
        return Tasks.instrumented(ObtenerGetInfo.class, testData);
    }
}
