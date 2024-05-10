package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon:Int,val name: String)

val libraries = listOf<Lib>(
    Lib(R.drawable.playlist, "Playlist"),
    Lib(R.drawable.artist, "Artist"),
    Lib(R.drawable.album, "Album"),
    Lib(R.drawable.song, "Songs"),
    Lib(R.drawable.genre, "Genre")
)
