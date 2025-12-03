package co.sqasa.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static co.sqasa.userinterface.DatePickerPage.*;


public class SeleccionarDiaMesSiguiente {

    public static Performable dia10MesSiguiente(){
        return Task.where("{0} selecciona el dia 10 del mes siguiente", actor -> {
            actor.attemptsTo(Switch.toFrame(0));
            actor.attemptsTo(Click.on(BTN_CALENDARIO));
            actor.attemptsTo(Click.on(BTN_MESSIGUIENTE));
            actor.attemptsTo(Click.on(BTN_DIA10));
        } );
    }
}
