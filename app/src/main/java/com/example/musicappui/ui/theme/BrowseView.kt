package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicappui.R

@Preview
@Composable
fun Browse(){
    val categories = listOf("Hits", "Happy","Workout","Running","TGIF","Yoga")
    LazyVerticalGrid(columns =GridCells.Fixed(2) ) {
        items(categories){
                cat->
            BrowserItem(cat, R.drawable.baseline_library_music_24)
        }
    }
}
