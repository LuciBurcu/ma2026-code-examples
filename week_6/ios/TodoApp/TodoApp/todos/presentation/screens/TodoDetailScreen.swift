import SwiftUI

struct TodoDetailScreen: View {
    @State var viewModel: TodoDetailViewModel

    var body: some View {
        let todo = viewModel.todo
        if let todo = viewModel.todo {
            VStack(alignment: .leading, spacing: 12) {
                Text(todo.notes)
                Text(todo.done ? "Done" : "Not done")
                    .bold()
                Spacer()
            }
            .frame(maxWidth: .infinity, alignment: .leading)
            .padding()
            .navigationTitle(todo.title)
        } else {
            Text("This todo doesn't exist anymore.")
        }
    }
}
