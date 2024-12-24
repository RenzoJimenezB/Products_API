package pe.edu.tecsup.products_api.webs;

import org.springframework.web.bind.annotation.RestController;
import pe.edu.tecsup.products_api.entities.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.tecsup.products_api.services.ProductsService;

import java.util.List;

@Slf4j
@RestController
public class ProductsController {

    @Value("${app.storage.path}")
    private String storagePath;

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/products")
    public List<Product> products() {
        log.info("Getting all products");

        return productsService.findAll();
    }
}
