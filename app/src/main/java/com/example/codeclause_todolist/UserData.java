package com.example.codeclause_todolist;

import com.firebase.ui.auth.data.model.User;

public class UserData {
    private String todolistitems;

    public UserData(){

    }

    public String getTodolistitems() {
        return todolistitems;
    }

    public void setTodolistitems(String todolistitems) {
        this.todolistitems = todolistitems;
    }


}
