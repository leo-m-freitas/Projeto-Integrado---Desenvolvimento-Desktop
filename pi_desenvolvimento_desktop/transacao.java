public class transacao {
    //Encapsulamento
    public int idCliente;
    public int idCreci;
    public int idImovel;
    public int idTransacao;
    private String data;
    private String tipoImovel;
    private static int contador = 1;

    public transacao(int idCliente) {
        idTransacao = idTransacao++;
    }

    void imprimirLinha(){
        System.out.println("---------------------------");
    }

    //Métodos getters
    public int getId() {
        return idTransacao = contador++;
    }

    public int getIdCliente() {
        return idCliente = cadastroClientes.id;
    }

    public int getIdCreci() {
        return idCreci = cadastroCorretor.id;
    }

    public int getIdImovel() {
        return idImovel = imoveisAlugar.id;
    }

    public String getData() {
        return data;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    //Métodos setters
    public int setId() {
        return idTransacao = contador++;
    }

    public int setIdCliente() {
        return idCliente = cadastroClientes.id;
    }

    public int setIdCreci() {
        return idCreci = cadastroCorretor.id;
    }

    public int setIdImovel() {
        return idImovel = imoveisAlugar.id;
    }

    public String setData() {
        return data;
    }

    public String setTipoImovel() {
        return tipoImovel;
    }

    public void exibirTransacao(){
        System.out.println("ID Cliente : " + getIdCliente());
        System.out.println("ID CRECI: " + getIdCreci());
        System.out.println("ID Imóvel : " + getIdImovel());
        System.out.println("ID da Transação : " + getId());
        System.out.println("Data do contrato : "+ getData());
        System.out.println("Tipo do Imóvel: " + getTipoImovel());
        
    }

    //Método Construtor 
    public void Transacao(int idCliente, int idCreci, int idImovel, int idTransacao, String data, String tipoImovel) {
        this.idCliente = cadastroClientes.id;
        this.idCreci = cadastroCorretor.id;
        this.idImovel = imoveisAlugar.id;
        this.idTransacao = idTransacao;
        this.data = data;
        this.tipoImovel = tipoImovel;
    }


}
