package com.dalealdado.pruebasfragments;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.security.PublicKey;

@Entity
public class Heroes {
    @PrimaryKey (autoGenerate = true)
    public int id;

    public String nombre;
    public String raza;
    public String descripcion;
    public String inventario;
    public String habilidades;
    public String vida;
    public String fuerza;
    public String defensa;
    public String evasion;
    public String agilidad;
    public String mana;
    public String magia;

}
