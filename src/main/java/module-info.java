module com.wms.streamraider {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.wms.streamraider to javafx.fxml;
    exports com.wms.streamraider;
}