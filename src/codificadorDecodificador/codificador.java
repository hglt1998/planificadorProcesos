package codificadorDecodificador;

import java.io.*;


public class codificador {

	private static final String ARCHIVO_ORIGEN = "archivo_a_cifrar.txt";
	private static final String ARCHIVO_DESTINO = "archivo_cifrado.txt";
	private static final int DESPLAZAMIENTO_CESAR = 3;
	
	public static void main(String[] args) {
	
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(ARCHIVO_ORIGEN));
				BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter(ARCHIVO_DESTINO))){
			
			String linea;
			StringBuilder lineaCodificada = new StringBuilder();
			
			linea = filtroLectura.readLine();
			
			while (linea != null) {
				lineaCodificada.append(codifica(linea));
				linea = filtroLectura.readLine();
			}
			
			filtroEscritura.write(lineaCodificada.toString());
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String codifica (String texto) {
        StringBuilder cifrado = new StringBuilder();
        int codigo = DESPLAZAMIENTO_CESAR % 26;
        for (int i = 0; i < texto.length(); i++) {
        	if (texto.charAt(i)!=' ') {
	            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
	                if ((texto.charAt(i) + codigo) > 'z') {
	                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
	                } else {
	                    cifrado.append((char) (texto.charAt(i) + codigo));
	                }
	            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
	                if ((texto.charAt(i) + codigo) > 'Z') {
	                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
	                } else {
	                    cifrado.append((char) (texto.charAt(i) + codigo));
	                }
	            }
        	}else {
        		cifrado.append( (char) texto.charAt(i) );
        	}
        }
        return cifrado.toString();
	}

}
