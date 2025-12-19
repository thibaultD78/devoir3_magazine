package sio.devoir2magazine.controllers;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.stereotype.Component;
import sio.devoir2magazine.entities.Magazine;
import sio.devoir2magazine.services.ArticleService;
import sio.devoir2magazine.services.MagazineService;
import sio.devoir2magazine.services.PigisteService;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class Devoir2Controller implements Initializable {

    private Alert alert;
    private MagazineService magazineService;
    private ArticleService articleService;
    private PigisteService pigisteService;
    @FXML
    private Button btnAjouterArticle;
    @FXML
    private TableColumn <Magazine, Integer>tcNomSpecialite;
    @FXML
    private TextField txtMontantMagazine;
    @FXML
    private ComboBox cboChoixPigiste;
    @FXML
    private TableColumn tcNbPages;
    @FXML
    private Slider sldNbPages;
    @FXML
    private TableView <Magazine>tvMagazines;
    @FXML
    private TableColumn <Magazine, Integer>tcNumeroMagazine;
    @FXML
    private TableView tvArticles;
    @FXML
    private TextField txtMontantArticle;
    @FXML
    private TableColumn<Magazine, String> tcNomMagazine;
    @FXML
    private TableColumn tcNomPigiste;
    @FXML
    private TableColumn tcNomArticle;
    @FXML
    private TextField txtNomArticle;
    @FXML
    private TableColumn tcNumeroArticle;

    public Devoir2Controller(MagazineService magazineService,ArticleService articleService, PigisteService pigisteService) {
        this.magazineService = magazineService;
        this.articleService = articleService;
    }

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
       tvArticles.setItems(FXCollections.observableArrayList(articleService.getAllArticlesByMagazine(tvMagazines.getSelectionModel().getSelectedItem())));
//        lstArticles=
//        txtMontantMagazine.setText();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println(magazineService);

        alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erreur");
        alert.setHeaderText("");

        // Le TableView des magazines
        tvMagazines.setItems(FXCollections.observableArrayList(magazineService.getAllMagazines()));
        tcNumeroMagazine.setCellValueFactory( new PropertyValueFactory<>("id"));
        tcNomMagazine.setCellValueFactory( new PropertyValueFactory<>("nomMag"));
        tcNomSpecialite.setCellValueFactory( new PropertyValueFactory<>("numSpecialite"));


        // Le TableView des articles
        tcNumeroArticle.setCellValueFactory( new PropertyValueFactory<>("idArticle"));
        tcNomArticle.setCellValueFactory( new PropertyValueFactory<>("titreArticle"));
        tcNbPages.setCellValueFactory( new PropertyValueFactory<>("nbFeuillets"));
        tcNomPigiste.setCellValueFactory( new PropertyValueFactory<>("nomPigiste"));

        // A vous de jouer


    }
}