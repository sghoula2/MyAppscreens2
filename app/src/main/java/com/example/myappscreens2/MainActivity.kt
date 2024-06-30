package com.example.myappscreens2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myappscreens2.ui.theme.MyAppScreens2Theme
import com.example.myappscreens2.ui.theme.Orange

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Myapp()

        }
    }
}

@Composable
fun Myapp() {
Column (
    modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFE3F2FD)),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
 ){
    SignUpScreen()
    Spacer(modifier = Modifier.height(16.dp))
    LogInScreen()
}

}

@Composable
fun LogInScreen() {
   Column(
       modifier=Modifier.fillMaxSize(),
           horizontalAlignment = Alignment.CenterHorizontally
   ){
       Image(
           painter = painterResource(id = R.drawable.image),
           contentDescription = null,
           modifier = Modifier
               .fillMaxWidth()
               .height(200.dp),
           contentScale=ContentScale.Crop
       )
       Spacer(modifier = Modifier.height(20.dp))
       Text(
           text = "Welcome!",
           modifier = Modifier.padding(start = 20.dp,end=160.dp),

           color = Color.Black,
           fontSize = 40.sp,


       )
       Spacer(modifier = Modifier.height(30.dp))
       Text(
           text = "email",
           modifier = Modifier.padding(start = 10.dp,end=240.dp),

           color = Color.Black,
           fontSize = 18.sp,


           )
       Spacer(modifier = Modifier.height(20.dp))
       OutlinedTextField( value="enter your email", onValueChange = {} )
       Spacer(modifier = Modifier.height(20.dp))
       Text(
           text = " password",
           modifier = Modifier.padding(start = 10.dp,end= 240.dp),

           color = Color.Black,
           fontSize = 18.sp
           )
       Spacer(modifier = Modifier.height(20.dp))
       OutlinedTextField( value="enter your password", onValueChange = {},

       )
       Spacer(modifier = Modifier.height(20.dp))
       Text(
           text = "Forgot password?",
           modifier = Modifier.padding(start = 200.dp,end= 30.dp),

          color= Orange ,
           fontSize = 18.sp
       )
       Spacer(modifier = Modifier.height(40.dp))
    Button(onClick = { },
      modifier = Modifier
          .size(width=300.dp,height=60.dp)
          .padding(start = 30.dp, end = 30.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Orange)
        ) {
Text(
    modifier = Modifier.padding(8.dp),
    text="Login",
    color=Color.White,
    fontSize = 20.sp,
)
    }
       Spacer(modifier = Modifier.height(20.dp))
       Text(
           modifier = Modifier.padding(8.dp),
           text="Don't have an account?",
           color=Color.Black,
           fontSize = 20.sp,
       )
       Spacer(modifier = Modifier.height(10.dp))
       Text(
           modifier = Modifier.padding(8.dp),
           text="sign up",
           color=Orange,
           fontSize = 20.sp,
       )

   }
    }



@Composable
fun SignUpScreen() {
    Column(
        modifier=Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
    Spacer(modifier = Modifier.height(80.dp))
    Text(
        text = "Sign Up",
        modifier = Modifier.padding(start = 20.dp,end=200.dp),

        color = Color.Black,
        fontSize = 40.sp,


        )
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        modifier = Modifier.padding(8.dp),
        text="Already have an account?",
        color=Color.Black,
        fontSize = 20.sp,
    )
    Spacer(modifier = Modifier.height(10.dp))
    Text(
        modifier = Modifier.padding(8.dp),
        text="log in",
        color=Orange,
        fontSize = 20.sp,
    )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Name",
            modifier = Modifier.padding(start = 10.dp,end=240.dp),

            color = Color.Black,
            fontSize = 18.sp,


            )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField( value="enter your Name", onValueChange = {} )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "email",
            modifier = Modifier.padding(start = 10.dp,end=240.dp),

            color = Color.Black,
            fontSize = 18.sp,


            )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField( value="enter your email", onValueChange = {} )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = " password",
            modifier = Modifier.padding(start = 10.dp,end= 240.dp),

            color = Color.Black,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField( value="enter your password", onValueChange = {},

            )
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { },
            modifier = Modifier
                .size(width=300.dp,height=60.dp)
                .padding(start = 30.dp, end = 30.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Orange)
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "sign up",
                color = Color.White,
                fontSize = 20.sp,

            )
        }}}

@Preview(showBackground = true)
@Composable
fun   LogInScreenPreview(){
    LogInScreen()
}
@Preview(showBackground = true)
@Composable
fun   SignUpScreenPreview(){
    SignUpScreen ()
}