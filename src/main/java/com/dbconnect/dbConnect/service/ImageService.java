package com.dbconnect.dbConnect.service;

import com.dbconnect.dbConnect.model.Image;
import com.dbconnect.dbConnect.repo.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    private ImageRepo imageRepo;
    public Image saveImage(Image img) {
       return imageRepo.save(img);
    }
}

