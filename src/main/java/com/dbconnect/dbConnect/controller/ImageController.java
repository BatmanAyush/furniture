package com.dbconnect.dbConnect.controller;
import com.dbconnect.dbConnect.model.Image;
import com.dbconnect.dbConnect.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/saveImg")
    public Image savingImage(@RequestBody Image img) {
        return imageService.saveImage(img);
    }
}

