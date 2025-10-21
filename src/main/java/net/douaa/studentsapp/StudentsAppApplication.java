package net.douaa.studentsapp;

import net.douaa.studentsapp.entities.Product;
import net.douaa.studentsapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentsAppApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product (null,"computer",4300,3));
        productRepository.save(new Product (null,"Printer",1200,4));
        productRepository.save(new Product (null,"Smart Phone",3200,32));
        productRepository.findAll();
        List<Product> products = productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
        });
        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("**********");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getQuantity());
        System.out.println("**********");
        System.out.println("---------------------");
        productRepository.findByNameContains("c");
        List<Product> productsList = productRepository.findByNameContains("c");
        productsList.forEach(p->{
            System.out.println(p);
        });
        System.out.println("---------------------");
        List<Product> productsList2 = productRepository.search("%c%");
        productsList2.forEach(p->{
            System.out.println(p);
        });
        System.out.println("---------------------");
        List<Product> productsList3 = productRepository.searchByPrice(3000);
        productsList3.forEach(p->{
            System.out.println(p);
        });

    }


    public static void main(String[] args) {
        SpringApplication.run(StudentsAppApplication.class, args);
    }


}
