package com.ex1.intellektaspringwebex1;

import java.util.Optional;

public class SalesJPARepositoryImplementation {
    private final SalesJPARepository salesJPARepository;

    public SalesJPARepositoryImplementation(SalesJPARepository salesJPARepository) {
        this.salesJPARepository = salesJPARepository;
    }

    public long count() {
        return salesJPARepository.count();
    }

    public SaleJPA findById(int id) {
        Optional<SaleJPA> saleJPA = salesJPARepository.findById(id);
        return saleJPA.orElseGet(SaleJPA::new);
    }


}
