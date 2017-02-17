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
    private static FileReader fr;
    private static BufferedReader br;
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
    
    public static List<String> readFile(){
        List<String> contenidoFile = new ArrayList();
        try {
            fr = new FileReader(FILENAME);
            String sCurrentLine;
            BufferedReader brd = new BufferedReader(new FileReader(FILENAME));
            while ((sCurrentLine = brd.readLine()) != null) {
                contenidoFile.add(sCurrentLine);    
                System.out.println(contenidoFile);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenidoFile;
    }
    
    
    private static String[] listaConCodigos;
    private static String[] listaParaAutocompletar;
    static String[] id_ciudad;
    public static void readFileCiudadesDIAN(){
       
        Map<Integer,String> listaCiudades = new LinkedHashMap();

        try 
        {
//            File f = new File("/ciudades.txt");
//            System.out.println("'''" + f.getAbsolutePath());
            
            InputStream inputStream = new FileInputStream("C:\\Users\\fidel.villero\\Desktop\\Miscelanea\\src\\File\\ciudades.txt");// FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/WEB-INF/classes/TCC/UTIL/ciudades.txt");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            
            int j;
            try 
            {
		j = inputStream.read();
		while (j != -1) 
                {
                    byteArrayOutputStream.write(j);
                    j = inputStream.read();
		}
			
                inputStream.close();
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }     
            
            listaConCodigos = byteArrayOutputStream.toString().split("\n");
            listaParaAutocompletar = new String[listaConCodigos.length];
            
            for (int x = 0; x < listaConCodigos.length; x++) 
            {
                id_ciudad = listaConCodigos[x].split(",");
                listaParaAutocompletar[x] = id_ciudad[1] + ", " + id_ciudad[2];
                System.out.println("--- " + Integer.parseInt(id_ciudad[0])+"," + id_ciudad[1] + " / " + id_ciudad[2] );
                listaCiudades.put(Integer.parseInt(id_ciudad[0]), id_ciudad[1] + " / " + id_ciudad[2]);
            }     
        }catch (Exception e) 
        {
            e.printStackTrace();
        }     
            
//            listaConCodigos = byteArrayOutputStream.toString().split("\n");
//            listaParaAutocompletar = new String[listaConCodigos.length];
//            
//            for (int x = 0; x < listaConCodigos.length; x++) 
//            {
//                id_ciudad = listaConCodigos[x].split(",");
//                listaParaAutocompletar[x] = id_ciudad[1] + ", " + id_ciudad[2];
//                listaCiudades.put(Integer.parseInt(id_ciudad[0]), id_ciudad[1] + " / " + id_ciudad[2]);
//            }            

//        }catch (Exception er) {
//            System.out.println("ERROR readFileCiudadesDIAN " + er.toString());
        //}
        //return listaCiudades;
    }
    
    public static void main(String[] args) throws IOException {
        // Escribir y leer texto aleatorio
//        List<String> contenido= readFile();
//        writeLogFile(contenido);
        
        // Leer estructura de archivo determinada(Ciudades DIAN)
        readFileCiudadesDIAN();
    }
    
}
