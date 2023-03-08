
package com.Cinelitas.Cinelitas.Repository;

import com.Cinelitas.Cinelitas.Entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tannyagranados
 */

@Repository

public interface PeliculaRepository extends CrudRepository<Pelicula,Integer> {
    
}
