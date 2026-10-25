module com.fomdev.cmc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.fomdev.cmc to javafx.fxml;
    exports com.fomdev.cmc;
    exports com.fomdev.foxoltl;
}