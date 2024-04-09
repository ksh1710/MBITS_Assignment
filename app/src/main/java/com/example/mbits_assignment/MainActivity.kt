package com.example.mbits_assignment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.example.ExampleJson2KtKotlin
//import com.example.mbits_assignment.Api.PostsService
//import com.example.mbits_assignment.Api.ApiService
import com.example.mbits_assignment.Screen.MainScreen
import com.example.mbits_assignment.ui.theme.MBITS_AssignmentTheme
//import io.ktor.client.HttpClient
//import io.ktor.client.engine.android.Android
//import io.ktor.client.features.json.JsonFeature
//import io.ktor.client.features.json.serializer.KotlinxSerializer
//import io.ktor.client.request.get
import kotlinx.coroutines.CoroutineScope
//import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
//import okhttp3.OkHttp
import okhttp3.OkHttpClient
import java.security.KeyStore
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManagerFactory
import javax.net.ssl.X509TrustManager
import kotlin.Result

//import javax.inject.Inject


//@AndroidEntryPoint
class MainActivity : ComponentActivity() {
//    private val service = PostsService.create()

//    @Inject
//    lateinit var apiSerivce: ApiService

    @OptIn(DelicateCoroutinesApi::class)
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        GlobalScope.launch {
//            val response = apiSerivce.getApiData("6309a9379af54f142c65fbfe", 1711860932992)
//            Log.d("idk", "response:${response.body().toString()} ")
//        }
////        val apiservice = Helper.getInstance().create(ApiService::class.java)
//        val repo = Repo(apiservice)
//        viewModel = ViewModelProvider(this, ViewmodelFactory(repo)).get(viewModel::class.java)
//GlobalScope.launch {
//    var res=
//}
//            val ad = Helper.getInstance().create(ApiService::class.java)
//            // launching a new coroutine
//            GlobalScope.launch(Dispatchers.IO) {
//                val result = ad.getApiData(1)
//                if (result != null)
//                // Checking the results
//                    Log.d("idk", result.body().toString())
//            }
        setContent {
//            fetchdata()
//            CoroutineScope(Dispatchers.IO).launch {
//
//                val response = fetchSleepToolData()
//                Log.d("idk", "onCreate:$response ")
//            }
//            CoroutineScope(Dispatchers.IO).launch {
//                val apidata = service.getPosts()
//                if (apidata != null) {
//                    Log.d("idk", "Fetched data: $apidata")
//                    // Update UI with the data
            // ...
//                } else {
//                    Log.d("idk", "error h yaha ")
//                    // Handle data fetching error in UI
//                    // ...
//                }
//            }
            MBITS_AssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
                MainScreen()
            }
        }
    }
}

//fun fetchdata() {
//    val httpClient = HttpClient()
//
//    val uid = "6309a9379af54f142c65fbfe"
//    val date = "1711860932992" // Assuming this is the desired date parameter
//    val url =
//        "https://whealthcare-dev.ap-southeast-1.elasticbeanstalk.com/tools/sleep/get/?uid=6309a9379af54f142c65fbfe&date=1711860932992"
//        "https://demo.dataverse.org/api/search?q=*&type=dataset"
//        "https://whealthcare-dev.ap-southeast-1.elasticbeanstalk.com/tools/sleep/get/?uid=$uid&date=$date"
//            " https://world.openfoodfacts.org/api/v2/product/737628064502.json"
//            "https://dummyjson.com/products/1"

//    GlobalScope.launch(Dispatchers.Main) {
//        try {
//            val response: ExampleJson2KtKotlin = httpClient.get(url)
//            Log.d("idk", "fetchData:$response ")
//            // Process response as needed
//            // For example, you can access response.data to get the data returned by the API
//        } catch (e: Exception) {
//            Log.d("idk", "error: ${e.message} ")
//            // Handle exception
//        } finally {
//            httpClient.close()
//        }
//    }
//}

//    private fun createHttpClient(): HttpClient {
//        val sslContext = SSLContext.getInstance("TLS").apply {
//            init(null, arrayOf(createTrustManager()), null)
//        }
//        val sslSocketFactory = sslContext.socketFactory
//
//        return HttpClient(Android) {
//            engine {
//
//            }
//
//            install(JsonFeature) {
//                serializer =
//                    KotlinxSerializer() // You can use any other JSON serializer as per your preference
//            }
//        }
//    }
//
//    private fun createTrustManager(): X509TrustManager {
//        val trustManagerFactory =
//            TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm())
//        trustManagerFactory.init(null as KeyStore?)
//        val trustManagers = trustManagerFactory.trustManagers
//
//        return trustManagers.first { it is X509TrustManager } as X509TrustManager
//    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MBITS_AssignmentTheme {
        MainScreen()
    }
}