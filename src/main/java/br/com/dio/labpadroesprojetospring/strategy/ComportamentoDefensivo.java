package br.com.dio.labpadroesprojetospring.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se defencivamente");
    }
}
