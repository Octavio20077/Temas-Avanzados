package maquina_snacks_servicios.servicios;


import maquina_snacks_servicios.dominio.Snack;

import java.util.List;

public interface IServicioSnacks {
    void agregarSnack( Snack snack);
    void mostrarSnack();
    List<Snack> getSnacks()
}
