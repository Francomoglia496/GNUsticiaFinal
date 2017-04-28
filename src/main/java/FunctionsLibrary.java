import org.apache.commons.net.ftp.FTPClient;

import java.io.*;
import java.net.SocketException;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by franco on 18/04/17.
 */
public class FunctionsLibrary {

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

    public  static String[] selectFromDB(){

        ArrayList<String> exptes = new ArrayList<String>();

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://tugal.com.ar:3306/tugal_gnu",
                    "tugal_franco","franco");

            if (conexion != null){
                System.out.println("conexion establecida");
            }else System.out.println("conexion fallida");

            // Preparamos la consulta
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM gnu");

            int i = 0;
            while (rs.next()){
                exptes.add(rs.getString(2));
            }

            String[] exptesSalida = new String[exptes.size()];

            for (int j = 0; j < exptes.size(); j++) {

                exptesSalida[j] = exptes.get(j);

            }

            conexion.close();
            return exptesSalida;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new String[exptes.size()];
    }

    public static void insertIntoDB(String[] expedientes){

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://tugal.com.ar:3306/tugal_gnu",
                    "tugal_franco","franco");

            if (conexion != null){
                System.out.println("conexion establecida");
            }else System.out.println("conexion fallida");


            for (String expediente : expedientes){

                // Preparamos la consulta
                Statement s = conexion.createStatement();
                s.executeUpdate("INSERT INTO gnu (descripcion) VALUES ('" + expediente + "')");


            }

            conexion.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateDB(){

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://tugal.com.ar:3306/tugal_gnu",
                    "tugal_franco","franco");

            if (conexion != null){
                System.out.println("conexion establecida");
            }else System.out.println("conexion fallida");


            // Preparamos la consulta
            PreparedStatement s = conexion.prepareStatement("UPDATE gnu SET ");


            conexion.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void muestraContenido(String urlArchivo, String[] exptes) throws IOException {

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

        for (String pos: array) {

            for (String pos2: exptes) {

                if (pos.contains(pos2)){

                    System.out.println(pos);
                }

            }

        }

        //System.out.println(textoSalidaYaFiltrado);
    }

    public static void crearArchivoFinal(Localidad localidad, String fecha) throws FileNotFoundException {


        for (String nombre : localidad.getNombresCaratulas()){

            String url = "./GNUsticia/" + localidad.getName() + "/" + nombre + fecha + ".txt";

            FileReader fr = new FileReader(url);
            BufferedReader bf = new BufferedReader(fr);


        }


    }
}