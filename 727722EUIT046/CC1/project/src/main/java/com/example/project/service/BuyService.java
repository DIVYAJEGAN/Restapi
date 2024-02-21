package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.model.Buy;
import com.example.project.repository.BuyRepo;

@Service
public class BuyService {
    @Autowired
    BuyRepo buyRepo;

    public Buy addbuy(Buy buy)
    {
        return buyRepo.save(buy);
    }
    public List<Buy> getbuy()
    {
        return buyRepo.findAll();
    }
    public List<Buy> getBuysByName(String name) {
        return buyRepo.findByName(name);
    }
    
    public Buy putbuy(Long plotno,Buy buy)
	{
		Buy buyAvail=buyRepo.findById(plotno).orElse(null);
		if(buyAvail!=null)
        {           
            buyAvail.setName(buy.getName());
            buyAvail.setLocation(buy.getLocation());
            buyAvail.setCategory(buy.getCategory());
            buyAvail.setPrice(buy.getPrice());
            buyAvail.setBedrooms(buy.getBedrooms());
            buyAvail.setBathrooms(buy.getBathrooms());
            
            return buyRepo.saveAndFlush(buyAvail);
        }
        else
        return null;
	}
    public String deletebuy(Long plotno)
    {
        buyRepo.deleteById(plotno);
        return("buydeleted");
    }
}
