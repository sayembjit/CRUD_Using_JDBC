package com.mottakin.main.service;

import com.mottakin.main.exception.BirthdayNotFoundException;
import com.mottakin.main.model.Birthday;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BirthdayService {

  /*  private JdbcTemplate jdbcTemplate;
    public String getBirthdatById(int id) throws BirthdayNotFoundException {
        try {
            String name = null;
            return name.toUpperCase();
        } catch (NullPointerException e) {
            throw new CustomNullPointerException();
        }
    }
    public Birthday getBirthdayById(int id) {
        String sql = "SELECT * FROM birthday_table WHERE id = ?";
        List<Birthday> birthdays = jdbcTemplate.query(sql, new Object[]{id}, new BirthdayRowMapper());

        if (birthdays.isEmpty()) {
            throw new NotFoundException("Birthday with id " + id + " not found");
        }

        return birthdays.get(0);
    }*/
}
