import java.util.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ListarController {

    @FXML
    private Button acaoListar;

    @FXML
    private ListView<Conta> listarClientes;

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

        /*System.out.println(cc1.toString());
        System.out.println(cp1.toString());
        System.out.println(cc2.toString());
        System.out.println(cp2.toString());
        System.out.println(cc3.toString());
        System.out.println(cp3.toString());
        System.out.println(cc4.toString());
        System.out.println(cp4.toString());
        System.out.println(cc5.toString());
        System.out.println(cp5.toString());*/

       List<Conta> criarClientes = new ArrayList<Conta>(){{
           add(cc1);
           add(cp1);
           add(cc2);
           add(cp2);
           add(cc3);
           add(cp3);
           add(cc4);
           add(cp4);
           add(cc5);
           add(cp5);
       }};
       
       this.listarClientes.getItems().addAll(criarClientes);
       this.acaoListar.setDisable(true);
       

    }

}