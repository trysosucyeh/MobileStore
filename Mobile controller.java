MobileController.java                     package com.mobile.store.controller;

import com.mobile.store.model.Mobile;
import com.mobile.store.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular to connect
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @GetMapping("/mobiles")
    public List<Mobile> getMobiles() {
        return mobileService.getAllMobiles();
    }
}
