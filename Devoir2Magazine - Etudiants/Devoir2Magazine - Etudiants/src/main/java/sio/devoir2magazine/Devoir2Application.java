package sio.devoir2magazine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class Devoir2Application extends Application {

    private ConfigurableApplicationContext springContext;


    @Override
    public void init() {
        springContext = new SpringApplicationBuilder(Devoir2Application.class).run();
    }


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Devoir2Application.class.getResource("devoir2-view.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Gestion magazine");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        springContext.close();
    }

    public static void main(String[] args) {
        launch();
    }
}