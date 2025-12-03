package co.sqasa.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ObtenerFecha {

    public static String dia15MesActual(){
        LocalDate hoy = LocalDate.now();
        LocalDate dia15 = LocalDate.of(hoy.getYear(), hoy.getMonth(), 15);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return dia15.format(formato);

    }

    public static String dia10MesSiguiente(){
        LocalDate hoy = LocalDate.now();
        LocalDate dia10 = hoy.plusMonths(1).withDayOfMonth(10);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return dia10.format(formato);

    }
}
