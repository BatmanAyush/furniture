package com.dbconnect.dbConnect.repo;

import com.dbconnect.dbConnect.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends JpaRepository<Image,Integer> {

}
