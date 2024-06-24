package com.sesami.sesamiscdmintegration.bank.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sesami.sesamiscdmintegration.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Long>{

}
