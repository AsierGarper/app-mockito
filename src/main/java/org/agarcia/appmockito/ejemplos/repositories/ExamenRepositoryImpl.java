package org.agarcia.appmockito.ejemplos.repositories;

import org.agarcia.appmockito.ejemplos.Datos;
import org.agarcia.appmockito.ejemplos.models.Examen;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenRepositoryImpl implements ExamenRepository {

    @Override
    public List<Examen> findAll(){
        System.out.println("ExamenRepositoryImpl.findAll");
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return Datos.EXAMENES;
    }

    @Override
    public Examen guardar(Examen examen){
        System.out.println("ExamenRepositoryImpl.guardar");
        return Datos.EXAMEN;
    }
}
