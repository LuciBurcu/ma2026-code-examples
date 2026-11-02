import SwiftUI

struct TodoListScreen: View {
    @State private var viewModel = TodoListViewModel()

    var body: some View {
        List(viewModel.todos) { todo in
            NavigationLink(value: todo.id) {
                TodoRow(todo: todo) {
                    viewModel.delete(todo)
                }
            }
        }
        .navigationTitle("My todos")
    }
}
