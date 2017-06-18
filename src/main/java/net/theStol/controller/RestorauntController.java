package net.theStol.controller;

import net.theStol.service.RestorauntService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Руслан on 17.06.2017.
 */

@Controller
@RequestMapping("/restoraunt")
public class RestorauntController {

    RestorauntService service = new RestorauntService();

    @RequestMapping(value = "/get",method = RequestMethod.GET)

    public @ResponseBody String getRestoraunt(ModelMap model) {
        return "Restarante";
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public @ResponseBody String getAll(ModelMap model){
        return service.printAll();
    }
}
