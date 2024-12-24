package pe.edu.tecsup.products_api.repositories;

import pe.edu.tecsup.products_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Long> {
//    @Override
//    List<Product> findAll();
}
