package co.sqasa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatePickerPage {

    public static final Target INGRESOIFRAME = Target.the("Iframe")
            .located(By.xpath("//iframe[@class='demo-frame'] "));

    public static final Target BTN_CALENDARIO = Target.the("Calendario")
            .located(By.id("datepicker"));

    public static final Target BTN_DIA15 = Target.the("Boton Dia 15")
            .located(By.xpath(" //a[text()='15']"));

    //------------

    public static final Target INGRESOIFRAME2 = Target.the("Iframe")
            .located(By.xpath("//iframe[@class='demo-frame'] "));


    public static final Target BTN_MESSIGUIENTE = Target.the("Mes Siguiente")
            .located(By.xpath("//a[@title='Next']//span"));


    public static final Target BTN_DIA10 = Target.the("Boton Dia 10")
            .located(By.xpath(" //a[text()='10']"));




}
