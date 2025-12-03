package co.sqasa.stepdefinitions;

import co.sqasa.interactions.AbrirPagina;
import co.sqasa.questions.ValidarFecha;
import co.sqasa.tasks.SeleccionarDia;
import co.sqasa.tasks.SeleccionarDiaMesSiguiente;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class TestStepDefinition {
    @Before
    public void inicializar(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("mateo");
    }
    //escenario 1:
    @Dado("que me encuentro en la página JQuery")
    public void queMeEncuentroEnLaPáginaJQuery() {
        theActorInTheSpotlight().attemptsTo(AbrirPagina.web());
    }

    @Cuando("selecciono el día {int} del mes actual")
    public void seleccionoElDiaDelMesActual(Integer dia) {
        theActorInTheSpotlight().attemptsTo(SeleccionarDia.dia15());
    }

    @Entonces("debería ver la fecha en el campo de texto")
    public void deberiaVerLaFechaEnElCampoDeTexto() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(ValidarFecha.validaFechaMesActual()).isTrue());
    }

    //escenario 2:
    @Cuando("selecciono el día {int} del próximo mes")
    public void seleccionoElDiaDelProximoMes(Integer dia) {
        theActorInTheSpotlight().attemptsTo(SeleccionarDiaMesSiguiente.dia10MesSiguiente());
    }

    @Entonces("debería ver la fecha del mes siguiente en el campo de texto")
    public void deberiaVerLaFechaDelMesSiguiente() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(ValidarFecha.validaFechaMesSiguiente()).isTrue());
    }

}
