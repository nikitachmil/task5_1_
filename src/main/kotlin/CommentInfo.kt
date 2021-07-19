
data class CommentInfo(
    val count: Int,
    var canPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean,
) {
    fun update(post: WritingOnTheWall): Boolean {
        canPost = false

        return canPost
    }



}