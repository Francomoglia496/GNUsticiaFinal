package gnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Created by franco on 18/04/17.
 */

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws IOException {

        //gnu.Localidad resistencia = gnu.Localidad.resistencia();

        /*gnu.Localidad saenzP = gnu.Localidad.saenzP();
        gnu.Localidad villaAngela = gnu.Localidad.villaAngela();
        gnu.Localidad charata = gnu.Localidad.charata();*/

        //gnu.FunctionsLibrary.generarCarpetas();
//<<<<<<< HEAD

//=======
//>>>>>>> 781ce44c418aae29ff93f13cb69497562d3ae163
        //gnu.FunctionsLibrary.descargarArchivo(resistencia);

        //gnu.FunctionsLibrary.connectionDB();

        //gnu.FunctionsLibrary.insertIntoDB(array);

        //gnu.FunctionsLibrary.selectFromDB();


        /*
        String[] exptesList = gnu.FunctionsLibrary.selectFromDB();

        for (String a : exptesList){
            System.out.println(a);
        }

        String fecha = "2017-04-21";

        for (String aux : resistencia.getNombresCaratulas()){

            String str = "./GNUsticia/" + resistencia.getName() + "/" + aux + fecha + ".txt";
            File archivo = new File(str);
            String urlArch = resistencia.getNombresCaratulas() + fecha + ".txt";

            if (archivo.exists()){

                gnu.FunctionsLibrary.muestraContenido(str, exptesList);

            }

        }

        */

        SpringApplication.run(Main.class, args);
        System.out.println( "Hello World!" );


    }

}