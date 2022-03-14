import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ListarController {

    @FXML
    private Button acaoListar;

    @FXML
    private ListView<?> listarClientes;

    @FXML
    void listarClientes(ActionEvent event) {

        Cliente levi = new Cliente();
        levi.setNome("Levi");
        Cliente herick = new Cliente();
        herick.setNome("Herick");
        Cliente joao = new Cliente();
        joao.setNome("João");
        Cliente juliana = new Cliente();
        juliana.setNome("Juliana");
        Cliente adna = new Cliente();
        adna.setNome("Adna");

        Conta cc1 = new ContaCorrente(levi);
        Conta cp1 = new ContaPoupança(levi);
        Conta cc2 = new ContaCorrente(herick);
        Conta cp2 = new ContaPoupança(herick);
        Conta cc3 = new ContaCorrente(joao);
        Conta cp3 = new ContaPoupança(joao);
        Conta cc4 = new ContaCorrente(juliana);
        Conta cp4 = new ContaPoupança(juliana);
        Conta cc5 = new ContaCorrente(adna);
        Conta cp5 = new ContaPoupança(adna);

        cc1.depositar(4000);
        cp1.depositar(15000);
        cc2.depositar(4000);
        cp2.depositar(15000);
        cc3.depositar(4000);
        cp3.depositar(15000);
        cc4.depositar(4000);
        cp4.depositar(15000);
        cc5.depositar(4000);
        cp5.depositar(15000);

       ListView<Conta> listarClientes = new ListView<Conta>();
       listarClientes.getItems().addAll(cc1);

    }

}