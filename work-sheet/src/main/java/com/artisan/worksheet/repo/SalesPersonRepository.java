package com.artisan.worksheet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artisan.worksheet.entity.SalesPerson;


@Repository
public interface SalesPersonRepository extends JpaRepository<SalesPerson, Integer> {

}
