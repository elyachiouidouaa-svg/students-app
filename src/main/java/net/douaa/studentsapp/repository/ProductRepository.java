package net.douaa.studentsapp.repository;

import net.douaa.studentsapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
