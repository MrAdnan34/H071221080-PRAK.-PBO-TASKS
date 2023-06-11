package com.calculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("Adnan Putra - Calculator");
        showOpenScene();
        stage.show();
    }

    private void showOpenScene() {
        Image imageCalculator = new Image(getClass().getClassLoader().getResourceAsStream("img/calculatorImage.png"));

        ImageView calculatorImageView = new ImageView(imageCalculator);
        calculatorImageView.setFitHeight(300);
        calculatorImageView.setFitWidth(400);

        Label appName = new Label("KALKULATOR MANGTAP");
        appName.getStyleClass().add("appName");

        Button buttonStart = new Button("MULAI");
        buttonStart.setOnAction(e -> showMenuScene());
        buttonStart.getStyleClass().add("buttonStart");

        VBox containerOpenScene = new VBox(calculatorImageView, appName, buttonStart);
        containerOpenScene.getStyleClass().add("containerOpenScene");
        containerOpenScene.setAlignment(Pos.CENTER);

        VBox main = new VBox(containerOpenScene);
        main.getStyleClass().add("backgroundApp");

        Scene scene = new Scene(main, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
    }

    private void showMenuScene() {
        // ---> HEADER START <---
        Label headerText = new Label("PILIH MENU BANG");
        BorderPane header = new BorderPane(headerText);
        header.getStyleClass().add("header");
        // ---> HEADER END <---

        Button buttonCalc1 = new Button("Kalkulator Sederhana");
        buttonCalc1.setOnAction(e -> showCalc1Scene());

        Button buttonCalc2 = new Button("Rumus Kubus");
        buttonCalc2.setOnAction(act -> showCalc2Scene());

        Button buttonCalc3 = new Button("Rumus Balok");
        buttonCalc3.setOnAction(act -> showCalc3Scene());

        Button buttonCalc4 = new Button("Rumus Tabung");
        buttonCalc4.setOnAction(act -> showCalc4Scene());

        Button backTOpenScene = new Button("Back to Home");
        backTOpenScene.getStyleClass().add("backTOpenSceneButton");
        backTOpenScene.setOnAction(e -> showOpenScene());

        VBox containerButtonCalc = new VBox(buttonCalc1, buttonCalc2, buttonCalc3, buttonCalc4, backTOpenScene);
        containerButtonCalc.getStyleClass().add("containerButtonCalc");
        containerButtonCalc.setAlignment(Pos.CENTER);

        VBox main = new VBox(header, containerButtonCalc);
        main.getStyleClass().add("backgroundApp");

        Scene scene = new Scene(main, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
    }

    private void showCalc1Scene() {
        // ---> HEADER START <---
        Label headerText = new Label("Kalkulator Sederhana");
        BorderPane header = new BorderPane(headerText);
        header.getStyleClass().add("header");
        // ---> HEADER END <---

        TextField input1 = new TextField();
        input1.setPromptText("Angka 1");
        TextField input2 = new TextField();
        input2.setPromptText("Angka 2");

        VBox containerInput = new VBox(input1, input2);
        // inputContainer.setSpacing(20);
        containerInput.getStyleClass().add("containerInput");

        Label contentText = new Label("Hasil");
        contentText.getStyleClass().add("contentText");
        Label contentValue = new Label("Angka Hasil");
        contentValue.getStyleClass().add("contentValue");

        VBox containerContent = new VBox(contentText, contentValue);
        containerContent.getStyleClass().add("containerContent");

        Button clearButton = new Button("Clear");
        clearButton.getStyleClass().add("clearButtonFirst");
        clearButton.setOnAction(e -> {
            try {
                input1.clear();
                input2.clear();
                contentValue.setText("0");
            } catch (Exception err) {
                err.printStackTrace();
            }
        });

        Button calculateButton = new Button("Calculate");
        calculateButton.getStyleClass().add("calculateButton");
        calculateButton.setOnAction(e -> {
            try {
                String text1 = input1.getText();
                double num1 = Double.parseDouble(text1);

                String text2 = input2.getText();
                double num2 = Double.parseDouble(text2);

                double result = num1 + num2;
                String textResult = String.format("%.2f", result);
                contentValue.setText(textResult);
            } catch (Exception err) {
                err.printStackTrace();
            }
        });

        HBox containerTopButton = new HBox(clearButton, calculateButton);
        containerTopButton.getStyleClass().add("containerTopButton");

        Button backToHome = new Button("Back to Home");
        backToHome.getStyleClass().add("backToHomeButton");
        backToHome.setOnAction(e -> showMenuScene());

        VBox containerButton = new VBox(containerTopButton, backToHome);
        containerButton.getStyleClass().add("containerButton");
        containerButton.setAlignment(Pos.CENTER);

        VBox main = new VBox(header, containerInput, containerContent, containerButton);
        main.getStyleClass().add("backgroundApp");

        Scene scene = new Scene(main, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
        calculateButton.requestFocus(); // Untuk memberikan fokus ke tombol "Calculate" saat Scene ini dibuka
        stage.requestFocus(); // Untuk menghilangkan fokus dari TextField saat Scene dibuka. Tapi dalam hal ini, yang tadinya fokus ada di calculate, akan berpindah ke stage. Berarti tidak ada component yang kena fokus di awal.
    }

    private void showCalc2Scene() {
        // ---> HEADER START <---
        Label headerText = new Label("Rumus Kubus");
        BorderPane header = new BorderPane(headerText);
        header.getStyleClass().add("header");
        // ---> HEADER END <---

        TextField input1 = new TextField();
        input1.setPromptText("Sisi Kubus");

        VBox containerInput = new VBox(input1);
        containerInput.getStyleClass().add("containerInput");

        Label contentText = new Label("Hasil");
        contentText.getStyleClass().add("contentText");
        Label contentValue = new Label("Angka Hasil");
        contentValue.getStyleClass().add("contentValue");

        VBox containerContent = new VBox(contentText, contentValue);
        containerContent.getStyleClass().add("containerContent");

        Button volumeButton = new Button("Volume");
        volumeButton.getStyleClass().add("volumeButton");
        volumeButton.setOnAction(e -> {
            try {
                String text1 = input1.getText();
                double sisi = Double.parseDouble(text1);

                double result = sisi * sisi * sisi;
                String textResult = String.format("%.2f", result);
                contentText.setText("Volume");
                contentValue.setText(textResult);
            } catch (Exception err) {
                err.printStackTrace();
            }
        });

        Button wideButton = new Button("Luas");
        wideButton.getStyleClass().add("wideButton");
        wideButton.setOnAction(e -> {
            try {
                String text1 = input1.getText();
                double sisi = Double.parseDouble(text1);

                double result = 6 * (sisi * sisi);
                String textResult = String.format("%.2f", result);
                contentText.setText("Luas");
                contentValue.setText(textResult);
            } catch (Exception err) {
                err.printStackTrace();
            }
        });

        HBox containerTopButton = new HBox(volumeButton, wideButton);
        containerTopButton.getStyleClass().add("containerTopButton");

        Button clearButton = new Button("Clear");
        clearButton.getStyleClass().add("clearButton");
        clearButton.setOnAction(e -> {
            try {
                input1.clear();
                contentText.setText("Hasil");
                contentValue.setText("0");
            } catch (Exception err) {
                err.printStackTrace();
            }
        });

        Button backToHome = new Button("Back to Home");
        backToHome.getStyleClass().add("backToHomeButton");
        backToHome.setOnAction(e -> showMenuScene());

        VBox containerButton = new VBox(containerTopButton, clearButton, backToHome);
        containerButton.getStyleClass().add("containerButton");
        containerButton.setAlignment(Pos.CENTER);

        VBox main = new VBox(header, containerInput, containerContent, containerButton);
        main.getStyleClass().add("backgroundApp");

        Scene scene = new Scene(main, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
        volumeButton.requestFocus();
        stage.requestFocus();
    }

    private void showCalc3Scene() {
        // ---> HEADER START <---
        Label headerText = new Label("Rumus Balok");
        BorderPane header = new BorderPane(headerText);
        header.getStyleClass().add("header");
        // ---> HEADER END <---

        TextField input1 = new TextField();
        input1.setPromptText("Panjang");
        TextField input2 = new TextField();
        input2.setPromptText("Lebar");
        TextField input3 = new TextField();
        input3.setPromptText("Tinggi");

        VBox containerInput = new VBox(input1, input2, input3);
        containerInput.getStyleClass().add("containerInputMini");

        Label contentText = new Label("Hasil");
        contentText.getStyleClass().add("contentText");
        Label contentValue = new Label("Angka Hasil");
        contentValue.getStyleClass().add("contentValue");

        VBox containerContent = new VBox(contentText, contentValue);
        containerContent.getStyleClass().add("containerContentMini");

        Button volumeButton = new Button("Volume");
        volumeButton.getStyleClass().add("volumeButton");
        volumeButton.setOnAction(e -> {
            try {
                String text1 = input1.getText();
                double panjang = Double.parseDouble(text1);

                String text2 = input2.getText();
                double lebar = Double.parseDouble(text2);

                String text3 = input3.getText();
                double tinggi = Double.parseDouble(text3);

                double result = panjang * lebar * tinggi;
                String textResult = String.format("%.2f", result);
                contentText.setText("Volume");
                contentValue.setText(textResult);
            } catch (Exception err) {
                err.printStackTrace();
            }
        });

        Button wideButton = new Button("Luas");
        wideButton.getStyleClass().add("wideButton");
        wideButton.setOnAction(e -> {
            try {
                String text1 = input1.getText();
                double panjang = Double.parseDouble(text1);

                String text2 = input2.getText();
                double lebar = Double.parseDouble(text2);

                String text3 = input3.getText();
                double tinggi = Double.parseDouble(text3);

                double result = 2 * ((panjang * lebar) + (lebar * tinggi) + (tinggi * panjang));
                String textResult = String.format("%.2f", result);
                contentText.setText("Luas");
                contentValue.setText(textResult);
            } catch (Exception err) {
                err.printStackTrace();
            }
        });

        HBox containerTopButton = new HBox(volumeButton, wideButton);
        containerTopButton.getStyleClass().add("containerTopButton");

        Button clearButton = new Button("Clear");
        clearButton.getStyleClass().add("clearButton");
        clearButton.setOnAction(e -> {
            try {
                input1.clear();
                input2.clear();
                input3.clear();
                contentText.setText("Hasil");
                contentValue.setText("0");
            } catch (Exception err) {
                err.printStackTrace();
            }
        });

        Button backToHome = new Button("Back to Home");
        backToHome.getStyleClass().add("backToHomeButton");
        backToHome.setOnAction(e -> showMenuScene());

        VBox containerButton = new VBox(containerTopButton, clearButton, backToHome);
        containerButton.getStyleClass().add("containerButton");
        containerButton.setAlignment(Pos.CENTER);

        VBox main = new VBox(header, containerInput, containerContent, containerButton);
        main.getStyleClass().add("backgroundApp");

        // ScrollPane main = new ScrollPane(vbox);
        // main.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        // main.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        // main.setPadding(new javafx.geometry.Insets(0));

        Scene scene = new Scene(main, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
        volumeButton.requestFocus();
        stage.requestFocus();
    }

    private void showCalc4Scene() {
        // ---> HEADER START <---
        Label headerText = new Label("Rumus Tabung");
        BorderPane header = new BorderPane(headerText);
        header.getStyleClass().add("header");
        // ---> HEADER END <---

        final double pi = 3.14;
        TextField input1 = new TextField();
        input1.setPromptText("Jari-Jari");
        TextField input2 = new TextField();
        input2.setPromptText("Tinggi");

        VBox containerInput = new VBox(input1, input2);
        containerInput.getStyleClass().add("containerInputMini");

        Label contentText = new Label("Hasil");
        contentText.getStyleClass().add("contentText");
        Label contentValue = new Label("Angka Hasil");
        contentValue.getStyleClass().add("contentValue");

        VBox containerContent = new VBox(contentText, contentValue);
        containerContent.getStyleClass().add("containerContentMini");

        Button volumeButton = new Button("Volume");
        volumeButton.getStyleClass().add("volumeButton");
        volumeButton.setOnAction(e -> {
            try {
                String text1 = input1.getText();
                double r = Double.parseDouble(text1);

                String text2 = input2.getText();
                double tinggi = Double.parseDouble(text2);

                double result = pi * (r * r) * tinggi;
                String textResult = String.format("%.2f", result);
                contentText.setText("Volume");
                contentValue.setText(textResult);
            } catch (Exception err) {
                err.printStackTrace();
            }
        });

        Button wideButton = new Button("Luas");
        wideButton.getStyleClass().add("wideButton");
        wideButton.setOnAction(e -> {
            try {
                String text1 = input1.getText();
                double r = Double.parseDouble(text1);

                String text2 = input2.getText();
                double tinggi = Double.parseDouble(text2);

                double luasAlas = pi * (r * r);
                double luasSelimut = 2 * pi * r * tinggi;
                double luasTotal = 2 * luasAlas + luasSelimut;

                double result = luasTotal;
                String textResult = String.format("%.2f", result);
                contentText.setText("Luas");
                contentValue.setText(textResult);
            } catch (Exception err) {
                err.printStackTrace();
            }
        });

        HBox containerTopButton = new HBox(volumeButton, wideButton);
        containerTopButton.getStyleClass().add("containerTopButton");

        Button clearButton = new Button("Clear");
        clearButton.getStyleClass().add("clearButton");
        clearButton.setOnAction(e -> {
            try {
                input1.clear();
                input2.clear();
                contentText.setText("Hasil");
                contentValue.setText("0");
            } catch (Exception err) {
                err.printStackTrace();
            }
        });

        Button backToHome = new Button("Back to Home");
        backToHome.getStyleClass().add("backToHomeButton");
        backToHome.setOnAction(e -> showMenuScene());

        VBox containerButton = new VBox(containerTopButton, clearButton, backToHome);
        containerButton.getStyleClass().add("containerButton");
        containerButton.setAlignment(Pos.CENTER);

        VBox main = new VBox(header, containerInput, containerContent, containerButton);
        main.getStyleClass().add("backgroundApp");

        Scene scene = new Scene(main, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
        volumeButton.requestFocus();
        stage.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
