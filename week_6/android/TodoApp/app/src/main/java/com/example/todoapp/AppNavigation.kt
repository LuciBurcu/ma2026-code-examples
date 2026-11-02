package com.example.todoapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.todoapp.todos.presentation.screens.TodoDetailScreen
import com.example.todoapp.todos.presentation.screens.TodoListScreen
import kotlinx.serialization.Serializable

@Serializable
object TodoList

@Serializable
data class TodoDetail(val id: Int)

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = TodoList) {
        composable<TodoList> {
            TodoListScreen(onTodoClick = { id ->
                navController.navigate(TodoDetail(id))
            })
        }
        composable<TodoDetail> { entry ->
            TodoDetailScreen(
                id = entry.toRoute<TodoDetail>().id,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
