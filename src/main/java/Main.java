import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by franco on 18/04/17.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Localidad resistencia = Localidad.resistencia();
        /*Localidad saenzP = Localidad.saenzP();
        Localidad villaAngela = Localidad.villaAngela();
        Localidad charata = Localidad.charata();*/

        //FunctionsLibrary.generarCarpetas();

        //FunctionsLibrary.descargarArchivo(resistencia);

        //FunctionsLibrary.connectionDB();

        //FunctionsLibrary.insertIntoDB(array);

        //FunctionsLibrary.selectFromDB();

        String[] exptesList = FunctionsLibrary.selectFromDB();

        for (String a : exptesList){
            System.out.println(a);
        }




        String fecha = "2017-04-21";

        for (String aux : resistencia.getNombresCaratulas()){

            String str = "./GNUsticia/" + resistencia.getName() + "/" + aux + fecha + ".txt";
            File archivo = new File(str);
            String urlArch = resistencia.getNombresCaratulas() + fecha + ".txt";

            if (archivo.exists()){

                FunctionsLibrary.muestraContenido(str, exptesList);

            }

        }





    }

}