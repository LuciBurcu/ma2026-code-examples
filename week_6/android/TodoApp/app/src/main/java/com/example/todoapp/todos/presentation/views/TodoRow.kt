package com.example.todoapp.todos.presentation.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.todoapp.todos.data.models.Todo

@Composable
fun TodoRow(
    todo: Todo,
    onClick: () -> Unit,
    onDelete: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = if (todo.done) "✅" else "⬜")
        Spacer(Modifier.width(12.dp))
        Text(text = todo.title)
        Spacer(Modifier.weight(1f))
        Text(
            text = "🗑️",
            modifier = Modifier.clickable(onClick = onDelete)
        )
    }
}
