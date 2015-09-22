package br.com.tcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author s2it_rmaximiano
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 8/26/15 10:36 AM
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/", method = { RequestMethod.POST, RequestMethod.GET })
    public String index() {
        return "index";
    }

}
