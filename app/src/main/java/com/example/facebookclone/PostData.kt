package com.example.facebookclone

data class PostData(
    val owenerImg: Int,
    val ownerName: String,
    val postTime: String,
    val postImg: Int,
    val reactCount: Int,
    val commentCount: String,
    val shareCount: String,
    val postCaption:String?
)
