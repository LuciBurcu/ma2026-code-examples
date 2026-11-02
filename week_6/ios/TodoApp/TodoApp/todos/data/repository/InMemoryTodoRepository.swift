class InMemoryTodoRepository: TodoRepository {
    static let shared = InMemoryTodoRepository()

    private var todos: [Todo] = [
        Todo(id: 1, title: "Buy milk", notes: "2 liters, the green one", done: false),
        Todo(id: 2, title: "Walk the dog", notes: "Before 8 pm", done: false),
        Todo(id: 3, title: "Call mom", notes: "Ask about Sunday lunch", done: true),
        Todo(id: 4, title: "Finish Lab 2", notes: "Due Sunday, 8 November", done: false),
        Todo(id: 5, title: "Read about ViewModels", notes: "developer.apple.com", done: true),
    ]

    func getAll() -> [Todo] {
        todos
    }

    func get(id: Int) -> Todo? {
        todos.first { $0.id == id }
    }

    func delete(id: Int) {
        todos.removeAll { $0.id == id }
    }
}
