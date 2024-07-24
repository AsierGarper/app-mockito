package org.agarcia.appmockito.ejemplos.services;

import org.agarcia.appmockito.ejemplos.models.Examen;

public interface ExamenService {
    Examen findExamenPorNombre(String nombre);
}
