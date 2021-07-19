
data class Page (
    val id: Int,
    val groupId: Int,
    val creatorId: Int,
    val title: String,
    val currenlUserCanEdit: Boolean,
    val currenlUserCanEditAcces: Boolean,
    val whoCanView: Int,
    val whoCanEdit: Int,
    val edited: Int,
    val created: Int,
    val editorId: Int,
    val views: Int,
    val parent: String,
    val parent2: String,
    val source: String,
    val html: String,
    val viewUrl: String



        )