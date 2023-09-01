/*package com.mottakin.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BirthdayDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void createTable(){
        var query = "CREATE TABLE birthday_table(id serial PRIMARY KEY, name VARCHAR(255) NOT NULL, date_inserted VARCHAR(255))";
        int update = jdbcTemplate.update(query);
        System.out.println(update);
    }

}*/
