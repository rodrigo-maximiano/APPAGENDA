package br.com.tcc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tcc.service.ClienteService;

/**
 * @author s2it_rmaximiano
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 8/26/15 10:36 AM
 */
@Controller
@EnableWebMvcSecurity
public class ContatoController {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "/contato", method = { RequestMethod.POST, RequestMethod.GET })
    public String contato(HttpServletRequest request) {

        if (request.getMethod() == "POST") {
            String nome = request.getParameter("name");
            clienteService.save(nome);
            request.setAttribute("nome", "Rodrigo Teste");
        }
        return "/views/contato";
    }

}
