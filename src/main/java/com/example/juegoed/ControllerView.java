package com.example.juegoed;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import co.edu.juegoed.model.*;

public class ControllerView {

    Grafo<String> matriz = new Grafo<>();

    @FXML
    private ImageView ImagenGrafo;

    @FXML
    private TextField Azul61;

    @FXML
    private TextField Azul12;

    @FXML
    private Button Azul5;

    @FXML
    private TextField Azul23;

    @FXML
    private Button Azul4;

    @FXML
    private TextField Azul56;

    @FXML
    private TextField Azul45;

    @FXML
    private TextField Azul34;

    @FXML
    private Button Azul6;

    @FXML
    private Button Azul1;

    @FXML
    private Button Azul3;

    @FXML
    private Button Azul2;
    @FXML
    void iniciar(ActionEvent event) {
        iniciarGrafo();

    }

    private void iniciarGrafo (){
        inicializarMatriz(matriz);
        Azul12.setText(String.valueOf(matriz.pesoEntreArcos("Azul1","Azul2")));
        Azul23.setText(String.valueOf(matriz.pesoEntreArcos("Azul2","Azul3")));
        Azul34.setText(String.valueOf(matriz.pesoEntreArcos("Azul3","Azul4")));
        Azul45.setText(String.valueOf(matriz.pesoEntreArcos("Azul4","Azul5")));
        Azul56.setText(String.valueOf(matriz.pesoEntreArcos("Azul5","Azul6")));
        Azul61.setText(String.valueOf(matriz.pesoEntreArcos("Azul6","Azul1")));
    }


    // manejo de la imagen del grafo
    Image myImage = new Image(getClass().getResourceAsStream("grafo2.jpg"));

    public void displayImage() {
        ImagenGrafo.setImage(myImage);
    }

