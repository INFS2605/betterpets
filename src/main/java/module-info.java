module au.edu.unsw.infs2605.betterpets {
    requires javafx.baseEmpty;
    requires javafx.base;
    requires javafx.fxmlEmpty;
    requires javafx.fxml;
    requires javafx.controlsEmpty;
    requires javafx.controls;
    requires javafx.graphicsEmpty;
    requires javafx.graphics;
    requires java.sql;

    opens au.edu.unsw.infs2605.betterpets to javafx.fxml;
    exports au.edu.unsw.infs2605.betterpets;
}