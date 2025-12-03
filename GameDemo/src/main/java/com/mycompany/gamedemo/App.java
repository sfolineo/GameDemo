package com.mycompany.gamedemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * #000000 Black
 *  #FFFFFF White
 *  #FF0000 Red
 *  #0000FF Blue
 *  #008000 Green
 *  #FFFF00 Yellow
 *  #FFA500 Orange
 *  #800080 Purple
 *  #808080 Gray
 *  #C0C0C0 Silver
 *  #000080 Navy
 *  #008080 Teal
 *  #00FF00 Lime
 *  #00FFFF Aqua (Cyan)
 *  #FF00FF Magenta (Fuchsia)
 *  #800000 Maroon
 *  #808000 Olive
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
    // Title
        var titleLabel = new Label("Mr. Maze!");
        titleLabel.setId("titleLabel");
    // Message Label
        var messageLabel = new Label("Error");
        messageLabel.setId("messageLabel");
    // Message Text Box
        var messageTextField = new TextField("");
        messageTextField.setId("messageTextField");
    // Header Box
        var headerHBox = new HBox();
        headerHBox.setId("headerHBox");
        var headerInsets = new Insets(20, 50, 20, 50);
        headerHBox.setPadding(headerInsets);
        headerHBox.getChildren().addAll(titleLabel);
    // Footer Box
        var footerVBox = new VBox();
        footerVBox.setId("footerVBox");
        var footerInsets = new Insets(10, 10, 10, 10);
        footerVBox.setPadding(footerInsets);
        footerVBox.getChildren().addAll(messageTextField);
    // Side Box
        var sideVBox = new VBox();
        sideVBox.setId("sideVBox");
    // Draw Field
        var writableImage = new WritableImage(500, 500);
        var pixelwriter = writableImage.getPixelWriter();
        //////////////////////////////////////////////////////
        // CONSTRUCTION ZONE    
        var test = new Sprite("smiley", writableImage);
        
        test.drawSprite(250, 250, test.getData(), writableImage);
        
        var test2 = new Sprite("smileyHD", writableImage);
        test2.drawSprite(100, 100, test2.getData(), writableImage);
        
        var test3 = new Sprite("smileyPixel", writableImage);
        test3.drawSprite(100, 400, test3.getData(), writableImage);
        
        var tasteGrass = new Sprite("Grass", writableImage);
        tasteGrass.drawSprite(0, 0, tasteGrass.getData(), writableImage);
        tasteGrass.bigEdit(tasteGrass.getData(),writableImage);
        //System.out.println(test3.getData());
        /////////////////////////////////////////////////////
        var imageView = new ImageView(writableImage);
        
    // Action Pane
        var actionPane = new StackPane();
        actionPane.setId("actionPane");
        actionPane.getChildren().add(imageView);
    // Game Pane
        var gamePane = new StackPane();
        gamePane.setId("gamePane");
        var gameInsets = new Insets(10, 75, 10, 75);
        gamePane.setPadding(gameInsets);
        gamePane.getChildren().addAll(actionPane);
    // Main Pane
        var mainPane = new BorderPane();
        mainPane.setId("mainPane");
        mainPane.setTop(headerHBox);
        mainPane.setCenter(gamePane);
        mainPane.setBottom(footerVBox);
    // Scene
        var scene = new Scene(mainPane, 675, 675);
        scene.getStylesheets().add(getClass().getResource("/style.css").
                toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

     
    public static void main(String[] args) {
        launch();
    }

}