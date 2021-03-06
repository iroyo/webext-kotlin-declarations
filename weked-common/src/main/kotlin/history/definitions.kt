package history

external interface UrlProvider {
    var url: String
}

external interface RangeProvider {
    var startTime: Any
    var endTime: Any
}

external interface SearchQuery {
    var text: String
    var maxResults: Int
}

external interface SearchOptions: SearchQuery, RangeProvider

external interface TitleChange {
    val id: String
    val title: String
}

external interface VisitRemove {
    val allHistory: Boolean
    val urls: Array<String>
}

external interface HistoryItem {
    val id: String
    val url: String?
    val title: String?
    val visitCount: Int?
    val typedCount: Int?
    val lastVisitTime: Float?
}

external interface VisitedItem {
    val id: String
    val visitedId: String
    val visitTime: Float?
    val referringVisitId: String
    val transition: String
}

external interface UrlOptions {
    var url: String
    var title: String?
    var transition: String?
    var visitTime: Any?
}