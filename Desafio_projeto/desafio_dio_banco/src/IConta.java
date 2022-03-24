import javax.print.DocFlavor.STRING;

public interface IConta 
{

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor ,Conta contaDestino);

    String toString();
    
}
