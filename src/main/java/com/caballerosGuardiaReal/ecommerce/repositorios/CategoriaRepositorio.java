
package com.caballerosGuardiaReal.ecommerce.repositorios;

import com.caballerosGuardiaReal.ecommerce.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, String>{
    
}
