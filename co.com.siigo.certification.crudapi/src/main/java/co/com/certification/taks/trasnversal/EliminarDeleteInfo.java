package co.com.certification.taks.trasnversal;

import co.com.certification.utils.restconsumo.delete.ApiDelete;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class EliminarDeleteInfo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        ApiDelete.procesarDelete();
    }

    public static EliminarDeleteInfo api() {
        return new EliminarDeleteInfo();
    }
}
