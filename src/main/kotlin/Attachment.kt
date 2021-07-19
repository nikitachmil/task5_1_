abstract class Attachment {


    abstract val type: String


}

class VideoAttachment(override val type: String, val video: Video) : Attachment() {
    val id = video.id
    val ownerId = video.ownerId
    val title = video.title
    val description = video.description
    val photo130 = video.photo130
    val photo320 = video.photo320
    val photo640 = video.photo640
    val photo800 = video.photo800
    val photo1280 = video.photo1280
    val firstFrame130 = video.firstFrame130
    val firstName320 = video.firstName320
    val firstFrame640 = video.firstFrame640
    val firstFrame800 = video.firstFrame800
    val firstFrame1280 = video.firstFrame1280
    var date = video.date
    val addingDate = video.addingDate
    val views = video.views
    val comments = video.comments
    val payer = video.payer
    val platform = video.platform
    val canEdit = video.canEdit
    val isPrivate = video.isPrivate
    val accessKty = video.accessKty
    val processing = video.processing
    val live = video.live
    val upcoming = video.upcoming
    val isFavorite = video.isFavorite

    var result = if (video is Video) {

        println("true")
    } else {
        println("false")
    }


}

class PhotoAttachment(override val type: String, val photo: Photo) : Attachment() {
    val id = photo.id
    val albumId = photo.albumId
    val ownerId = photo.ownerId
    val userId = photo.userId
    val text = photo.text
    val date = photo.date
    val sizes = photo.sizes
    val width = photo.width
    val height = photo.height


    var result = if (photo is Photo) {
        print(id)
    } else {
        println("false")
    }


}

class AudoiAttachment(override val type: String, val audio: Audio) : Attachment() {
    val id = audio.id
    val ownerId = audio.ownerId
    val artist = audio.artist
    val title = audio.title
    val duration = audio.title
    val url = audio.url
    val lyrlcsId = audio.lyrlcsId
    val albumId = audio.albumId
    val genreId = audio.genreId
    val date = audio.date
    val noSearch = audio.noSearch
    val isHq = audio.isHq


    var result = if (audio is Audio) {
        println("true")

        var genre: String

        when (genreId) {
            1 -> genre = "Rock"
            2 -> genre = "Pop"
            3 -> genre = "Rap & Hip-Hop"
            4 -> genre = "Easy Listening"
            5 -> genre = "House & Dance"
            6 -> genre = "Instrumental"
            7 -> genre = "Metal"
            21 -> genre = "Alternative"
            8 -> genre = "Dubstep"
            1001 -> genre = "Jazz & Blues"
            10 -> genre = "Drum & Bass"
            11 -> genre = "Trance"
            12 -> genre = "Chanson"
            13 -> genre = "Ethnic"
            14 -> genre = "Acoustic & Vocal"
            15 -> genre = "Reggae"
            16 -> genre = "Classical"
            17 -> genre = "Indie Pop"
            19 -> genre = "Speech"
            22 -> genre = "Electropop & Disco"
            18 -> genre = "Other"


            else -> "Неправильное число"
        }


    } else {
        println("false")
    }


}

class DocumentsAttachment(override val type: String, val document: Document) : Attachment() {
    val id = document.id
    val ownerId = document.ownerId
    val title = document.title
    val size = document.size
    val ext = document.ext
    val url = document.url
    val date = document.date
    val documentType = document.type
    val preview = document.preview


    var result = if (document is Document) {

        var type: String
        when (documentType) {
            1 -> type = "текстовые документы"
            2 -> type = "архивы"
            3 -> type = "gif"
            4 -> type = "изображения"
            5 -> type = "аудио"
            6 -> type = "видео"
            7 -> type = "электронные книги"
            8 -> type = "неизвестно"
            else -> "Неизвестный тип"
        }
        println("true")
    } else {
        println("false")
    }


}

class StickerAttachment(override val type: String, val sticker: Sticker) : Attachment() {
    val productId = sticker.productId
    val stickerId = sticker.stickerId
    val images = sticker.images
    val imagesWithBackground = sticker.imagesWithBackground


    var result = if (sticker is Sticker) {

        println("true")
    } else {
        println("false")
    }


}






