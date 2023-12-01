package com.festivos.interfaces;

import java.util.Date;
import java.util.List;

import com.festivos.model.FestivoOperaciones;

public interface FestivoInterface {

    public boolean esFestivo (Date Fecha);

    public List<FestivoOperaciones> obtenerFestivos(int año);

    public boolean esFechaValida(String strFecha);
}
