import java.util.logging.Logger;

public class Painel {

  private static final Logger logger = Logger.getLogger(Main.class.getName());
  private String temporizador = "Temporizador acionado.";

  public Painel(Componentes componentes) throws InterruptedException {

    try {

      if (componentes.getSensorInferior() && componentes.getReleInterface()) {
        logger.info("OK: Sensor_Inferior: " + componentes.getSensorInferior() + ", Rele_Interface: " + componentes.getReleInterface());
        logger.info("Sinal de OK enviado.");

        if (componentes.getBomba()) {
          logger.info(componentes.getSinaleiroVerde());
          Thread.sleep(2000);
          logger.info("Abastecendo...");
          Thread.sleep(5000);

            if (componentes.getSensorSuperior() && componentes.getReleInterface()) {
              logger.info("Sensor superior acionado. Motor desligados.");
              logger.info("Abastecimento concluido.");
            } else {
              logger.warning(temporizador);
              logger.warning(componentes.getSinaleiroAmarelo());
              Thread.sleep(3000);
              logger.info("Abastecimento concluido.");
              logger.warning("Falha no sensor superior.");
            }
        } else {
          logger.warning(componentes.getSinaleiroVermelho());
          logger.warning("Falha no motor.");
        }
      } else {
        logger.warning("Nenhum sinal enviado.");
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}