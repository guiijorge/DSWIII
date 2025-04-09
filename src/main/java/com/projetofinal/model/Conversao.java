package com.projetofinal.model;

public class Conversao {
    private double cotacao;
    private double valorDolar;
    private double valorConvertido;

    public void converter() {
        this.valorConvertido = this.valorDolar * this.cotacao;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public void setValorConvertido(double valorConvertido) {
        this.valorConvertido = valorConvertido;
    }
}
