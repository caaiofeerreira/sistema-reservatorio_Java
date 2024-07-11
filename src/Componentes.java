// import java.util.Random;

public class Componentes {

  //TESTE RAPIDO.
  private boolean sensorInferior = true;
  private boolean sensorSuperior = true;
  private boolean releInterface = true;
  private boolean bomba = true;
  private String sinaleiroVermelho = "Sinaleiro vermelho acionado.";
  private String sinaleiroVerde = "Sinaleiro verde acionado.";
  private String sinaleiroAmarelo = "Sinaleiro amarelo acionado.";

  //METODO ALEATORIO
  // Random random = new Random();

  // private boolean sensorInferior = random.nextBoolean();
  // private boolean sensorSuperior = random.nextBoolean();
  // private boolean releInterface = random.nextBoolean();
  // private boolean bomba = random.nextBoolean();
  // private String sinaleiroVermelho = "Sinaleiro vermelho acionado.";
  // private String sinaleiroVerde = "Sinaleiro verde acionado.";
  // private String sinaleiroAmarelo = "Sinaleiro amarelo acionado.";

  public boolean getSensorInferior() {
    return sensorInferior;
  }

  public boolean getSensorSuperior() {
    return sensorSuperior;
  }

  public boolean getReleInterface() {
    return releInterface;
  }

  public boolean getBomba() {
    return bomba;
  }

  public String getSinaleiroVerde() {
    return sinaleiroVerde;
  }

  public String getSinaleiroVermelho() {
    return sinaleiroVermelho;
  }

  public String getSinaleiroAmarelo() {
    return sinaleiroAmarelo;
  }
}