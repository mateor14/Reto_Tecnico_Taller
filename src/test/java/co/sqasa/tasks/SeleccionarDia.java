package co.sqasa.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static co.sqasa.userinterface.DatePickerPage.BTN_CALENDARIO;
import static co.sqasa.userinterface.DatePickerPage.BTN_DIA15;


public class SeleccionarDia {

    public static Performable dia15(){
        return Task.where("{0} selecciona el dia 15 del mes actual", actor -> {
            actor.attemptsTo(Switch.toFrame(0));
            actor.attemptsTo(Click.on(BTN_CALENDARIO));
            actor.attemptsTo(Click.on(BTN_DIA15));
        } );
    }
}
