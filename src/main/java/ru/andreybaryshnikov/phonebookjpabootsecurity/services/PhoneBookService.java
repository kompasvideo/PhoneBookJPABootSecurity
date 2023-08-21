package ru.andreybaryshnikov.phonebookjpabootsecurity.services;

import ru.andreybaryshnikov.phonebookjpabootsecurity.models.PhoneBook;

public interface PhoneBookService {
    PhoneBook getPhoneBook(int id);
    Iterable<PhoneBook> getPhoneBooks();
    void editRecordToPhoneBooks(PhoneBook newPhoneBook);
    void deleteRecordToPhoneBooks(int id);
    PhoneBook getNewPhoneBook();
    void addRecordToPhoneBooks(PhoneBook newPhoneBook);
}
