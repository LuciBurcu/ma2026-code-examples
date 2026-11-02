package com.example.todoapp.todos.data.repository

import com.example.todoapp.todos.data.models.Todo

interface TodoRepository {
    fun getAll(): List<Todo>
    fun get(id: Int): Todo?
    fun delete(id: Int)
}
