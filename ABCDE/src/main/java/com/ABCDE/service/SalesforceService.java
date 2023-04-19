package com.ABCDE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ABCDE.repository.SalesforceRepository;
import com.ABCDE.model.Opportunity;

@Service
public class SalesforceService {
    
    @Autowired
    private SalesforceRepository salesforceRepository;
    
    public List<Opportunity> findAllOpenOpportunities() {
        return salesforceRepository.findAllOpenOpportunities();
    }
    
    public List<Opportunity> findByOwnerName(String name) {
        return salesforceRepository.findByOwnerName(name);
    }
    
    public List<Opportunity> findByStage(String stage) {
        return salesforceRepository.findByStage(stage);
    }
    
    public List<Opportunity> findByAmount(int amount) {
        return salesforceRepository.findByAmount(amount);
    }
    
    public List<Opportunity> findByClosingDate(String date) {
        return salesforceRepository.findByClosingDate(date);
    }
    
    public List<Opportunity> findByOwnerNameAndStage(String name, String stage) {
        return salesforceRepository.findByOwnerNameAndStage(name, stage);
    }
    
    public List<Opportunity> findByOwnerNameAndAmount(String name, int amount) {
        return salesforceRepository.findByOwnerNameAndAmount(name, amount);
    }
    
    public List<Opportunity> findByOwnerNameAndClosingDate(String name, String date) {
        return salesforceRepository.findByOwnerNameAndClosingDate(name, date);
    }
    
    public List<Opportunity> findByStageAndAmount(String stage, int amount) {
        return salesforceRepository.findByStageAndAmount(stage, amount);
    }
    
    public List<Opportunity> findByStageAndClosingDate(String stage, String date) {
        return salesforceRepository.findByStageAndClosingDate(stage, date);
    }
    
    public List<Opportunity> findByAmountAndClosingDate(int amount, String date) {
        return salesforceRepository.findByAmountAndClosingDate(amount, date);
    }
    
    public List<Opportunity> findByOwnerNameAndStageAndAmount(String name, String stage, int amount) {
        return salesforceRepository.findByOwnerNameAndStageAndAmount(name, stage, amount);
    }
    
    public List<Opportunity> findByOwnerNameAndStageAndClosingDate(String name, String stage, String date) {
        return salesforceRepository.findByOwnerNameAndStageAndClosingDate(name, stage, date);
    }
    
    public List<Opportunity> findByOwnerNameAndAmountAndClosingDate(String name, int amount, String date) {
        return salesforceRepository.findByOwnerNameAndAmountAndClosingDate(name, amount, date);
    }
    
    public List<Opportunity> findByStageAndAmountAndClosingDate(String stage, int amount, String date) {
        return salesforceRepository.findByStageAndAmountAndClosingDate(stage, amount, date);
    }
    
    public List<Opportunity> findByOwnerNameAndStageAndAmountAndClosingDate(String name, String stage, int amount, String date) {
        return salesforceRepository.findByOwnerNameAndStageAndAmountAndClosingDate(name, stage, amount, date);
    }
}