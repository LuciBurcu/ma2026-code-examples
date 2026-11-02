protocol TodoRepository {
    func getAll() -> [Todo]
    func get(id: Int) -> Todo?
    func delete(id: Int)
}
