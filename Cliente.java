public class Cliente {
    
    private String nome;
    private int cpf;
    private Telefone t1;

    Cliente(int cpf, String nome, Telefone t1){
        this.nome = nome;
        this.cpf = cpf;
        this.t1 = t1;
    }

    public int getCPF(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
       
        return "NOME: " + this.nome + "\nCPF: " + this.cpf + "\n ==========SEU TELEFONE============"+ "\nDDD: "+this.t1.getDDD()+"\nNUMERO: "+this.t1.getNumero();
    }
    
}
