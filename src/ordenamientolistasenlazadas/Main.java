package ordenamientolistasenlazadas;

import static ordenamientolistasenlazadas.Metodos.*;
import static ordenamientolistasenlazadas.ListasEnlazadas.*;

public class Main {

    static Nodo cabeza = null;
    public static void main(String[] args) {

        while (true) {
            menu();
            
            byte opcion = inputByte("╔═══ Ingrese su opcion");
            

            switch (opcion) {
                case 0 -> mostrarAviso("Saliendo...");
                case 1 -> imprimirLista();
                case 2 -> iniciarLista();
                case 3 -> insertarAlInicio();
                case 4 -> insertarAlFinal();
                case 5 -> eliminarPrimero();
                case 6 -> eliminarUltimo();
                case 7 -> ordenarPorNombres();
                case 8 -> ordenarPorNombresInvertido();
                case 9 -> ordenarPorSaldos();
                case 10 -> ordenarPorSaldosInvertido();
                default -> mostrarError("Opcion invalida");
                    
            }

            if(opcion == 0){
                break;
            }
        }
        
    }

}

