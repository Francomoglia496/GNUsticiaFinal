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

//<<<<<<< HEAD
        //gnu.service.Expediente.generarCarpetas();
//=======
        //gnu.Expediente.generarCarpetas();
//>>>>>>> 799f745a2a2e690cc2cb76e3fa17aba8c005598b
//<<<<<<< HEAD

//=======
//>>>>>>> 781ce44c418aae29ff93f13cb69497562d3ae163
//<<<<<<< HEAD
        //gnu.service.Expediente.descargarArchivo(resistencia);

        //gnu.service.Expediente.connectionDB();

        //gnu.service.Expediente.insertIntoDB(array);

        //gnu.service.Expediente.selectFromDB();


        /*
        String[] exptesList = gnu.service.Expediente.selectFromDB();
=======
        //gnu.Expediente.descargarArchivo(resistencia);

        //gnu.Expediente.connectionDB();

        //gnu.Expediente.insertIntoDB(array);

        //gnu.Expediente.selectFromDB();


        /*
        String[] exptesList = gnu.Expediente.selectFromDB();
>>>>>>> 799f745a2a2e690cc2cb76e3fa17aba8c005598b

        for (String a : exptesList){
            System.out.println(a);
        }

        String fecha = "2017-04-21";

        for (String aux : resistencia.getNombresCaratulas()){

            String str = "./GNUsticia/" + resistencia.getName() + "/" + aux + fecha + ".txt";
            File archivo = new File(str);
            String urlArch = resistencia.getNombresCaratulas() + fecha + ".txt";

            if (archivo.exists()){

<<<<<<< HEAD
                gnu.service.Expediente.muestraContenido(str, exptesList);
=======
                gnu.Expediente.muestraContenido(str, exptesList);
>>>>>>> 799f745a2a2e690cc2cb76e3fa17aba8c005598b

            }

        }

        */

        SpringApplication.run(Main.class, args);
        System.out.println( "Hello World!" );


    }

}