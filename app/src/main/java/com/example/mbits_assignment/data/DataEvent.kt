package com.example.mbits_assignment

sealed interface DataEvent {
    object SortNotes: DataEvent

//    data class DeleteNote(val note: Data): NotesEvent
    data class SaveNote(
        val title: String?,
        val description: String?
    ): DataEvent
}
