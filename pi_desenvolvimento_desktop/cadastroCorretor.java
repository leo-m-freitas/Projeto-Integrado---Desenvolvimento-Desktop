public class cadastroCorretor {

    //Encapsulamento
    private String nomeCorretor;
    private int creci;
    private String email;
    private static int contador = 1;
    public static int id;

    public cadastroCorretor(String nomeCorretor) {
        id = id++;
    }

    void imprimirLinha(){
        System.out.println("---------------------------");
    }

    //Métodos getters
    public int getId() {
        return id = contador++;
    }

    public String getNomeCorretor() {
        return nomeCorretor;
    }

    public int getCreci() {
        return creci;
    }

    public String getEmail() {
        return email;
    }

    //Métodos Setters
    public void setNomeCorretor(String nomeCorretor){
        this.nomeCorretor = nomeCorretor;
    }

    public void setCreci(int creci){
        this.creci = creci;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void exibirCorretor(){
        System.out.println("Nome Corretor: " + getNomeCorretor());
        System.out.println("CRECI: " + getCreci());
        System.out.println("E-mail: " + getEmail());
        System.out.println("ID: " + getId());
    }

    //Método Construtor 
    public cadastroCorretor(String nomeCorretor, int creci, String email) {
        this.nomeCorretor = nomeCorretor;
        this.creci = creci;
        this.email = email;
    }
}