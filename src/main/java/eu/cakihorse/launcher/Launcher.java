package eu.cakihorse.launcher;

import eu.cakihorse.launcher.ui.PanelManager;
import eu.cakihorse.launcher.utils.Helpers;
import fr.flowarg.flowlogger.ILogger;
import fr.flowarg.flowlogger.Logger;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.File;

public class Launcher extends Application{
    private PanelManager panelManager;
    private static Launcher instance;
    private final ILogger logger;
    private final File launcherDir = Helpers.generateGamePath("ZedcraftLaucher");
    public Launcher() {
        instance = this;
        this.logger = new Logger("[Zedcraft]", new File(this.launcherDir, "launcher.log").toPath());
        this.launcherDir.mkdir();
    }

    @Override
    public void start(Stage stage) throws Exception {
this.logger.info("Démarrage du Launcher");
this.panelManager = new PanelManager(this, stage);
this.panelManager.init();
    }
    public ILogger getLogger() {
        return logger;
    }
    public static Launcher getInstance() {

        return null;
    }
}
