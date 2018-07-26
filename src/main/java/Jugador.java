public class Jugador {

  private final int dorsal;
  private final String posicion;

  public Jugador(int dorsal, String posicion) {
    this.dorsal = dorsal;
    this.posicion = posicion;
  }

  public String getPosicion() {
    return posicion;
  }

  public int getDorsal() {
    return dorsal;
  }

}
