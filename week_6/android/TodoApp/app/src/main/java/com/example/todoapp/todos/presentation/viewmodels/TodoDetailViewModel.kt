package com.example.todoapp.todos.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.todoapp.todos.data.models.Todo
import com.example.todoapp.todos.data.repository.InMemoryTodoRepository
import com.example.todoapp.todos.data.repository.TodoRepository

class TodoDetailViewModel(id: Int) : ViewModel() {
    private val repository: TodoRepository = InMemoryTodoRepository

    val todo: Todo? = repository.get(id)
}
