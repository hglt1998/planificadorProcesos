package codificadorDecodificador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class decodificador {

	private static final String ARCHIVO_ORIGEN = "archivo_cifrado.txt";
	private static final String ARCHIVO_DESTINO = "archivo_descifrado.txt";
	private static final int DESPLAZAMIENTO_CESAR = 3;
	
	public static void main(String[] args) {
		
		try (BufferedReader filtroLecura = new BufferedReader (new FileReader(ARCHIVO_ORIGEN));
				BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter(ARCHIVO_DESTINO))){
			
			String linea;
			StringBuilder lineaDecodificada = new StringBuilder();
			
			linea = filtroLecura.readLine();
			
			while (linea != null) {
				lineaDecodificada.append(decodifica(linea));
				linea = filtroLecura.readLine();
			}
			
			filtroEscritura.write(lineaDecodificada.toString());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public static String decodifica (String texto) {
		StringBuilder cifrado = new StringBuilder();
        int codigo = DESPLAZAMIENTO_CESAR % 26;
        for (int i = 0; i < texto.length(); i++) {
        	if (texto.charAt(i)!=' ') {
        		if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                    if ((texto.charAt(i) - codigo) < 'a') {
                        cifrado.append((char) (texto.charAt(i) - codigo + 26));
                    } else {
                        cifrado.append((char) (texto.charAt(i) - codigo));
                    }
                } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                    if ((texto.charAt(i) - codigo) < 'A') {
                        cifrado.append((char) (texto.charAt(i) - codigo + 26));
                    } else {
                        cifrado.append((char) (texto.charAt(i) - codigo));
                    }
                }        		
        	}else {
        		cifrado.append( (char) texto.charAt(i) );
        	}
        }
        return cifrado.toString();
	}

}
