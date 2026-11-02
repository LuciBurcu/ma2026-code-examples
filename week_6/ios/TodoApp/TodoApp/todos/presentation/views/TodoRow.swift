import SwiftUI

struct TodoRow: View {
    let todo: Todo
    let onDelete: () -> Void

    var body: some View {
        HStack {
            Text(todo.done ? "✅" : "⬜")
            Text(todo.title)
            Spacer()
            Button("🗑️", action: onDelete)
                .buttonStyle(.borderless)
        }
    }
}
