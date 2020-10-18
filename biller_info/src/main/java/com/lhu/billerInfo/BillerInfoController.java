package com.lhu.billerInfo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billerInfo")
public class BillerInfoController {
	
	@RequestMapping("/biller")
    public BillerList getBillers() {	
		BillerList billerList = new BillerList();
		billerList.setBillerList(getBillerList());
        return billerList;
    }
	
	@RequestMapping("/biller/{billerId}")
    public Biller getBiller(@PathVariable("billerId") String billerId) {
		List<Biller> billerList = getBillerList();
		for (Biller bller : billerList) {
			if (bller.getBillerId().equalsIgnoreCase(billerId)) {
				return bller;
			}
		}
        return new Biller();
    }
	
	public List<Biller> getBillerList() {
		List<Biller> billerList = new ArrayList<>();
		billerList.add(new Biller("01","Biller One","C100"));
		billerList.add(new Biller("02","Biller Two","C101"));
		return billerList;
	}

}
