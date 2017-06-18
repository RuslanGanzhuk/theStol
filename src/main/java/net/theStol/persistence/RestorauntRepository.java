package net.theStol.persistence;

import net.theStol.model.Restoraunt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Руслан on 19.06.2017.
 */

@Repository
public interface RestorauntRepository extends MongoRepository<Restoraunt,Long>{


}
