package co.sqasa.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static co.sqasa.utils.Constantes.URL;


public class AbrirPagina {
    public static Performable web(){
        return Task.where("{0} abre la pagina web", actor->{
            actor.wasAbleTo(Open.url(URL));
        });
    }
}
