package br.com.dio.labpadroesprojetospring.facade;

public class TestFacade {
    public static void main(String[] args) {
        // Teste da implementação do padrão Strategy
        Facade facade = new Facade();
        facade.migrarCliente("Antonio","64345000");
    }
}
