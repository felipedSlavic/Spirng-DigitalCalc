package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraDigitalService {
    public double estimarDowloand(double tamanho, double velocidade){
        if (tamanho <= 0 || velocidade <= 0){
            throw  new IllegalArgumentException("Parâmetros Inválidos");
        } else if (velocidade > 1000) {
            throw new IllegalArgumentException("Parâmetros Inválidos");
        }
        return tamanho * 8/velocidade/60;
    }

    public double estimarFotos(double capacidade, double tamanhoFoto){
        if (capacidade <= 0 || tamanhoFoto <= 0){
            throw  new IllegalArgumentException("Parâmetros Inválidos");
        }
        return capacidade * 1024 / tamanhoFoto;
    }

    public double estimarUsoFranquia(double consumo, double franquia){
        if (consumo <= 0 || franquia <= 0){
            throw  new IllegalArgumentException("Parâmetros Inválidos");
        }
        return consumo/franquia * 100;
    }

}
