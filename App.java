package com.bouteina;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;


public class App extends  Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        GridPane root = new GridPane();
        FlowPane leftbanner = new FlowPane();
        leftbanner.setPrefWidth(150);
        String bgStyle = "-fx-background-color: BEIGE;"
                + "-fx-background-radius: 0%;"
                + "-fx-background-inset: 5px;";
        leftbanner.setStyle(bgStyle);

        root.add(leftbanner, 0, 0, 1, 1);
        root.add(createGridPane(), 1, 0, 1, 1);
        Scene scene = new Scene(root, 950, 1000);
        stage.setTitle("Willis College ");
        stage.setScene(scene);
        stage.show();
    }

    public GridPane createGridPane() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(20);
        grid.setVgap(20);

        Text txt = new Text("Student Coop placement Status ");
        txt.setFont(Font.font("Dialog", FontWeight.BOLD, 12));

        grid.add(txt, 1, 0, 1, 1);
        grid.add(new Separator(), 0, 1, 3, 1);

        grid.add(new Label("Students Name:"), 0, 2, 1, 1);
        grid.add(new TextField(), 1, 2, 1, 1);

        grid.add(new Label("Cours/Bash/Year:"), 0, 3, 1, 1);
        grid.add(new TextField(), 1, 3, 1, 1);
        grid.add(new Button("Browse..."), 2, 3, 1, 1);

        grid.add(new Label("Coop Host :"), 0, 4, 1, 1);

        grid.add(new TextField(), 1, 4, 1, 1);


        //Text txt2 = new Text("S ");
        //txt2.setFont(Font.font("Dialog", FontWeight.BOLD, 12));

        //grid.add(txt2, 1, 0, 2, 2);
        grid.add(new Separator(), 0, 1, 3, 1);

        grid.add(new Label("Students Name:"), 0, 2, 1, 1);
        grid.add(new TextField(), 1, 2, 1, 1);

        grid.add(new Label("Cours/Bash/Year:"), 0, 3, 1, 1);
        grid.add(new TextField(), 1, 3, 1, 1);
        grid.add(new Button("Browse..."), 2, 3, 1, 1);

        grid.add(new Label("Coop Host :"), 0, 4, 1, 1);

        grid.add(new TextField(), 1, 4, 1, 1);


        grid.add(new Separator(), 0, 5, 3, 1);

        grid.add(new Label("Coop placement :"), 0, 6, 1, 1);
        ComboBox<String> cb = new ComboBox<>();
        cb.setPrefWidth(400);
        grid.add(cb, 1, 6, 1, 1);
        grid.add(new Button("StartDate/EndDate"), 2, 6, 1, 1);

        grid.add(new CheckBox("Create Custom Preloader"), 0, 7, 3, 1);

        grid.add(new Label("\tProject Name:"), 0, 8, 1, 1);
        grid.add(new TextField(), 1, 8, 1, 1);

        grid.add(new Separator(), 0, 9, 3, 1);

        grid.add(new CheckBox("contract sign on  "
                + "Libraries"), 0, 10, 3, 1);

        grid.add(new Label("\tLibraries Folder:"), 0, 11, 1, 1);
        grid.add(new TextField(), 1, 11, 1, 1);
        grid.add(new Button("Browse..."), 2, 11, 1, 1);

        grid.add(new Label("Different users and projects can "
                + "share the same compilation libraries\n"
                + "(see Help for details)"),1, 12, 1, 1);

        grid.add(new CheckBox("Create Application Class"), 0, 13, 1, 1);
        grid.add(new TextField(), 1, 13, 1, 1);

        grid.add(new CheckBox("Set as Main Project"), 0, 14, 1, 1);

        grid.add(new Separator(), 0, 15, 3, 1);

        FlowPane fp = new FlowPane(Orientation.HORIZONTAL, 10, 10);
        fp.setAlignment(Pos.CENTER_RIGHT);
        fp.getChildren().addAll(
                new Button("< Back"),
                new Button("Next >"),
                new Button("Finish"),
                new Button("Cancel"),
                new Button("Help"));
        grid.add(fp, 0, 16, 3, 1);

        return grid;
    }
}