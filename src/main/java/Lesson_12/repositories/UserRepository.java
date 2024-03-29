package Lesson_12.repositories;

import Lesson_12.models.User;

import java.util.List;

public interface UserRepository <T extends User> {
    void create(T user);

    List<T> getAll();

    int remove(String fullName);

    List<T> getAllByGroupTitle(String groupTitle);

    List<T> getAllByGroupTitleandID(String groupTitle,Long id);

}
