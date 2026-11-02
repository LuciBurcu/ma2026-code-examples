import Observation

@Observable
class TodoDetailViewModel {
    private let repository: TodoRepository = InMemoryTodoRepository.shared
    let todo: Todo?

    init(id: Int) {
        todo = repository.get(id: id)
    }
}
