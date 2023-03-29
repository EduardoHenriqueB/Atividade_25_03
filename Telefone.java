public class Telefone{
  private int DDD, numero;

  Telefone(int DDD, int numero){
        this.DDD = DDD;
        this.numero = numero;
  }

  public int getDDD(){
     return DDD;
  }
  public void setDDD(int DDD){
    this.DDD = DDD; 
  }
  public int getNumero(){
    return numero;
  }
  public void setNumero(int numero){
    this.numero = numero;
  }

}