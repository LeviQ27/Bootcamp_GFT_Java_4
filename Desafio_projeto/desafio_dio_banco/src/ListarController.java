import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ListarController {

    @FXML
    private Button acaoListar;

    @FXML
    void listarClientes(ActionEvent event) 
    {
        Listar lista = new Listar();
        lista.funcaoLista();
    }

}