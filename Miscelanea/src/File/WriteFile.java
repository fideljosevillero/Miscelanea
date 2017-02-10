/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.*;
//import java.io.FileWriter;
import java.util.logging.Level;
import java.util.*;

/**
 *
 * @author fidel.villero
 */
public class WriteFile {
    
    private static final String FILENAME = "C:\\Users\\fidel.villero\\Desktop\\Miscelanea\\log_numero_casillero_vacio.txt";
//    private static String contenidoFile = "";
    private static FileReader fr;// = new FileReader(FILENAME);
    private static BufferedReader br;// = new BufferedReader(fr);
    private static BufferedWriter bw = null;
    private static FileWriter fw = null;

    
    public static void writeLogFile(List<String> content){
        try {
            fw = new FileWriter(FILENAME);
            bw = new BufferedWriter(fw);
            for(String i : content){
                bw.write(i+"\n");
            }
            bw.write("nombre3\n");
            bw.close();
        }catch(Exception er){ 
            System.out.println("ERROR EN EL FILE DE LOGS ENVIAR MAILS CASILLERO CREADO " + er.toString());
        }
    }
    
    // Leer
    public static List<String> readFile(){
        List<String> contenidoFile = new ArrayList();
        try {
            fr = new FileReader(FILENAME);
            String sCurrentLine;
            BufferedReader br = new BufferedReader(new FileReader(FILENAME));
            while ((sCurrentLine = br.readLine()) != null) {
                contenidoFile.add(sCurrentLine);    
                System.out.println(contenidoFile);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenidoFile;
    }
    
    public static void main(String[] args) throws IOException {
        List<String> contenido= readFile();
        writeLogFile(contenido);
    }
    
}
