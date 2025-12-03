package co.sqasa.questions;


import co.sqasa.utils.ObtenerFecha;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.sqasa.userinterface.DatePickerPage.BTN_CALENDARIO;
import static co.sqasa.utils.Constantes.FECHA;


public class ValidarFecha {

    public static Question<Boolean> validaFechaMesActual(){
        return Question.about("{0} valida la fecha del mes actual").answeredBy(actor -> {
            String fechaDia15 = ObtenerFecha.dia15MesActual();
            actor.attemptsTo(Ensure.that(BTN_CALENDARIO.resolveFor(actor).getValue()).isEqualTo(fechaDia15));
            return true;

        });

    }

    public static Question<Boolean> validaFechaMesSiguiente(){
        return Question.about("{0} valida la fecha del mes siguiente").answeredBy(actor -> {
            String fechaDia10 = ObtenerFecha.dia10MesSiguiente();
            actor.attemptsTo(Ensure.that(BTN_CALENDARIO.resolveFor(actor).getValue()).isEqualTo(fechaDia10));
            return true;

        });

    }
    public static Question<Boolean> validaIngresoFechaManual(){
        return Question.about("{0} valida ingreso de fecha manual").answeredBy(actor -> {
            String valorActual = actor.recall(FECHA);
            actor.attemptsTo(Ensure.that(BTN_CALENDARIO.resolveFor(actor).getValue()).isEqualTo(valorActual).withReportedError("Se permite escribir en el campo"));
            return true;

        });

    }
}



