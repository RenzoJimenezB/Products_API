package pe.edu.tecsup.products_api.services;

import pe.edu.tecsup.products_api.entities.Product;

import java.util.List;

public interface ProductsService {

    List<Product> findAll();

    Product findById(Long id);

    void save(Product product);

    void deleteById(Long id);
}
