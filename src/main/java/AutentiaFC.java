import java.util.ArrayList;
import java.util.List;

public class AutentiaFC {

  final List<Jugador> jugadores;

  public AutentiaFC() {
    jugadores = crearJugadores();
  }

  public List<Jugador> getJugadores() {
    return jugadores;
  }

  private List<Jugador> crearJugadores() {
    List<Jugador> players = new ArrayList<Jugador>();
    players.add(new Jugador(1, "Portero"));
    players.add(new Jugador(2, "Defensa"));
    return players;
  }

}
