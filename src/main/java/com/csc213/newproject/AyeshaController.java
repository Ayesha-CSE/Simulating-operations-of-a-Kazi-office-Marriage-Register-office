package com.csc213.newproject;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AyeshaController
{
    @javafx.fxml.FXML
    private TableColumn yearColumn;
    @javafx.fxml.FXML
    private TableColumn preReq2Column;
    @javafx.fxml.FXML
    private TableColumn preReq1Column;
    @javafx.fxml.FXML
    private TextField year;
    @javafx.fxml.FXML
    private ComboBox filterYear;
    @javafx.fxml.FXML
    private TableColumn studentIdColumn;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private ComboBox preReq1;
    @javafx.fxml.FXML
    private ComboBox preReq2;
    @javafx.fxml.FXML
    private TextField studentId;
    @javafx.fxml.FXML
    private TextField studentName;
    @javafx.fxml.FXML
    private TextField semester;
    @javafx.fxml.FXML
    private TextField credit;
    @javafx.fxml.FXML
    private TableColumn studentNameColumn;
    @javafx.fxml.FXML
    private TableColumn semesterColumn;
    @javafx.fxml.FXML
    private TableColumn creditColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filter(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadTable(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addNew(ActionEvent actionEvent) {
    }
}