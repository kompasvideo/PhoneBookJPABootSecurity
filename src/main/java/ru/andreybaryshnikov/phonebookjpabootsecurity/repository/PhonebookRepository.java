package ru.andreybaryshnikov.phonebookjpabootsecurity.repository;

import org.springframework.data.repository.CrudRepository;
import ru.andreybaryshnikov.phonebookjpabootsecurity.models.PhoneBook;

public interface PhonebookRepository extends CrudRepository<PhoneBook, Integer> {
}
