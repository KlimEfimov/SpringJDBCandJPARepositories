package com.ex1.intellektaspringwebex1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesJPARepository extends JpaRepository<SaleJPA, Integer> {

}
