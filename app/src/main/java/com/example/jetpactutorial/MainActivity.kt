package com.example.jetpactutorial

import android.os.Bundle
import android.text.Layout
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
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
                    fruitsList.add(FruitModel("Apple", R.drawable.chiken))
                    fruitsList.add(FruitModel("Orange", R.drawable.chiken))
                    fruitsList.add(FruitModel("Banana", R.drawable.chiken))
                    fruitsList.add(FruitModel("Strawberry", R.drawable.chiken))
                    fruitsList.add(FruitModel("Mango", R.drawable.chiken))
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                    ) {
                        items(fruitsList) { model ->
                            ListRow(model = model)
                        }
                    }

                }
            }
        }
    }
}
@Composable
fun ListListScopeSample(){
    LazyColumn {
        // Add a single item
        item {
            Text(text = "Header")
        }

        // Add 3 items
        items(3) { index ->
            Text(text = "First List items : $index")
        }

        // Add 2 items
        items(2) { index ->
            Text(text = "Second List Items: $index")
        }

        // Add another single item
        item {
            Text(text = "Footer")
        }
    }
}

private val countryList =
    mutableListOf("India", "Pakistan", "China", "United States")

private val fruitsList = mutableListOf<FruitModel>()



private val listModifier = Modifier
    .fillMaxSize()
    .background(Color.Gray)
    .padding(10.dp)

private val textStyle = TextStyle(fontSize = 20.sp, color = Color.White)

@Composable
fun SimpleListView() {
    LazyColumn(modifier = listModifier) {
        items(countryList) { country ->
            Text(text = country, style = textStyle)
        }
    }
}

data class FruitModel(val name:String, val image : Int)

@Composable
fun ListRow(model: FruitModel) {
    Scaffold(topBar =  {
        TopAppBar(title =  {Text(text = "TopAppbar")}
            , backgroundColor = Color.DarkGray)}){
        Text(text = "ㅎㅇ")
    }


    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier

            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
        )
        Text(
            text = model.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White
        )
    }

}







@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpacTutorialTheme {
        //ScrollBoxes()
        //ListListScopeSample()
        //SimpleListView()
        fruitsList.add(FruitModel("Apple", R.drawable.chiken))
        fruitsList.add(FruitModel("Orange", R.drawable.chiken))
        fruitsList.add(FruitModel("Banana", R.drawable.chiken))
        fruitsList.add(FruitModel("Strawberry", R.drawable.chiken))
        fruitsList.add(FruitModel("Mango", R.drawable.chiken))
        LazyColumn(

            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            items(fruitsList) { model ->
                ListRow(model = model)
            }
        }
    }
}