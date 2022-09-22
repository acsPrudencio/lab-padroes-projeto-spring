package br.com.dio.labpadroesprojetospring.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        // Teste da implementação do padrão Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eagle = SingletonEager.getInstance();
        System.out.println(eagle);
        eagle = SingletonEager.getInstance();
        System.out.println(eagle);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }
}
