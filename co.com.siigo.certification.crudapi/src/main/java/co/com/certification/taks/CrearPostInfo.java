package co.com.certification.taks;

import co.com.certification.utils.restconsumo.post.ApiPost;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.io.IOException;
import java.util.Map;

public class CrearPostInfo implements Task {
    private final Map<String, Object> testData;

    public CrearPostInfo(Map<String, Object> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            ApiPost.procesarPost(testData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static CrearPostInfo api(Map<String, Object> testData) {
        return Tasks.instrumented(CrearPostInfo.class, testData);
    }
}
