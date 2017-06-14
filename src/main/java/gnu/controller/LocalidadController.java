package gnu.controller;

import gnu.service.Expediente;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Collection;

/**
 * Created by franco on 28/04/17.
 */

@RestController
public class LocalidadController {

    /*
    @RequestMapping(value = "/listaexp", method = RequestMethod.GET)
    public Collection<String> listaExpedientes() throws IOException {

        return Expediente.ListaBuscados();
    }
    */

    @RequestMapping(value = "/listaexp/{fecha}", method = RequestMethod.GET)
    public Collection<String> getCalendarioPorID(@PathVariable("fecha") String fecha) throws IOException {
        return Expediente.ListaBuscados(fecha) ;
    }


}
