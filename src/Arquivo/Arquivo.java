package Arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.logging.Level;
import java.util.logging.Logger;






public class Arquivo {

    
    
    public void leitura() throws IOException{

    	Charset charset = Charset.forName("US-ASCII");
    	try (BufferedReader reader = Files.newBufferedReader(Paths.get("testeLeitura.txt"), charset)) {
    	    String line = null;
    	    while ((line = reader.readLine()) != null) {
    	    	String[] c2 = line.split("\\*");
                for (int i = 0; i < c2.length; i++) {
                    System.out.print(c2[i]);
                    
                }

    	    }
    	} catch (IOException x) {
    	    System.err.format("IOException: %s%n", x);
    	}
    

    }
    
    
    public void escrever() {
        
        String path = "testeEscrita.txt";
       
         try {
             
             
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
       
        String linha = "ARQUIVO E MUITO FACILLLLL :)";
        buffWrite.append(linha + "\n");
        buffWrite.close();
    
          } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    
    
 
}
