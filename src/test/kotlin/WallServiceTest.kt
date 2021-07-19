import WallService.add
import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test

    fun add() {
        val Post = WritingOnTheWall(
            id = 1,

            ownerId = 2,
            fromId = 3,
            date = 200,
            text = "text",
            replyOwnerId = 1,
            replyPostId = 2,
            friendOnly = false,
            commentInfo = CommentInfo(count = 200, canPost = true, canClose = true, canOpen = false),
            copyright = Copyright(id = 1, link = "face", name = "friend", type = "Chandler"),
            like = LikeInformation(count = 200, userLikes = true, canLike = true, canPublish = true),
            repost = Repost(count = 4, userReposted = false),
            view = Views(count = 800),
            postType = "ross",
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = true,
            isFavorite = true,
            donut = Donute(
                isDonute = true,
                paidDuration = 2,
                placeholder = Placeholder(donut = true),
                canPublishFreeCopy = true,
                editMode = "Yes"
            ),
            postponedId = 1,
            audio = Audio(
                id = 1,
                ownerId = 2,
                date = 200,
                artist = "2Pac",
                title = "2",
                duration = 1,
                url = "URL",
                lyrlcsId = 1,
                albumId = 2,
                genreId = 1,
                noSearch = true,
                isHq = false
            ),
            document = Document(
                id = 1,
                ownerId = 2,
                title = "title",
                size = 1,
                ext = "ext",
                url = "URL",
                date = 1,
                type = 2,
                preview = Preview(
                    photo = Photo(
                        id = 1,
                        albumId = 2,
                        ownerId = 3,
                        userId = 4,
                        text = "yes",
                        date = 1,
                        sizes = Size(type = "yes", url = "URL", width = 1, height = 2),
                        width = 2,
                        height = 2
                    ),
                    graffiti = Graffiti(
                        src = "yes", width = 1, height = 2,
                    ),

                    audioMessage = AudioMessage(duration = 1, waveform = null, linkOgg = "URL", linkMp3 = "LINK")


                )
            ),
            link = Link(
                url = "st", title = "title", caption = "1", descriptiom = "2", photo = Photo(

                    id = 1, albumId = 1, ownerId = 2, userId = 3, text = "tx", date = 1, sizes = Size(
                        type = "1", url = "2", width = 1, height = 2,
                    ), width = 1, height = 2
                ),   previewPage = "1", previewUrl = "2"
            ),
            note = Note(
                id = 1, ownerId = 2, title = 3, text = "tx", date = 1, comments = 2, readComments = 3,
                viewUrl = "url"
            ),
            page = Page(
                id = 1,
                groupId = 2,
                creatorId = 3,
                title = "tl",
                currenlUserCanEdit = true,
                currenlUserCanEditAcces = false,
                whoCanView = 3,
                whoCanEdit = 3,
                edited = 1,
                created = 2,
                editorId = 3,
                views = 5,
                parent = "rs",
                parent2 = "ch",
                source = "source",
                html = "html",

                viewUrl = "vies_url"
            ),
            poll = Poll(
                id = 1,
                ownerId = 2,
                created = 3,
                question = "st",
                votes = 5,
                answers = null,
                anonymous = false,
                multiple = true,
                answerIds = null,
                endDate = 1,
                closed = true,
                isBoard = true,
                canEdit = false,
                canVote = false,
                canReport = true,
                canShare = false,
                authorId = 1,
                photo = Photo(
                    id = 1, albumId = 1, ownerId = 2, userId = 3, text = "tx", date = 1, sizes = Size(
                        type = "t",
                        url = "St",
                        width = 1,
                        height = 2,
                    ), width = 1, height = 2
                ),
                background = Background.Gradient(1,2,null),
            ),
            post = Post(
                id = 1,

                ownerId = 2,
                fromId = 3,
                createdBy = 4,
                date = 5,
                text = "tx",
                replyOwnerId = 1,
                replyPostId = 2,
                friendOnly = true,
                commentInfo = CommentInfo(count = 1, canPost = true, canClose = true, canOpen = true),
                copyright = "1",
                like = LikeInformation(
                    count = 1,
                    userLikes = true, canLike = true, canPublish = false
                ),
                repost = Repost(count = 1, userReposted = true),
                views = Views(count = 1),
                postType = "1",
                postSource = PostSource(type = "s", platform = "s", date = "2", url = "irl"),
                attachments = null,
                geo = Geo(
                    type = "st",
                    coordinates = "st",
                ),

                signerId = 1,
                copyHistory = null,
                canPln = true,
                canDelete = false,
                canEdit = true,
                isPinned = false,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 1
            ),
            postSource = PostSource(type = "f", platform = "2", date = "2", url = "2"),

            sticker = Sticker(
                productId = 1,
                stickerId = 2,
                null,
                null
            ),


            video = Video(
                id = 1,
                ownerId = 2,
                title = "tl",
                description = "2",
                photo130 = "2",
                photo320 = "3",
                photo640 = "4",
                photo800 = "6",
                photo1280 = "2",
                firstFrame130 = "5",
                firstName320 = "3",
                firstFrame640 = "5",
                firstFrame800 = "8",
                firstFrame1280 = "0",
                date = 1,
                addingDate = 2,
                views = 1,
                comments = 2,
                payer = "st",
                platform = "st",
                canEdit = true,
                isPrivate = false,
                accessKty = "St",
                processing = true,
                live = false,
                upcoming = true,
                isFavorite = false
            )

        )

        var result = add(Post)
        //print(result)



        assertEquals(
            WritingOnTheWall(
                id = 1,

                ownerId = 2,
                fromId = 3,
                date = 200,
                text = "text",
                replyOwnerId = 1,
                replyPostId = 2,
                friendOnly = false,
                commentInfo = CommentInfo(count = 200, canPost = true, canClose = true, canOpen = false),
                copyright = Copyright(id = 1, link = "face", name = "friend", type = "Chandler"),
                like = LikeInformation(count = 200, userLikes = true, canLike = true, canPublish = true),
                repost = Repost(count = 4, userReposted = false),
                view = Views(count = 800),
                postType = "ross",
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = true,
                isFavorite = true,
                donut = Donute(
                    isDonute = true,
                    paidDuration = 2,
                    placeholder = Placeholder(donut = true),
                    canPublishFreeCopy = true,
                    editMode = "Yes"
                ),
                postponedId = 1,
                audio = Audio(
                    id = 1,
                    ownerId = 2,
                    date = 200,
                    artist = "2Pac",
                    title = "2",
                    duration = 1,
                    url = "URL",
                    lyrlcsId = 1,
                    albumId = 2,
                    genreId = 1,
                    noSearch = true,
                    isHq = false
                ),
                document = Document(
                    id = 1,
                    ownerId = 2,
                    title = "title",
                    size = 1,
                    ext = "ext",
                    url = "URL",
                    date = 1,
                    type = 2,
                    preview = Preview(
                        photo = Photo(
                            id = 1,
                            albumId = 2,
                            ownerId = 3,
                            userId = 4,
                            text = "yes",
                            date = 1,
                            sizes = Size(type = "yes", url = "URL", width = 1, height = 2),
                            width = 2,
                            height = 2
                        ),
                        graffiti = Graffiti(
                            src = "yes", width = 1, height = 2,
                        ),

                        audioMessage = AudioMessage(duration = 1, waveform = null, linkOgg = "URL", linkMp3 = "LINK")


                    )
                ),
                link = Link(
                    url = "st", title = "title", caption = "1", descriptiom = "2", photo = Photo(

                        id = 1, albumId = 1, ownerId = 2, userId = 3, text = "tx", date = 1, sizes = Size(
                            type = "1", url = "2", width = 1, height = 2,
                        ), width = 1, height = 2
                    ),   previewPage = "1", previewUrl = "2"
                ),
                note = Note(
                    id = 1, ownerId = 2, title = 3, text = "tx", date = 1, comments = 2, readComments = 3,
                    viewUrl = "url"
                ),
                page = Page(
                    id = 1,
                    groupId = 2,
                    creatorId = 3,
                    title = "tl",
                    currenlUserCanEdit = true,
                    currenlUserCanEditAcces = false,
                    whoCanView = 3,
                    whoCanEdit = 3,
                    edited = 1,
                    created = 2,
                    editorId = 3,
                    views = 5,
                    parent = "rs",
                    parent2 = "ch",
                    source = "source",
                    html = "html",

                    viewUrl = "vies_url"
                ),
                poll = Poll(
                    id = 1,
                    ownerId = 2,
                    created = 3,
                    question = "st",
                    votes = 5,
                    answers = null,
                    anonymous = false,
                    multiple = true,
                    answerIds = null,
                    endDate = 1,
                    closed = true,
                    isBoard = true,
                    canEdit = false,
                    canVote = false,
                    canReport = true,
                    canShare = false,
                    authorId = 1,
                    photo = Photo(
                        id = 1, albumId = 1, ownerId = 2, userId = 3, text = "tx", date = 1, sizes = Size(
                            type = "t",
                            url = "St",
                            width = 1,
                            height = 2,
                        ), width = 1, height = 2
                    ),
                    background = Background.Gradient(1,2,null),
                ),
                post = Post(
                    id = 1,

                    ownerId = 2,
                    fromId = 3,
                    createdBy = 4,
                    date = 5,
                    text = "tx",
                    replyOwnerId = 1,
                    replyPostId = 2,
                    friendOnly = true,
                    commentInfo = CommentInfo(count = 1, canPost = true, canClose = true, canOpen = true),
                    copyright = "1",
                    like = LikeInformation(
                        count = 1,
                        userLikes = true, canLike = true, canPublish = false
                    ),
                    repost = Repost(count = 1, userReposted = true),
                    views = Views(count = 1),
                    postType = "1",
                    postSource = PostSource(type = "s", platform = "s", date = "2", url = "irl"),
                    attachments = null,
                    geo = Geo(
                        type = "st",
                        coordinates = "st",
                    ),

                    signerId = 1,
                    copyHistory = null,
                    canPln = true,
                    canDelete = false,
                    canEdit = true,
                    isPinned = false,
                    markedAsAds = true,
                    isFavorite = true,
                    postponedId = 1
                ),
                postSource = PostSource(type = "f", platform = "2", date = "2", url = "2"),

                sticker = Sticker(
                    productId = 1,
                    stickerId = 2,
                    null,
                    null
                ),


                video = Video(
                    id = 1,
                    ownerId = 2,
                    title = "tl",
                    description = "2",
                    photo130 = "2",
                    photo320 = "3",
                    photo640 = "4",
                    photo800 = "6",
                    photo1280 = "2",
                    firstFrame130 = "5",
                    firstName320 = "3",
                    firstFrame640 = "5",
                    firstFrame800 = "8",
                    firstFrame1280 = "0",
                    date = 1,
                    addingDate = 2,
                    views = 1,
                    comments = 2,
                    payer = "st",
                    platform = "st",
                    canEdit = true,
                    isPrivate = false,
                    accessKty = "St",
                    processing = true,
                    live = false,
                    upcoming = true,
                    isFavorite = false
                )

            )
            ,

            result
        )


    }

    @Test
    fun update() {
        var update = 1
        var posts = emptyArray<WritingOnTheWall>()


        val Post = WritingOnTheWall(
            id = 1,

            ownerId = 2,
            fromId = 3,
            date = 200,
            text = "text",
            replyOwnerId = 1,
            replyPostId = 2,
            friendOnly = false,
            commentInfo = CommentInfo(count = 200, canPost = true, canClose = true, canOpen = false),
            copyright = Copyright(id = 1, link = "face", name = "friend", type = "Chandler"),
            like = LikeInformation(count = 200, userLikes = true, canLike = true, canPublish = true),
            repost = Repost(count = 4, userReposted = false),
            view = Views(count = 800),
            postType = "ross",
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = true,
            isFavorite = true,
            donut = Donute(
                isDonute = true,
                paidDuration = 2,
                placeholder = Placeholder(donut = true),
                canPublishFreeCopy = true,
                editMode = "Yes"
            ),
            postponedId = 1,
            audio = Audio(
                id = 1,
                ownerId = 2,
                date = 200,
                artist = "2Pac",
                title = "2",
                duration = 1,
                url = "URL",
                lyrlcsId = 1,
                albumId = 2,
                genreId = 1,
                noSearch = true,
                isHq = false
            ),
            document = Document(
                id = 1,
                ownerId = 2,
                title = "title",
                size = 1,
                ext = "ext",
                url = "URL",
                date = 1,
                type = 2,
                preview = Preview(
                    photo = Photo(
                        id = 1,
                        albumId = 2,
                        ownerId = 3,
                        userId = 4,
                        text = "yes",
                        date = 1,
                        sizes = Size(type = "yes", url = "URL", width = 1, height = 2),
                        width = 2,
                        height = 2
                    ),
                    graffiti = Graffiti(
                        src = "yes", width = 1, height = 2,
                    ),

                    audioMessage = AudioMessage(duration = 1, waveform = null, linkOgg = "URL", linkMp3 = "LINK")


                )
            ),
            link = Link(
                url = "st", title = "title", caption = "1", descriptiom = "2", photo = Photo(

                    id = 1, albumId = 1, ownerId = 2, userId = 3, text = "tx", date = 1, sizes = Size(
                        type = "1", url = "2", width = 1, height = 2,
                    ), width = 1, height = 2
                ),   previewPage = "1", previewUrl = "2"
            ),
            note = Note(
                id = 1, ownerId = 2, title = 3, text = "tx", date = 1, comments = 2, readComments = 3,
                viewUrl = "url"
            ),
            page = Page(
                id = 1,
                groupId = 2,
                creatorId = 3,
                title = "tl",
                currenlUserCanEdit = true,
                currenlUserCanEditAcces = false,
                whoCanView = 3,
                whoCanEdit = 3,
                edited = 1,
                created = 2,
                editorId = 3,
                views = 5,
                parent = "rs",
                parent2 = "ch",
                source = "source",
                html = "html",

                viewUrl = "vies_url"
            ),
            poll = Poll(
                id = 1,
                ownerId = 2,
                created = 3,
                question = "st",
                votes = 5,
                answers = null,
                anonymous = false,
                multiple = true,
                answerIds = null,
                endDate = 1,
                closed = true,
                isBoard = true,
                canEdit = false,
                canVote = false,
                canReport = true,
                canShare = false,
                authorId = 1,
                photo = Photo(
                    id = 1, albumId = 1, ownerId = 2, userId = 3, text = "tx", date = 1, sizes = Size(
                        type = "t",
                        url = "St",
                        width = 1,
                        height = 2,
                    ), width = 1, height = 2
                ),
                background = Background.Gradient(1,2,null),
            ),
            post = Post(
                id = 1,

                ownerId = 2,
                fromId = 3,
                createdBy = 4,
                date = 5,
                text = "tx",
                replyOwnerId = 1,
                replyPostId = 2,
                friendOnly = true,
                commentInfo = CommentInfo(count = 1, canPost = true, canClose = true, canOpen = true),
                copyright = "1",
                like = LikeInformation(
                    count = 1,
                    userLikes = true, canLike = true, canPublish = false
                ),
                repost = Repost(count = 1, userReposted = true),
                views = Views(count = 1),
                postType = "1",
                postSource = PostSource(type = "s", platform = "s", date = "2", url = "irl"),
                attachments = null,
                geo = Geo(
                    type = "st",
                    coordinates = "st",
                ),

                signerId = 1,
                copyHistory = null,
                canPln = true,
                canDelete = false,
                canEdit = true,
                isPinned = false,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 1
            ),
            postSource = PostSource(type = "f", platform = "2", date = "2", url = "2"),

            sticker = Sticker(
                productId = 1,
                stickerId = 2,
                null,
                null
            ),


            video = Video(
                id = 1,
                ownerId = 2,
                title = "tl",
                description = "2",
                photo130 = "2",
                photo320 = "3",
                photo640 = "4",
                photo800 = "6",
                photo1280 = "2",
                firstFrame130 = "5",
                firstName320 = "3",
                firstFrame640 = "5",
                firstFrame800 = "8",
                firstFrame1280 = "0",
                date = 1,
                addingDate = 2,
                views = 1,
                comments = 2,
                payer = "st",
                platform = "st",
                canEdit = true,
                isPrivate = false,
                accessKty = "St",
                processing = true,
                live = false,
                upcoming = true,
                isFavorite = false
            )

        )






        assertEquals(
            true,
            WallService.update(posts, update)
        )
    }

    @Test
    fun updateFalse() {
        val Post = WritingOnTheWall(
            id = 1,

            ownerId = 2,
            fromId = 3,
            date = 200,
            text = "text",
            replyOwnerId = 1,
            replyPostId = 2,
            friendOnly = false,
            commentInfo = CommentInfo(count = 200, canPost = true, canClose = true, canOpen = false),
            copyright = Copyright(id = 1, link = "face", name = "friend", type = "Chandler"),
            like = LikeInformation(count = 200, userLikes = true, canLike = true, canPublish = true),
            repost = Repost(count = 4, userReposted = false),
            view = Views(count = 800),
            postType = "ross",
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = true,
            isFavorite = true,
            donut = Donute(
                isDonute = true,
                paidDuration = 2,
                placeholder = Placeholder(donut = true),
                canPublishFreeCopy = true,
                editMode = "Yes"
            ),
            postponedId = 1,
            audio = Audio(
                id = 1,
                ownerId = 2,
                date = 200,
                artist = "2Pac",
                title = "2",
                duration = 1,
                url = "URL",
                lyrlcsId = 1,
                albumId = 2,
                genreId = 1,
                noSearch = true,
                isHq = false
            ),
            document = Document(
                id = 1,
                ownerId = 2,
                title = "title",
                size = 1,
                ext = "ext",
                url = "URL",
                date = 1,
                type = 2,
                preview = Preview(
                    photo = Photo(
                        id = 1,
                        albumId = 2,
                        ownerId = 3,
                        userId = 4,
                        text = "yes",
                        date = 1,
                        sizes = Size(type = "yes", url = "URL", width = 1, height = 2),
                        width = 2,
                        height = 2
                    ),
                    graffiti = Graffiti(
                        src = "yes", width = 1, height = 2,
                    ),

                    audioMessage = AudioMessage(duration = 1, waveform = null, linkOgg = "URL", linkMp3 = "LINK")


                )
            ),
            link = Link(
                url = "st", title = "title", caption = "1", descriptiom = "2", photo = Photo(

                    id = 1, albumId = 1, ownerId = 2, userId = 3, text = "tx", date = 1, sizes = Size(
                        type = "1", url = "2", width = 1, height = 2,
                    ), width = 1, height = 2
                ),   previewPage = "1", previewUrl = "2"
            ),
            note = Note(
                id = 1, ownerId = 2, title = 3, text = "tx", date = 1, comments = 2, readComments = 3,
                viewUrl = "url"
            ),
            page = Page(
                id = 1,
                groupId = 2,
                creatorId = 3,
                title = "tl",
                currenlUserCanEdit = true,
                currenlUserCanEditAcces = false,
                whoCanView = 3,
                whoCanEdit = 3,
                edited = 1,
                created = 2,
                editorId = 3,
                views = 5,
                parent = "rs",
                parent2 = "ch",
                source = "source",
                html = "html",

                viewUrl = "vies_url"
            ),
            poll = Poll(
                id = 1,
                ownerId = 2,
                created = 3,
                question = "st",
                votes = 5,
                answers = null,
                anonymous = false,
                multiple = true,
                answerIds = null,
                endDate = 1,
                closed = true,
                isBoard = true,
                canEdit = false,
                canVote = false,
                canReport = true,
                canShare = false,
                authorId = 1,
                photo = Photo(
                    id = 1, albumId = 1, ownerId = 2, userId = 3, text = "tx", date = 1, sizes = Size(
                        type = "t",
                        url = "St",
                        width = 1,
                        height = 2,
                    ), width = 1, height = 2
                ),
                background = Background.Gradient(1,2,null),
            ),
            post = Post(
                id = 1,

                ownerId = 2,
                fromId = 3,
                createdBy = 4,
                date = 5,
                text = "tx",
                replyOwnerId = 1,
                replyPostId = 2,
                friendOnly = true,
                commentInfo = CommentInfo(count = 1, canPost = true, canClose = true, canOpen = true),
                copyright = "1",
                like = LikeInformation(
                    count = 1,
                    userLikes = true, canLike = true, canPublish = false
                ),
                repost = Repost(count = 1, userReposted = true),
                views = Views(count = 1),
                postType = "1",
                postSource = PostSource(type = "s", platform = "s", date = "2", url = "irl"),
                attachments = null,
                geo = Geo(
                    type = "st",
                    coordinates = "st",
                ),

                signerId = 1,
                copyHistory = null,
                canPln = true,
                canDelete = false,
                canEdit = true,
                isPinned = false,
                markedAsAds = true,
                isFavorite = true,
                postponedId = 1
            ),
            postSource = PostSource(type = "f", platform = "2", date = "2", url = "2"),

            sticker = Sticker(
                productId = 1,
                stickerId = 2,
                null,
                null
            ),


            video = Video(
                id = 1,
                ownerId = 2,
                title = "tl",
                description = "2",
                photo130 = "2",
                photo320 = "3",
                photo640 = "4",
                photo800 = "6",
                photo1280 = "2",
                firstFrame130 = "5",
                firstName320 = "3",
                firstFrame640 = "5",
                firstFrame800 = "8",
                firstFrame1280 = "0",
                date = 1,
                addingDate = 2,
                views = 1,
                comments = 2,
                payer = "st",
                platform = "st",
                canEdit = true,
                isPrivate = false,
                accessKty = "St",
                processing = true,
                live = false,
                upcoming = true,
                isFavorite = false
            )

        )




        var posts = emptyArray<WritingOnTheWall>()
        posts += Post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)

        var update = 8


        assertEquals(
            false,
            WallService.update(posts, update),
        )
    }

}










