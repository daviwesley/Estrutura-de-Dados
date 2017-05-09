package Arquivo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import ListaEncadeada.ListaEncadeada;

public class Arquivo {

	public void leitura(String arquivo) throws IOException {
		int totaldelinhas = this.contaLinhas(arquivo);
		ListaEncadeada l[] = new ListaEncadeada[totaldelinhas];
		int vetor = 0;
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(arquivo), charset)) {
			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] c2 = line.split(" ");
				l[vetor] = new ListaEncadeada();
				for (int i = 0; i < c2.length; i++) {
					l[vetor].adicionarFim(Integer.parseInt(c2[i]));
				}
				System.out.println("");
				
				l[vetor].selectionSort();
				//l[vetor].imprimir();
				this.escrever(l[vetor].toString());
				vetor++;
			}
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}
	}

	public int contaLinhas(String filename) throws IOException {
		InputStream is = new BufferedInputStream(new FileInputStream(filename));
		try {
			byte[] c = new byte[1024];
			int count = 0;
			int readChars = 0;
			boolean endsWithoutNewLine = false;
			while ((readChars = is.read(c)) != -1) {
				for (int i = 0; i < readChars; ++i) {
					if (c[i] == '\n')
						++count;
				}
				endsWithoutNewLine = (c[readChars - 1] != '\n');
			}
			if (endsWithoutNewLine) {
				++count;
			}
			return count;
		} finally {
			is.close();
		}
	}

	public void escrever(String s ) throws IOException{
		FileWriter fw = null;
		fw = new FileWriter("saida.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(s);
		bw.newLine();
		bw.close();
		fw.close();		
	}
}
