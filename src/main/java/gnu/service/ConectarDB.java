package gnu.service;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by franco on 28/04/17.
 */
public class ConectarDB {

    /*
    * metodo para obtener la lista de expedientes de los que se requiere informacion.
    los mismos se encuentran en una base de datos */
    public  static String[] listarExpedientesPropios(){

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

    //metodo para la carga de expedientes a la base de datos.
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

    //metodo para la actualizacion de los num de exp que estan en la base de datos
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

}
