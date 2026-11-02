package com.example.todoapp.todos.data.repository

import com.example.todoapp.todos.data.models.Todo

object InMemoryTodoRepository : TodoRepository {
    private val todos = mutableListOf(
        Todo(1, "Buy milk", "2 liters, the green one", false),
        Todo(2, "Walk the dog", "Before 8 pm", false),
        Todo(3, "Call mom", "Ask about Sunday lunch", true),
        Todo(4, "Finish Lab 2", "Due Sunday, 8 November", false),
        Todo(5, "Read about ViewModels", "developer.android.com", true)
    )

    override fun getAll() = todos.toList()

    override fun get(id: Int) = todos.find { it.id == id }

    override fun delete(id: Int) {
        todos.removeAll { it.id == id }
    }
}
