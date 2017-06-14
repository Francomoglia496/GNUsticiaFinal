package gnu.service;

import gnu.service.ConectarDB;
import gnu.service.Localidad;
import org.apache.commons.net.ftp.FTPClient;

import java.io.*;
import java.net.SocketException;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.*;


/**
 * Created by franco on 18/04/17.
 */
public class Expediente {


    public Expediente() {
    }

    public static void descargarArchivo(Localidad localidad){

        // get an ftpClient object
        FTPClient client1 = new FTPClient();
        FileOutputStream fos = null;

        try {
            // pass directory path on server to connect
            client1.connect("ftp.justiciachaco.gov.ar");

            // pass username and password, returned true if authentication is
            // successful
            boolean login = client1.login("anonymous", "anonymous");

            if (login) {
                System.out.println("Connection established...");

                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese la fecha con el siguiente formato: aaaa-mm-dd");
                String fecha = sc.nextLine();

                for (int i = 0; i < localidad.getLinkCaratulas().length; i++) {


                    //String caratula = localidad.getNombresCaratulas()[i];

                    File archivo = new File("./GNUsticia/" + localidad.getName() + "/"
                            + localidad.getNombresCaratulas()[i] + fecha +".txt");

                    if (!archivo.exists()) {

                        fos = new FileOutputStream("./GNUsticia/" + localidad.getName() + "/" + localidad.getNombresCaratulas()[i] + fecha + ".txt");

                        //if (!fileExist(localidad, caratula, fecha)){

                        boolean download = client1.retrieveFile(localidad.getLinkCaratulas()[i] + fecha + ".Txt", fos);

                        if (download) {
                            System.out.println("Archivo descargado correctamente!");
                        } else {
                            System.out.println("Error al descargar el archivo o el archivo no existe!");
                        }
                    }
                    //}else {

                        /*System.out.println("archivo: " + localidad.getNombresCaratulas()[i] + fecha +
                                ".txt" + " ya existente");*/
                    //}


                    /*boolean download = client1.retrieveFile(localidad.getLinkCaratulas()[i] + fecha + ".Txt", fos);

                    if (download) {
                        System.out.println("Archivo descargado correctamente!");
                    } else {
                        System.out.println("Error al descargar el archivo o el archivo no existe!");
                    }*/

                }


                // logout the user, returned true if logout successfully
                boolean logout = client1.logout();
                client1.disconnect();
                if (logout) {
                    System.out.println("Logout...");
                    System.out.println("Disconnecting...");
                }
            } else {
                System.out.println("Connection fail...");
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                client1.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void generarCarpetas(){

        File folder = new File("./GNUsticia");
        folder.mkdir();

        File folderResistencia = new File("./GNUsticia/Resistencia");
        File folderSaenzP = new File("./GNUsticia/SaenzPeña");
        File folderVillaAngela = new File("./GNUsticia/VillaAngela");
        File folderCharata = new File("./GNUsticia/Charata");
        File folderSanMartin = new File("./GNUsticia/SanMartin");
        File folderCastelli = new File("./GNUsticia/Castelli");

        if (!folderResistencia.exists()){
            folderResistencia.mkdir();
        }else System.out.println("directorio Resistencia ya existente");

        if (!folderSaenzP.exists()){
            folderSaenzP.mkdir();
        }else System.out.println("directorio Saenz Peña ya existente");

        if (!folderVillaAngela.exists()){
            folderVillaAngela.mkdir();
        }else System.out.println("directorio Villa Angela ya existente");

        if (!folderCharata.exists()){
            folderCharata.mkdir();
        }else System.out.println("directorio Charata ya existente");

        if (!folderSanMartin.exists()){
            folderSanMartin.mkdir();
        }else System.out.println("directorio SanMartin ya existente");

        if (!folderCastelli.exists()){
            folderCastelli.mkdir();
        }else System.out.println("directorio Castelli ya existente");


    }



    public static Collection muestraContenido(String urlArchivo, String[] exptes) throws IOException {

        String cadena;
        FileReader f = new FileReader(urlArchivo);
        BufferedReader b = new BufferedReader(f);

        String a = "" ;

        while((cadena = b.readLine())!=null) {

            a = a + cadena + "\n";

        }
        b.close();

        String[] array = a.split("----------------------------------------------------------------");

        String textoSalidaYaFiltrado = "";


//>>>>>>> 781ce44c418aae29ff93f13cb69497562d3ae163
        ArrayList<String> lista = new ArrayList<String>();
        int cont = 0;

        for (String pos: array) {

            for (String pos2: exptes) {

                if (pos.contains(pos2)){

                    //System.out.println(pos);
                    //System.out.println(cont + 1);
                    if (pos != "[]")
                    lista.add(pos);


                }

            }

        }

        //System.out.println(textoSalidaYaFiltrado);
        return lista;

    }

    public static void crearArchivoFinal(Localidad localidad, String fecha) throws FileNotFoundException {


        for (String nombre : localidad.getNombresCaratulas()){

            String url = "./GNUsticia/" + localidad.getName() + "/" + nombre + fecha + ".txt";

            FileReader fr = new FileReader(url);
            BufferedReader bf = new BufferedReader(fr);


        }

    }

    public static Collection ListaBuscados(String fecha) throws IOException {

        ArrayList<String> listaexp = new ArrayList<String>();

        Localidad resistencia = Localidad.resistencia();

        ConectarDB conectarDB = new ConectarDB();
        String[] exptesList = conectarDB.listarExpedientesPropios(); //Expediente.selectFromDB();

        for (String a : exptesList){
            System.out.println(a);
        }

        //String fecha = "2017-04-21";

        for (String aux : resistencia.getNombresCaratulas()){

            String str = "./GNUsticia/" + resistencia.getName() + "/" + aux + fecha + ".txt";
            File archivo = new File(str);
            String urlArch = resistencia.getNombresCaratulas() + fecha + ".txt";

            if (archivo.exists()){

                listaexp.addAll(muestraContenido(str, exptesList));
                //muestraContenido(str, exptesList)
            }

        }

        //System.out.println(listaexp);
        return listaexp;
    }

    /*
    public static Collection<Usuario> getListaUsuario(){

        if (!listusuarios.values().isEmpty()){
            return listusuarios.values();
        }else throw new CustomExceptionUsuario("Coleccion vacia");

    }
    */



}