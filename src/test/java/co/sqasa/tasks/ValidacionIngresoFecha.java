package co.sqasa.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Keys;

import static co.sqasa.userinterface.DatePickerPage.BTN_CALENDARIO;
import static co.sqasa.utils.Constantes.FECHA;


public class ValidacionIngresoFecha {

    public static Performable IngresoFecha() {
        return Task.where("{0} intenta ingresar fecha manualmente y valida que no se permite",
                actor -> {
                    // Cambiar al frame (si es necesario)
                    actor.attemptsTo(Switch.toFrame(0));

                    // Guardar valor antes
                    String valorAntes = BTN_CALENDARIO.resolveFor(actor).getValue();
                    System.out.println(valorAntes);

                    // Intentar ingresar manualmente
                    actor.attemptsTo(
                            Enter.theValue("11/12/2000").into(BTN_CALENDARIO).thenHit(Keys.ENTER)
                    );

                    actor.remember(FECHA, valorAntes);

                }
        );
    }

}
