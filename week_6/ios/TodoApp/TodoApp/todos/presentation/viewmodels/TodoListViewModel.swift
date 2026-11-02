import Observation

@Observable
class TodoListViewModel {
    private let repository: TodoRepository = InMemoryTodoRepository.shared
    private(set) var todos: [Todo] = []

    init() {
        todos = repository.getAll()
    }

    func delete(_ todo: Todo) {
        repository.delete(id: todo.id)
        todos = repository.getAll()
    }
}
