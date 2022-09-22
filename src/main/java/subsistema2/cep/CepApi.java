package subsistema2.cep;

public class CepApi {

    public static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Teresina";
    }
    public String recuperarEstado(String cidade){
        return "PI";
    }
}
