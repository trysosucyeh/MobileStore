MobileService.java   package com.mobile.store.service;

import com.mobile.store.model.Mobile;
import com.mobile.store.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileService {

    @Autowired
    private MobileRepository mobileRepository;

    public List<Mobile> getAllMobiles() {
        return mobileRepository.findAll();
    }
}
