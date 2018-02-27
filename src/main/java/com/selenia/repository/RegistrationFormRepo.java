package com.selenia.repository;

import org.springframework.data.repository.CrudRepository;

import com.selenia.entities.RegistrationForm;

public interface RegistrationFormRepo extends CrudRepository<RegistrationForm, Long> {

}
