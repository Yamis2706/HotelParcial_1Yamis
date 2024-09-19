package co.edu.uniquindio.HotelParcial_1.appHotel;

public class AppHotel extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(AppHotel.class.getResource(
                "/inicio.fxml"));
        Parent parent = loader.load();

        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Hotel Mi Cielito");
        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args){
        launch(AppHotel.class, args);
    }
}

