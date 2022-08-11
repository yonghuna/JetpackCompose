package com.example.jetpactutorial

import android.os.Bundle
import android.text.Layout
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.jetpactutorial.ui.theme.JetpacTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpacTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    //ListListScopeSample()
                    //SimpleListView()
//                    fruitsList.add(FruitModel("Apple", R.drawable.chiken))
//                    fruitsList.add(FruitModel("Orange", R.drawable.chiken))
//                    fruitsList.add(FruitModel("Banana", R.drawable.chiken))
//                    fruitsList.add(FruitModel("Strawberry", R.drawable.chiken))
//                    fruitsList.add(FruitModel("Mango", R.drawable.chiken))
//                    LazyColumn(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(Color.White)
//                    ) {
//                        items(fruitsList) { model ->
//                            ListRow(model = model)
//                        }
//                    }

                }
            }
        }
    }
}





@Composable
fun KotlinWorldCard(order: Int) {
    Card(
        Modifier
            .padding(12.dp)
            .border(width = 4.dp, color = Color.Black)
            .fillMaxWidth()
            .height(60.dp)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(R.drawable.chiken),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .padding(5.dp)
                    .size(60.dp)
                    .align(Alignment.TopStart)

            )
            Text(
                modifier = Modifier
                    .align(Alignment.TopCenter),
                text = "개발하는 LEE",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
            Text(
                modifier = Modifier
                    .align(Alignment.BottomCenter),
                text = "일해라",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )


        }
    }


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpacTutorialTheme {
        TopAppBar(
            title = { Text(text = "AppBar") }
        )
        LazyColumn(
        ) {
            items(10){
                KotlinWorldCard(order = it)
            }

        }
    }
}