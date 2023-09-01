package com.mottakin.main.repository;

import com.mottakin.main.model.Birthday;

import java.util.List;
import java.util.Optional;

public interface IBirthdayRepository {
    Optional<Birthday> getById(Integer id);
    List<Birthday> getAll();
    void updateBirthday(Integer id, Birthday birthday);

    void add(Birthday birthday);
    void deleteBirthday(Integer id);

}
