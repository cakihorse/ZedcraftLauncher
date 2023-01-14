package eu.cakihorse.launcher.ui;

import eu.cakihorse.launcher.Launcher;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PanelManager {
    private final Launcher launcher;
    private final Stage stage;
    private GridPane layout;

        public PanelManager(Launcher launcher, Stage stage){
            this.launcher = launcher;
            this.stage = stage;
    }
    public void init() {
            this.stage.setTitle("Zedcraft | Launcher | By Cakihorse");
            this.stage.setMinWidth(854);
            this.stage.setMinHeight(480);
            this.stage.setWidth(1280);
            this.stage.setHeight(720);
            this.stage.initStyle(StageStyle.DECORATED);
            this.stage.centerOnScreen();


            this.layout = new GridPane();

            Scene scene = new Scene(this.layout);

            this.stage.show();
    }
}
