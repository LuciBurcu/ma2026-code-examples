import SwiftUI

struct AppNavigation: View {
    var body: some View {
        NavigationStack {
            TodoListScreen()
                .navigationDestination(for: Int.self) { id in
                    TodoDetailScreen(
                        viewModel: TodoDetailViewModel(id: id)
                    )
                }
        }
    }
}
