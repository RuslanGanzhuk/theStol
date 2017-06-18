package net.theStol.service;

import net.theStol.model.Restoraunt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Руслан on 18.06.2017.
 */

@Service
public class RestorauntService {

    private static List<Restoraunt> restoraunts = new ArrayList<Restoraunt>();

    static {
        restoraunts.add(new Restoraunt(1L,"LCafe","shisha bar","Приятное заведение для компаний"));
        restoraunts.add(new Restoraunt(2L,"Rojo ojo","Mexico Bar","tt"));
        restoraunts.add(new Restoraunt(3L,"Mister Cat","Cafe for family","pppoj"));
        restoraunts.add(new Restoraunt(4L,"MacDonalds","fast food","kikik"));
    }


    public String printAll () {

       return "List of restoraunts :" + restoraunts + "\n first restaurant - " + restoraunts.get(1).toString();
    }
}
