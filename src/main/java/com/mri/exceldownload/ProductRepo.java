package com.mri.exceldownload;

import com.mri.exceldownload.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Products, Long> {
}
