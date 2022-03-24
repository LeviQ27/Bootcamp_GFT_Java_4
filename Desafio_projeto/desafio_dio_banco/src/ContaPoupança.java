public class ContaPoupança extends Conta
{

    public ContaPoupança(Cliente cliente) 
    {
        super(cliente);
    }

    @Override
    public String toString() 
    {
        return "=== Extrato Conta Poupanca ===\n" + super.imprimirContaAtributos();
        /*System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirContaAtributos();*/
        
    }

    

    
    
}
