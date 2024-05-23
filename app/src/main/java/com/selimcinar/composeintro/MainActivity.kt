package com.selimcinar.composeintro

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.selimcinar.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeIntroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                 color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
        /* lambda
        testFunction(5){
            testFunctionLambda()
        }*/
    }
/* lambda fonksiyonlar
    fun testFunction(int: Int,myfunction:() -> Unit){
        myfunction.invoke()
    }
    fun testFunctionLambda(){
        println("test")
    }*/
}

@Composable
fun MainScreen(){
    //Column sütun rowsatır , boxkutu üstüste gösterme
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        customText(text = "hello")
        Spacer(modifier = Modifier.padding(5.dp))
        customText(text = "hello")
        Spacer(modifier = Modifier.padding(5.dp))
        customText(text = "hello")

        Text(text = "Hello Android",
            color = Color.Blue,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif

         //   modifier = Modifier.size(100.dp,50.dp)
        )


        Row(
            modifier=Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly

        ){
            customText(text = "Test 1")
            Spacer(modifier = Modifier.padding(5.dp))
            customText(text = "Test2 ")
            customText(text = "Test2 ")

        }
    }



}
@Composable
fun customText(text: String){
    Text(   modifier = Modifier
        .background(color = Color.Blue)
        .padding(top = 5.dp, start = 1.dp, end = 1.dp, bottom = 3.dp)
        .clickable {
            println("Hello tıklandı sayılır")
        }
       // .fillMaxSize(0.2f)
        ,text = text,
        color = Color.Yellow,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif,
        textAlign = TextAlign.Center,



    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    MainScreen()
}