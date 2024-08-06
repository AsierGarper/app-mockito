package org.agarcia.appmockito.ejemplos.repositories;

import org.agarcia.appmockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();

    Examen guardar(Examen examen);
}
