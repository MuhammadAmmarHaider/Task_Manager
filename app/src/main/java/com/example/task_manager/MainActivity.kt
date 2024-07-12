package com.example.task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task_manager.ui.theme.Task_ManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Task_ManagerTheme {
                    Surface(modifier = Modifier.fillMaxSize(),color= MaterialTheme.colorScheme.background) {
                        ComposeTaskManager()
                    }

            }
        }
    }
}

@Composable
fun ComposeTaskManager()
{
    val image= painterResource(id = R.drawable.ic_task_completed)
    val heading=stringResource(id=R.string.heading)
    val text= stringResource(id = R.string.text)
    TaskManager(image = image, heading = heading, text =text )
}
@Composable
fun TaskManager(image: Painter, heading:String, text:String,modifier:Modifier=Modifier)
{
    Column(modifier=modifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
         Image(painter = image, contentDescription =null)
        Text(text = heading, fontWeight = FontWeight.Bold,modifier=modifier.padding(top=24.dp,bottom=8.dp))
        Text(text = text,fontSize=24.sp)
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTaskManager()
}