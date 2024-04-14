package com.example.mbits_assignment


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
//import com.example.mbits_assignment.Api.PostsService
//import com.example.mbits_assignment.Api.ApiService
import com.example.mbits_assignment.Screen.MainScreen
//import com.example.mbits_assignment.models.dummy
import com.example.mbits_assignment.ui.theme.MBITS_AssignmentTheme


class MainActivity : ComponentActivity() {

    private val database by lazy {
        Room.databaseBuilder(
            applicationContext,
            DataDatabase::class.java,
            "data.db"
        ).build()
    }

    private val viewModel by viewModels<DataViewModel>(
        factoryProducer = {
            object : ViewModelProvider.Factory {
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return DataViewModel(database.dao) as T
                }
            }
        }
    )

    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MBITS_AssignmentTheme {
//                val state by viewModel.state.collectAsState()
                val state by viewModel.state.collectAsState()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }

                MainScreen(
                    state = state
//                    onEvent = viewModel::onEvent
                )
            }
        }
    }


//    private fun getApiDataWithHttps(callback: (String) -> Unit) {
//        // URL of the API you want to access
//        val apiUrl = "https://whealthcare-dev.ap-southeast-1.elasticbeanstalk.com/tools/sleep/get/?uid=6309a9379af54f142c65fbfe&date=1711860932992\n"
//
//        // Start a coroutine to perform the network operation asynchronously
//        GlobalScope.launch(Dispatchers.IO) {
//            try {
//                // Create an HTTPS connection
//                val url = URL(apiUrl)
//                val urlConnection = url.openConnection() as HttpsURLConnection
//
//                // Read the response
//                val reader = BufferedReader(InputStreamReader(urlConnection.inputStream))
//                val response = StringBuilder()
//                var line: String?
//                while (reader.readLine().also { line = it } != null) {
//                    response.append(line)
//                }
//
//                // Update UI on the main thread
//                launch(Dispatchers.Main) {
//                    // Pass the response to the callback function
//                    callback(response.toString())
//                }
//            } catch (e: Exception) {
//                // Handle exceptions here
//                e.printStackTrace()
//                launch(Dispatchers.Main) {
//                    // Notify the UI about the failure
//                    callback("Error: ${e.message}")
//                }
//            }
//        }
//    }
//
//    fun FetchDataFromApi() {
//        // Call the HTTPS request function
//        getApiDataWithHttps { response ->
//            // Process the response here
//            Log.d("idk", "Response: $response")
//        }
//    }


//    private fun getApiData(){
//        val api = Retrofit.Builder()
//            .baseUrl("https://jsonplaceholder.typicode.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(ApiService::class.java)
//
//        api.getData().enqueue(object:retrofit2.Callback<Data> {
//            override fun onResponse(
//                call: retrofit2.Call<Data>,
//                response: retrofit2.Response<Data>
//            ) {
//                if (response.isSuccessful){
//                    response.body().let {
//                        Log.d("idk", "onResponse:${it.toString()} ")
//                    }
//                }
//            }
//
//            override fun onFailure(call: retrofit2.Call<Data>, t: Throwable) {
//                Log.d("idk", "onFailure:${t.message.toString()} ")
//            }
//
//        })
//    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MBITS_AssignmentTheme {
//        MainScreen()
    }
}