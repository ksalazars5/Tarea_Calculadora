/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearcalculadora;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author salaz
 */
public class Bitacota {
    //crear metodo
    public void Bitacora(String datoRecibido){
        try {FileWriter escritura = new FileWriter("Historial.txt",true);
            for(int i = 0; i<datoRecibido.length();i++){
                escritura.write(datoRecibido.charAt(i));
            }
            escritura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
