package net.theStol.service;

import net.theStol.model.Restoraunt;
import net.theStol.persistence.RestorauntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Руслан on 18.06.2017.
 */

@Service
public class RestorauntService {

    @Autowired
    private RestorauntRepository repository;

    private static List<Restoraunt> restoraunts = new ArrayList<Restoraunt>();

    static {
        restoraunts.add(new Restoraunt(1L,"LCafe","shisha bar","Cafe for shisha love"));
       restoraunts.add(new Restoraunt(2L,"Rojo ojo","Mexico Bar","Best of the Best"));
      restoraunts.add(new Restoraunt(3L,"Mister Cat","Cafe for family","Bad cafe"));
        restoraunts.add(new Restoraunt(4L,"MacDonalds","fast food","Fast and good"));
    }

    @PostConstruct
    public void init(){
        repository.save(restoraunts);
    }

    public List<Restoraunt> findAll(){
        return repository.findAll();
    }
}
