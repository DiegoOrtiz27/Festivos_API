package com.festivos.model;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

@Entity
@Table(name = "Festivo")
public class Festivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "secuencia_festivo", strategy = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "nombre", length = 100, nullable = false)
    private String Nombre;

    @Column(name = "dia", nullable = false)
    private int Dia;

    @Column(name = "mes", nullable = false)
    private int Mes;

    @Column(name = "diaspascua", nullable = false)
    private int DiasPascua;

    @ManyToOne
    @JoinColumn(name = "idtipo", referencedColumnName = "id")
    private Tipo tipo;

    private Date fecha;

    public Festivo() {
    }

    public Festivo(int id, String nombre, int dia, int mes, int diasPascua, Tipo tipo) {
        this.id = id;
        Nombre = nombre;
        Dia = dia;
        Mes = mes;
        DiasPascua = diasPascua;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int dia) {
        Dia = dia;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int mes) {
        Mes = mes;
    }

    public int getDiasPascua() {
        return DiasPascua;
    }

    public void setDiasPascua(int diasPascua) {
        DiasPascua = diasPascua;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
