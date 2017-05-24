package gnu;

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

    @RequestMapping(value = "/listaexp", method = RequestMethod.GET)
    public Collection<String> getUsuario() throws IOException {


        return Expediente.ListaBuscados();
    }

}
