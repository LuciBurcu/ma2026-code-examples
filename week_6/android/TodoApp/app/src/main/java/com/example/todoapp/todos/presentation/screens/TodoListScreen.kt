package com.example.todoapp.todos.presentation.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todoapp.todos.presentation.viewmodels.TodoListViewModel
import com.example.todoapp.todos.presentation.views.TodoRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoListScreen(
    onTodoClick: (Int) -> Unit,
    viewModel: TodoListViewModel = viewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "My todos") })
        }
    ) { padding ->
        LazyColumn(Modifier.padding(padding)) {
            items(viewModel.todos, key = { it.id }) { todo ->
                TodoRow(
                    todo = todo,
                    onClick = { onTodoClick(todo.id) },
                    onDelete = { viewModel.delete(todo) }
                )
                HorizontalDivider()
            }
        }
    }
}
