package Lesson_12.services;

import Lesson_12.models.User;

import java.util.List;

public interface UserService<T extends User>{
    void create(String fullName, Integer age, String phoneNumber, String groupTitle);
    List<T> getAll();
    List<T> getAllSortByFullName();
    List<T> getAllSortById();
    int remove(String fullName);

    List<T> getAllByTitile(String groupTitle);

    List<T> getAllByTitleandId(String groupTitle, Long Id);
}
