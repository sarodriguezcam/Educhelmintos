package com.educacionhelmintos.model.entity;


public class Diagnostico {

    private String pisos,acueducto, zapatos,frutas,dientes,defeca,lavado,diarrea,dolor,debilidad,malestar,apetito;
    private String dx;

    public Diagnostico(String pisos, String acueducto, String zapatos, String frutas, String dientes, String defeca, String lavado, String diarrea, String dolor, String debilidad, String malestar, String apetito, String dx) {
        this.pisos = pisos;
        this.acueducto = acueducto;
        this.zapatos = zapatos;
        this.frutas = frutas;
        this.dientes = dientes;
        this.defeca = defeca;
        this.lavado = lavado;
        this.diarrea = diarrea;
        this.dolor = dolor;
        this.debilidad = debilidad;
        this.malestar = malestar;
        this.apetito = apetito;
        this.dx = dx;
    }

    public Diagnostico() {
    }

    public String getPisos() {
        return pisos;
    }

    public void setPisos(String pisos) {
        this.pisos = pisos;
    }

    public String getAcueducto() {
        return acueducto;
    }

    public void setAcueducto(String acueducto) {
        this.acueducto = acueducto;
    }

    public String getZapatos() {
        return zapatos;
    }

    public void setZapatos(String zapatos) {
        this.zapatos = zapatos;
    }

    public String getFrutas() {
        return frutas;
    }

    public void setFrutas(String frutas) {
        this.frutas = frutas;
    }

    public String getDientes() {
        return dientes;
    }

    public void setDientes(String dientes) {
        this.dientes = dientes;
    }

    public String getDefeca() {
        return defeca;
    }

    public void setDefeca(String defeca) {
        this.defeca = defeca;
    }

    public String getLavado() {
        return lavado;
    }

    public void setLavado(String lavado) {
        this.lavado = lavado;
    }

    public String getDiarrea() {
        return diarrea;
    }

    public void setDiarrea(String diarrea) {
        this.diarrea = diarrea;
    }

    public String getDolor() {
        return dolor;
    }

    public void setDolor(String dolor) {
        this.dolor = dolor;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getMalestar() {
        return malestar;
    }

    public void setMalestar(String malestar) {
        this.malestar = malestar;
    }

    public String getApetito() {
        return apetito;
    }

    public void setApetito(String apetito) {
        this.apetito = apetito;
    }

    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }
}
