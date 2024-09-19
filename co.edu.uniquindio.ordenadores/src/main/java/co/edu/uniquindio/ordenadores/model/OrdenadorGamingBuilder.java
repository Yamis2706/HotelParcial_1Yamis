package co.edu.uniquindio.ordenadores.model;

public class OrdenadorGamingBuilder implements IOrdenadorBuilder{

    private OrdenadorBuilder ordenador = new OrdenadorBuilder();


    @Override
    public void setProcesador(String procesador) {
        ordenador.setProcesador(procesador);
    }

    @Override
    public void setTarjetaGrafica(String tarjetaGrafica) {
        ordenador.setTarjetaGrafica(tarjetaGrafica);
    }

    @Override
    public void setRam(int ram) {
        ordenador.setRam(ram);
    }

    @Override
    public void setFuenteAlimentacion(String fuenteAlimentacion) {
        ordenador.setFuenteAlimentacion(fuenteAlimentacion);
    }

    @Override
    public void setSistemaRefrigeracion(String sistemaRefrigeracion) {
        ordenador.setSistemaRefrigeracion(sistemaRefrigeracion);
    }

    @Override
    public void setMonitor(String monitor) {
        ordenador.setMonitor(monitor);
    }

    @Override
    public void setTecladoMecanico(String tecladoMecanico) {
        ordenador.setTecladoMecanico(tecladoMecanico);
    }

    @Override
    public void setRatonGaming(String ratonGaming) {
        ordenador.setRatonGaming(ratonGaming);
    }


    @Override
    public OrdenadorBuilder build() {
        ordenador.setSistemaRefrigeracion("Líquido");
        return ordenador;
    }
}
