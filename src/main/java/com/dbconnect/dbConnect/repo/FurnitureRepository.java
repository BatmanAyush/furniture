package com.dbconnect.dbConnect.repo;


import com.dbconnect.dbConnect.model.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FurnitureRepository extends JpaRepository<Furniture, Long> {}

