package Lesson_12.repositories;

import Lesson_12.models.Teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherRepository  implements UserRepository<Teacher>{
    private final List<Teacher> teachers;

    public TeacherRepository() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public void create(Teacher teacher) {
        teacher.setId(getMaxId() + 1);
        teachers.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public int remove(String fullName) {
        int removeCount = 0;

        Iterator<Teacher> iterator = teachers.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getFullName().equals(fullName)) {
                iterator.remove();
                removeCount++;
            }
        }
        return removeCount;
    }

    @Override
    public List<Teacher> getAllByGroupTitle(String groupTitle) {
        return teachers.stream()
                .filter(teacher -> teacher.getGroupTitle().equals(groupTitle))
                .collect(Collectors.toList());
    }

    @Override
    public List<Teacher> getAllByGroupTitleandID(String groupTitle, Long id) {
        return getAll()
                .stream()
                .filter(user -> user.getGroupTitle().equals(groupTitle) && user.getId().equals(id))
                .collect(Collectors.toList());
    }


    private Long getMaxId() {
        Long maxId = 0L;
        for (Teacher teacher : teachers) {
            if (teacher.getId() > maxId) {
                maxId = teacher.getId();
            }
        }
        return maxId;
    }
}
