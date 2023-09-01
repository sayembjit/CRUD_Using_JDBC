package com.mottakin.main.controller;

import com.mottakin.main.model.Birthday;
import com.mottakin.main.repository.IBirthdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BirthdayController {
    @Autowired
    private IBirthdayRepository iBirthdayRepository;

    @GetMapping("/birthday/all")
    public ResponseEntity<List<Birthday>> getAllBirthday() {
        List<Birthday> birthdayList = iBirthdayRepository.getAll();
        return new ResponseEntity<>(birthdayList, HttpStatus.OK);
    }

    @GetMapping("/birthday/{id}")
    public ResponseEntity<Birthday> getCandidateById(@PathVariable Integer id) {
        Birthday birthday = iBirthdayRepository.getById(id).get();
        return new ResponseEntity<>(birthday, HttpStatus.OK);
    }

    @PostMapping("/birthday")
    public ResponseEntity<Void> addCandidate(@RequestBody Birthday birthday) {
        iBirthdayRepository.add(birthday);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    @DeleteMapping("/birthday/{id}")
    public ResponseEntity<Birthday> deleteBirthday(@PathVariable Integer id) {
        iBirthdayRepository.deleteBirthday(id);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    @PutMapping("/birthday/{id}")
    public ResponseEntity<Birthday> updateBirthday(@PathVariable Integer id, @RequestBody Birthday birthday) {
        iBirthdayRepository.updateBirthday(id, birthday);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
