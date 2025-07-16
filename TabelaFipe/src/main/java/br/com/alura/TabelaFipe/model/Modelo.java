package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Modelo {
    @JsonProperty("nome")
    private String nomeModelo;
    private String codigo;

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return codigo + " - " + nomeModelo;
    }
}
