import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class runner {

  private  AutentiaFC equipo = new AutentiaFC();

  @Test
  public void primerTest() {

    //JUnit
    assertNotNull(equipo);

    //Hamcrest
    assertThat(equipo, is(not(nullValue())));
  }

  @Test
  public void comprobarSiHayJugadores() {

    //JUnit
    //assertFalse(equipo.getJugadores().isEmpty());

    //Hamcrest
    assertThat(equipo.getJugadores().isEmpty(), is(false));
  }

  @Test
  public void comprobarSiTenemosPortero() {
    final Jugador portero = new Jugador(1, "Portero");

    //JUnit
    //assertTrue(equipo.getJugadores().contains(portero));

    //Hamcrest
    assertThat(equipo.getJugadores(), hasItem(portero));
  }

  @Test
  public void testHamcrest() {
    int reultado = 18;
    String mensaje = "Pepito Perez";

    //assertThat(reultado, is(19));
    //assertThat(mensaje, is("Pepito Perezz"));

    assertThat("Pepito Perezz", equalTo(mensaje));
  }
}