    /**
     * iniciar matriz
     * @param matriz
     */
    private static void  inicializarMatriz( Grafo<String> matriz) {

        //Creando Vertices

        matriz.agregarVertice("Centro1", "Contenido generico del vertice");
        matriz.agregarVertice("Centro2", "Contenido generico del vertice");
        matriz.agregarVertice("Centro3", "Contenido generico del vertice");
        matriz.agregarVertice("Centro4", "Contenido generico del vertice");
        matriz.agregarVertice("Centro5", "Contenido generico del vertice");
        matriz.agregarVertice("Centro6", "Contenido generico del vertice");

        matriz.agregarVertice("Azul1", "Contenido generico del vertice");
        matriz.agregarVertice("Azul2", "Contenido generico del vertice");
        matriz.agregarVertice("Azul3", "Contenido generico del vertice");
        matriz.agregarVertice("Azul4", "Contenido generico del vertice");
        matriz.agregarVertice("Azul5", "Contenido generico del vertice");
        matriz.agregarVertice("Azul6", "Contenido generico del vertice");

        matriz.agregarVertice("Verde1", "Contenido generico del vertice");
        matriz.agregarVertice("Verde2", "Contenido generico del vertice");
        matriz.agregarVertice("Verde3", "Contenido generico del vertice");
        matriz.agregarVertice("Verde4", "Contenido generico del vertice");
        matriz.agregarVertice("Verde5", "Contenido generico del vertice");
        matriz.agregarVertice("Verde6", "Contenido generico del vertice");

        matriz.agregarVertice("Amarillo1", "Contenido generico del vertice");
        matriz.agregarVertice("Amarillo2", "Contenido generico del vertice");
        matriz.agregarVertice("Amarillo3", "Contenido generico del vertice");
        matriz.agregarVertice("Amarillo4", "Contenido generico del vertice");
        matriz.agregarVertice("Amarillo5", "Contenido generico del vertice");
        matriz.agregarVertice("Amarillo6", "Contenido generico del vertice");

        matriz.agregarVertice("Naranja1", "Contenido generico del vertice");
        matriz.agregarVertice("Naranja2", "Contenido generico del vertice");
        matriz.agregarVertice("Naranja3", "Contenido generico del vertice");
        matriz.agregarVertice("Naranja4", "Contenido generico del vertice");
        matriz.agregarVertice("Naranja5", "Contenido generico del vertice");
        matriz.agregarVertice("Naranja6", "Contenido generico del vertice");

        matriz.agregarVertice("Rojo1", "Contenido generico del vertice");
        matriz.agregarVertice("Rojo2", "Contenido generico del vertice");
        matriz.agregarVertice("Rojo3", "Contenido generico del vertice");
        matriz.agregarVertice("Rojo4", "Contenido generico del vertice");
        matriz.agregarVertice("Rojo5", "Contenido generico del vertice");
        matriz.agregarVertice("Rojo6", "Contenido generico del vertice");

        matriz.agregarVertice("Violeta1", "Contenido generico del vertice");
        matriz.agregarVertice("Violeta2", "Contenido generico del vertice");
        matriz.agregarVertice("Violeta3", "Contenido generico del vertice");
        matriz.agregarVertice("Violeta4", "Contenido generico del vertice");
        matriz.agregarVertice("Violeta5", "Contenido generico del vertice");
        matriz.agregarVertice("Violeta6", "Contenido generico del vertice");

        //Creando Arcos
        matriz.nuevoArco("Centro1", "Centro2", 3.0);
        matriz.nuevoArco("Centro2", "Centro3", 3.0);
        matriz.nuevoArco("Centro3", "Centro4", 3.0);
        matriz.nuevoArco("Centro4", "Centro5", 3.0);
        matriz.nuevoArco("Centro5", "Centro6", 3.0);
        matriz.nuevoArco("Centro6", "Centro1", 3.0);

        matriz.nuevoArco("Azul1", "Azul2", 2.0);
        matriz.nuevoArco("Azul2", "Azul3", 2.0);
        matriz.nuevoArco("Azul3", "Azul4", 2.0);
        matriz.nuevoArco("Azul4", "Azul5", 2.0);
        matriz.nuevoArco("Azul5", "Azul6", 2.0);
        matriz.nuevoArco("Azul6", "Azul1", 2.0);


        matriz.nuevoArco("Verde1", "Verde2", 2.0);
        matriz.nuevoArco("Verde2", "Verde3", 2.0);
        matriz.nuevoArco("Verde3", "Verde4", 2.0);
        matriz.nuevoArco("Verde4", "Verde5", 2.0);
        matriz.nuevoArco("Verde5", "Verde6", 2.0);
        matriz.nuevoArco("Verde6", "Verde1", 2.0);

        matriz.nuevoArco("Amarillo1", "Amarillo2", 2.0);
        matriz.nuevoArco("Amarillo2", "Amarillo3", 2.0);
        matriz.nuevoArco("Amarillo3", "Amarillo4", 2.0);
        matriz.nuevoArco("Amarillo4", "Amarillo5", 2.0);
        matriz.nuevoArco("Amarillo5", "Amarillo6", 2.0);
        matriz.nuevoArco("Amarillo6", "Amarillo1", 2.0);

        matriz.nuevoArco("Naranja1", "Naranja2", 2.0);
        matriz.nuevoArco("Naranja2", "Naranja3", 2.0);
        matriz.nuevoArco("Naranja3", "Naranja4", 2.0);
        matriz.nuevoArco("Naranja4", "Naranja5", 2.0);
        matriz.nuevoArco("Naranja5", "Naranja6", 2.0);
        matriz.nuevoArco("Naranja6", "Naranja1", 2.0);

        matriz.nuevoArco("Rojo1", "Rojo2", 2.0);
        matriz.nuevoArco("Rojo2", "Rojo3", 2.0);
        matriz.nuevoArco("Rojo3", "Rojo4", 2.0);
        matriz.nuevoArco("Rojo4", "Rojo5", 2.0);
        matriz.nuevoArco("Rojo5", "Rojo6", 2.0);
        matriz.nuevoArco("Rojo6", "Rojo1", 2.0);

        matriz.nuevoArco("Violeta1", "Violeta2", 2.0);
        matriz.nuevoArco("Violeta2", "Violeta3", 2.0);
        matriz.nuevoArco("Violeta3", "Violeta4", 2.0);
        matriz.nuevoArco("Violeta4", "Violeta5", 2.0);
        matriz.nuevoArco("Violeta5", "Violeta6", 2.0);
        matriz.nuevoArco("Violeta6", "Violeta1", 2.0);

        //Arcos que conectan los hexagonos

        matriz.nuevoArco("Verde5", "Azul3", 1.0);
        matriz.nuevoArco("Amarillo5", "Verde3", 1.0);
        matriz.nuevoArco("Naranja5", "Amarillo3", 1.0);
        matriz.nuevoArco("Rojo5", "Naranja3", 1.0);
        matriz.nuevoArco("Violeta5", "Rojo3", 1.0);
        matriz.nuevoArco("Azul5", "Violeta3", 1.0);

        //Arcos Bidireccionales
        matriz.nuevoArco("Centro1", "Verde4", 1.0);
        matriz.nuevoArco("Verde4", "Centro1", 1.0);
        matriz.nuevoArco("Centro6", "Azul4", 1.0);
        matriz.nuevoArco("Azul4", "Centro6", 1.0);
        matriz.nuevoArco("Amarillo4", "Centro2", 1.0);
        matriz.nuevoArco("Centro2", "Amarillo4", 1.0);
        matriz.nuevoArco("Naranja4", "Centro3", 1.0);
        matriz.nuevoArco("Centro3", "Naranja4", 1.0);
        matriz.nuevoArco("Centro4", "Rojo4", 1.0);
        matriz.nuevoArco("Rojo4", "Centro4", 1.0);
        matriz.nuevoArco("Centro5", "Violeta4", 1.0);
        matriz.nuevoArco("Violeta4", "Centro5", 1.0);
        matriz.nuevoArco("Centro5", "Violeta4", 1.0);

       // System.out.println(matriz);


    }
    }