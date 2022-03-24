public class ContaCorrente extends Conta
{

    public ContaCorrente(Cliente cliente) 
    {
        super(cliente);
    }

    @Override
    public String toString() 
    {
        return "=== Extrato Conta Corrente ===\n" + super.imprimirContaAtributos();
        /*System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirContaAtributos();*/
        
    }

    
    

}
