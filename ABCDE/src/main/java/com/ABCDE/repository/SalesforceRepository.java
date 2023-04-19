package com.ABCDE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SalesforceRepository extends JpaRepository<Opportunity, Long> {

    @Query(value = "SELECT * FROM Opportunity WHERE status = 'open'", nativeQuery = true)
    List<Opportunity> findAllOpenOpportunities();

    List<Opportunity> findByOwnerName(String name);
    
    List<Opportunity> findByStage(String stage);
    
    List<Opportunity> findByAmount(int amount);
    
    List<Opportunity> findByClosingDate(String date);
    
    List<Opportunity> findByOwnerNameAndStage(String name, String stage);
    
    List<Opportunity> findByOwnerNameAndAmount(String name, int amount);
    
    List<Opportunity> findByOwnerNameAndClosingDate(String name, String date);
    
    List<Opportunity> findByStageAndAmount(String stage, int amount);
    
    List<Opportunity> findByStageAndClosingDate(String stage, String date);
    
    List<Opportunity> findByAmountAndClosingDate(int amount, String date);
    
    List<Opportunity> findByOwnerNameAndStageAndAmount(String name, String stage, int amount);
    
    List<Opportunity> findByOwnerNameAndStageAndClosingDate(String name, String stage, String date);
    
    List<Opportunity> findByOwnerNameAndAmountAndClosingDate(String name, int amount, String date);
    
    List<Opportunity> findByStageAndAmountAndClosingDate(String stage, int amount, String date);
    
    List<Opportunity> findByOwnerNameAndStageAndAmountAndClosingDate(String name, String stage, int amount, String date);
   
}