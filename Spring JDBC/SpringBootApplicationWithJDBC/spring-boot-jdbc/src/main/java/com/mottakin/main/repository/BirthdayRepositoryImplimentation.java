package com.mottakin.main.repository;

import com.mottakin.main.model.Birthday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BirthdayRepositoryImplimentation implements IBirthdayRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Optional<Birthday> getById(Integer id) {
        String query = "select * from birthday_table where id = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{id}, (resultSet, rowNum) ->
                Optional.of(
                        new Birthday(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getString("date_inserted")
                        )
                )
        );
    }

    @Override
    public List<Birthday> getAll() {
        String query = "select * from birthday_table";
        return jdbcTemplate
                .query(query, (resultSet, rowNum) ->
                        new Birthday(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getString("date_inserted")
                        )
                );
    }
    @Override
    public void deleteBirthday(Integer id) {
        String query = "delete from birthday_table where id = ?";
        jdbcTemplate.update(query, id);
    }

    @Override
    public void updateBirthday(Integer id, Birthday birthday) {
        String sql = "UPDATE birthday_table SET name = ?, date_inserted = ? WHERE id = ?";
        jdbcTemplate.update(sql, birthday.getName(),birthday.getDate_inserted(),id);

    }

    @Override
    public void add(Birthday birthday) {
        String query = "insert into birthday_table (id, name, date_inserted) values (?, ?, ?)";
        jdbcTemplate.update(query, birthday.getId(), birthday.getName(), birthday.getDate_inserted());

    }

}
