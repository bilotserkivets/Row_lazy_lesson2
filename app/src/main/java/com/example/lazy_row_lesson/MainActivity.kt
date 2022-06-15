package com.example.lazy_row_lesson

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lazy_row_lesson.ui.theme.Grey100
import com.example.lazy_row_lesson.ui.theme.Lazy_row_lessonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow(modifier = Modifier.background(Grey100).padding(3.dp)) {
                itemsIndexed(
                    listOf(
                        RowItemModel(R.drawable.image1, "Volodumur"),
                        RowItemModel(R.drawable.image2, "Jon"),
                        RowItemModel(R.drawable.image3, "Boris"),
                        RowItemModel(R.drawable.image4, "Andrzej"),
                        RowItemModel(R.drawable.image5, "Gitanas"),
                        RowItemModel(R.drawable.image6, "Justin"),
                    )) { _, value ->
                        RowItem(value)
                    }
            }

        }
    }
}
