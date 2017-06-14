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

        //gnu.service.Localidad resistencia = gnu.service.Localidad.resistencia();

        /*gnu.service.Localidad saenzP = gnu.service.Localidad.saenzP();
        gnu.service.Localidad villaAngela = gnu.service.Localidad.villaAngela();
        gnu.service.Localidad charata = gnu.service.Localidad.charata();*/

        //gnu.service.Expediente.generarCarpetas();
//<<<<<<< HEAD

//=======
//>>>>>>> 781ce44c418aae29ff93f13cb69497562d3ae163
        //gnu.service.Expediente.descargarArchivo(resistencia);

        //gnu.service.Expediente.connectionDB();

        //gnu.service.Expediente.insertIntoDB(array);

        //gnu.service.Expediente.selectFromDB();


        /*
        String[] exptesList = gnu.service.Expediente.selectFromDB();

        for (String a : exptesList){
            System.out.println(a);
        }

        String fecha = "2017-04-21";

        for (String aux : resistencia.getNombresCaratulas()){

            String str = "./GNUsticia/" + resistencia.getName() + "/" + aux + fecha + ".txt";
            File archivo = new File(str);
            String urlArch = resistencia.getNombresCaratulas() + fecha + ".txt";

            if (archivo.exists()){

                gnu.service.Expediente.muestraContenido(str, exptesList);

            }

        }

        */

        SpringApplication.run(Main.class, args);
        System.out.println( "Hello World!" );


    }

}