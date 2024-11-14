module progiipoo.bonvoyageapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens progiipoo.bonvoyageapp to javafx.fxml;
    exports progiipoo.bonvoyageapp;
    exports progiipoo.bonvoyageapp.controller;
    opens progiipoo.bonvoyageapp.controller to javafx.fxml;
    exports progiipoo.bonvoyageapp.controller.sesionCliente;
    opens progiipoo.bonvoyageapp.controller.sesionCliente to javafx.fxml;
    exports progiipoo.bonvoyageapp.controller.sesionAdmin;
    opens progiipoo.bonvoyageapp.controller.sesionAdmin to javafx.fxml;
}