package com.ex1.intellektaspringwebex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SalesRepository {
    private final JdbcTemplate jdbcTemplate;

    private RowMapper<Sale> saleRowMapper = (r, i) -> {
        Sale rowObject = new Sale();
        rowObject.setId(r.getInt(1));
        rowObject.setProduct_id(r.getString(2));
        rowObject.setStore_date(r.getDate(3));
        rowObject.setSales_date(r.getDate(4));
        rowObject.setPrice(r.getFloat(5));
        return rowObject;
    };

    @Autowired
    public SalesRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int count() {
        return jdbcTemplate.queryForObject("select count(*) from sales", Integer.class);
    }

    public List<Sale> findAllSales() {
        String sqlQuery = "SELECT * FROM sales";
        return jdbcTemplate.query(sqlQuery, saleRowMapper);
    }

    public Sale findDistinctSale(int rowID) {
        if (rowID < 1 || rowID > count()) {
            System.out.println("Wrong ID");
            return new Sale();
        } else {
            String sqlQuery = "SELECT * FROM sales WHERE id=" + rowID;
            List<Sale> sales = jdbcTemplate.query(sqlQuery, saleRowMapper);
            return sales.get(0);
        }
    }
}
