package sio.devoir2magazine.controllers;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.stereotype.Component;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class Devoir2Controller implements Initializable {

    private Alert alert;

    @FXML
    private Button btnAjouterArticle;
    @FXML
    private TableColumn tcNomSpecialite;
    @FXML
    private TextField txtMontantMagazine;
    @FXML
    private ComboBox cboChoixPigiste;
    @FXML
    private TableColumn tcNbPages;
    @FXML
    private Slider sldNbPages;
    @FXML
    private TableView tvMagazines;
    @FXML
    private TableColumn tcNumeroMagazine;
    @FXML
    private TableView tvArticles;
    @FXML
    private TextField txtMontantArticle;
    @FXML
    private TableColumn tcNomMagazine;
    @FXML
    private TableColumn tcNomPigiste;
    @FXML
    private TableColumn tcNomArticle;
    @FXML
    private TextField txtNomArticle;
    @FXML
    private TableColumn tcNumeroArticle;

    @FXML
    public void tvArticlesClicked(Event event) {

        // A vous de jouer

    }

    @FXML
    public void btnAjouterArticleClicked(Event event) {

        if(tvMagazines.getSelectionModel().getSelectedItem() == null)
        {
            alert.setContentText("Veuillez sélectionner un magazine");
            alert.showAndWait();
        }
        else if(txtNomArticle.getText().equals(""))
        {
            alert.setContentText("Veuillez saisir un titre pour votre article");
            alert.showAndWait();
        }
        else
        {
            // A vous de jouer



        }
    }

    @FXML
    public void tvMagazinesClicked(Event event) {

        // A vous de jouer




    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erreur");
        alert.setHeaderText("");

        // Le TableView des magazines
        tcNumeroMagazine.setCellValueFactory( new PropertyValueFactory<>("idMagazine"));
        tcNomMagazine.setCellValueFactory( new PropertyValueFactory<>("nomMagazine"));
        tcNomSpecialite.setCellValueFactory( new PropertyValueFactory<>("nomSpecialite"));

        // Le TableView des articles
        tcNumeroArticle.setCellValueFactory( new PropertyValueFactory<>("idArticle"));
        tcNomArticle.setCellValueFactory( new PropertyValueFactory<>("titreArticle"));
        tcNbPages.setCellValueFactory( new PropertyValueFactory<>("nbFeuillets"));
        tcNomPigiste.setCellValueFactory( new PropertyValueFactory<>("nomPigiste"));

        // A vous de jouer


    }
}