package com.example.segundo_projeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.segundo_projeto.ui.theme.Segundo_projetoTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Segundo_projetoTheme {

            }
        }
    }
}

data class Story(
    val id: Int,
    val text: String,
    val imagem: Int = R.drawable.ryzen
)

val storys = listOf(
    Story(
        id = 1,
        imagem = R.drawable.ryzen,
        text = "R7 3700x"
    ),
    Story(
        id = 2,
        imagem = R.drawable.ryzen,
        text = "R7 5700x"
    ),
    Story(
        id = 3,
        imagem = R.drawable.ryzen,
        text = "R7 5800x 3D"
    ),
    Story(
        id = 4,
        imagem = R.drawable.ryzen,
        text = "R9 5950x"
    ),
    Story(
        id = 5,
        imagem = R.drawable.ryzen,
        text = "R5 5600"
    ),
)

@Composable
fun StoryItemList() {
    Row {
//        StoryItem(R.drawable.ryzen, stringResource(id = R.string.Story))
//        StoryItem(R.drawable.img_primeira, "Xbox")
//        StoryItem(R.drawable.img_primeira, "Xbox")
//        StoryItem(R.drawable.ryzen, "Ryzen")

        //        List(3) {
        //            StoryItem(imagem = R.drawable.ryzen, text = "Story ${it + 1}")
        //        }

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(storys) { story ->
                StoryItem(
                    imagem = story.imagem,
                    text = story.text
                )

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StoryItemListPreview() {
    StoryItemList()
}

@Composable
fun StoryItem(
    @DrawableRes imagem: Int,
    text: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape),
            painter = painterResource(id = imagem),
            contentDescription = null
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = text,
            style = MaterialTheme.typography.titleSmall
        )
    }
}

@Preview(showBackground = true, widthDp = 300)
@Composable
fun StoryItemPreview() {
    StoryItemList()
}

@Composable
fun ItemsList() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Medievais",
            modifier = Modifier.padding(horizontal = 10.dp)
        )
        Image(
            contentScale = ContentScale.Crop,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ItemsListPreview() {
    ItemsList()
}
