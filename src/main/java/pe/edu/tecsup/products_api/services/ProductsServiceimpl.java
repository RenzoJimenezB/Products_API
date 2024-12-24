package pe.edu.tecsup.products_api.services;

import pe.edu.tecsup.products_api.entities.Product;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.edu.tecsup.products_api.repositories.ProductsRepository;

import java.util.List;

@Slf4j
@Service
public class ProductsServiceimpl implements ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsServiceimpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Product> findAll() {
        return productsRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productsRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Product not found"));
    }

    @Override
    public void save(Product product) {
        productsRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productsRepository.deleteById(id);
    }
}
