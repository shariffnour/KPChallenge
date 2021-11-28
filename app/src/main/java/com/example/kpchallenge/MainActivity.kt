package com.example.kpchallenge

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kpchallenge.ui.theme.KPChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KPChallengeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    VerboseOutput()
                }
            }
        }
    }
}

@Composable
fun VerboseOutput() {
    Column{

        Column(Modifier.fillMaxWidth()){
            Image(
                painter = painterResource(R.drawable.img),
                contentDescription = null,
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth,
                
            )
            Spacer(modifier = Modifier.padding(5.dp))
        }

        Column(Modifier.padding(15.dp, 0.dp, 0.dp, 0.dp)){
            Text(text = stringResource(id = R.string.name), style = MaterialTheme.typography.h5, fontWeight = FontWeight.Bold)
            Row{
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_location_on_24),
                    contentDescription = null,
                    Modifier.size(15.dp)
                )
                Spacer(Modifier.padding(
                    2.dp, 0.dp
                ))
                Text(text = stringResource(id = R.string.location), style= MaterialTheme.typography.subtitle2)
            }

            Text(text = stringResource(id = R.string.hobbies), style= MaterialTheme.typography.caption)
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = stringResource(id = R.string.about), style= MaterialTheme.typography.body1, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = stringResource(id = R.string.body), style= MaterialTheme.typography.body2)
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = stringResource(id = R.string.languages), style= MaterialTheme.typography.body1, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = stringResource(id = R.string.kotlin), style= MaterialTheme.typography.body2)
            Text(text = stringResource(id = R.string.flutter), style= MaterialTheme.typography.body2)
            Text(text = stringResource(id = R.string.java), style= MaterialTheme.typography.body2)
            Text(text = stringResource(id = R.string.reactnative), style= MaterialTheme.typography.body2)
            Text(text = stringResource(id = R.string.js), style= MaterialTheme.typography.body2)
            Spacer(modifier = Modifier.padding(15.dp))
            Button(onClick = { /*TODO*/ },
                Modifier
                    .padding(5.dp)
                    .width(350.dp),
            shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Blue)
            ) {
                Text(text = "Contact me", color = Color.White)
            }
            }
    }

}

data class Greeting(val time: String, val parlance: String)

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KPChallengeTheme {
        VerboseOutput()
    }
}