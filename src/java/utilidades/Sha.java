package utilidades;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Sha {

    /**
     * Aplica SHA al texto pasado por parámetro
     *
     * @param texto
     */
    public void cifrarTexto(String texto) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA");
            byte dataBytes[] = texto.getBytes(); // Texto a bytes
            messageDigest.update(dataBytes);
            byte resumen[] = messageDigest.digest(); // Se calcula el resumen

            System.out.println("Mensaje original: " + texto);
            System.out.println("Número de Bytes: " + messageDigest.getDigestLength());
            System.out.println("Algoritmo usado: " + messageDigest.getAlgorithm());
            System.out.println("Resumen del Mensaje: " + new String(resumen));
            System.out.println("Mensaje en Hexadecimal: " + Hexadecimal(resumen));
            System.out.println("Proveedor: " + messageDigest.getProvider().toString());

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    // Convierte Array de Bytes en hexadecimal
    static String Hexadecimal(byte[] resumen) {
        String HEX = "";
        for (int i = 0; i < resumen.length; i++) {
            String h = Integer.toHexString(resumen[i] & 0xFF);
            if (h.length() == 1) {
                HEX += "0";
            }
            HEX += h;
        }
        return HEX.toUpperCase();
    }

    public static void main(String[] args) {
        Sha sha = new Sha();
        sha.cifrarTexto("Mensaje super secreto");
    }
}
