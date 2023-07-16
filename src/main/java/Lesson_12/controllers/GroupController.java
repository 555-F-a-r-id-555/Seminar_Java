package Lesson_12.controllers;

import Lesson_12.models.User;
import Lesson_12.services.GroupService;

import java.util.List;

public class GroupController {
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    public List<User> getAllUsersFromGroup(String groupTitle) {
        return groupService.getAllUsersFromGroup(groupTitle);
    }
    public List<User> getAllUsersFromGroupandId (String groupTitle, Long Id){
        return groupService.getAllUsersFromGroupandId(groupTitle, Id);
    }
}
