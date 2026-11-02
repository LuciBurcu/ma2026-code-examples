package com.example.todoapp.todos.presentation.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.todoapp.todos.data.models.Todo
import com.example.todoapp.todos.data.repository.InMemoryTodoRepository
import com.example.todoapp.todos.data.repository.TodoRepository

class TodoListViewModel : ViewModel() {
    private val repository: TodoRepository = InMemoryTodoRepository

    var todos by mutableStateOf(repository.getAll())
        private set

    fun delete(todo: Todo) {
        repository.delete(todo.id)
        todos = repository.getAll()
    }
}
