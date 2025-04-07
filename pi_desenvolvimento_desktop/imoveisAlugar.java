public class imoveisAlugar {
    
    String tipo;
    String endereco;
    String fotos;
    //Encapsulamento
    private double preco;
    public static int id;
    private static int contador = 1;

    //Métodos / Comportamentos 
    void exibirDetalhes() {
        System.out.println("Tipo do Imóvel: " + tipo);
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor: " + preco);
        System.out.println("Fotos: " + fotos);
        System.out.println("ID: " + getId());
    }

    void imprimirLinha(){
        System.out.println("---------------------------");
    }

    public imoveisAlugar(String tipo) {
        id = id++;
    }

    public int getId() {
        return id = contador++;
    }

    //Método Construtor
    public imoveisAlugar(String tipo, String endereco, String fotos, double preco) {
        this.tipo = tipo;
        this.endereco = endereco;
        this.fotos = fotos;
        this.preco = preco;
    }

    public void exibirTransacao(int idCliente) {
        id = idCliente;
        
    }
}
