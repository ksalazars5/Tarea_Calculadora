
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author salaz
 */
public class Manual_Usuario {
   public void Manual(String ManualaMostrar){
         try {
            FileReader entrada = new FileReader("Manual de Usuario.txt");

            BufferedReader miBuffer = new BufferedReader(entrada);

            String linea = "";

            while (linea != null) {
                linea = miBuffer.readLine();
                Manual(linea);
                if (linea != null) {
                }

            }
            entrada.close();
        } catch (
                IOException e) { //FileNotFoundException solo para el file, pero la IO es la super clase que abarca read y reader
            System.out.println("No se ha encontrado el archivo");
        }

    }
    
}


