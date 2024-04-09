//import android.util.Log
//import com.example.example.ExampleJson2KtKotlin
//import com.example.mbits_assignment.
//import io.ktor.client.*
//import io.ktor.client.features.json.*
//import io.ktor.client.features.json.serializer.KotlinxSerializer
//import io.ktor.client.request.*
//import kotlinx.coroutines.runBlocking
//import okhttp3.OkHttp
//
//suspend fun fetchSleepToolData(): ExampleJson2KtKotlin {
//    val client = HttpClient(OkHttp) {
//        install(JsonFeature) {
//            serializer = KotlinxSerializer()
//        }
//    }
//
//    return try {
//        val response: SleepToolResponse = client.get("https://api.example.com/endpoint_path_here")
//        response
//    } catch (e: Exception) {
//        // Handle exceptions
//        Log.e("API Error", "Error fetching data: ${e.message}")
//        throw e
//    } finally {
//        client.close()
//    }
//}
//
//fun main() = runBlocking {
//    try {
//        val sleepToolData = fetchSleepToolData()
//        Log.d("API Response", "Status: ${sleepToolData.status}")
//        Log.d("API Response", "Tool Data: ${sleepToolData.data.toolData}")
//        Log.d("API Response", "Progress Data: ${sleepToolData.data.progressData}")
//
//        // Process the response data here
//    } catch (e: Exception) {
//        Log.e("API Error", "Error: ${e.message}")
//    }
//}
//import android.util.Log
//import io.ktor.client.*
//import io.ktor.client.engine.okhttp.*
//import io.ktor.client.features.json.*
//import io.ktor.client.request.*
//import kotlinx.coroutines.runBlocking
//
//@Serializable
//data class SleepToolResponse(
//    val status: Status,
//    val data: SleepToolData
//)
//
//@Serializable
//data class Status(
//    val code: Int,
//    val msg: String,
//    val retry: Boolean,
//    val err: String
//)
//
//@Serializable
//data class SleepToolData(
//    val toolData: ToolData,
//    val progressData: ProgressData
//)
//
//@Serializable
//data class ToolData(
//    // Define the structure as per your JSON
//)
//
//@Serializable
//data class ProgressData(
//    // Define the structure as per your JSON
//)
//
//suspend fun fetchSleepToolData(): SleepToolResponse {
//    val client = HttpClient(OkHttp) {
//        install(JsonFeature) {
//            serializer = GsonSerializer()
//        }
//    }
//
//    return try {
//        val response: SleepToolResponse = client.get("https://whealthcare-dev.ap-southeast-1.elasticbeanstalk.com/tools/sleep/get/?uid=6309a9379af54f142c65fbfe&date=1711860932992")
//        response
//    } catch (e: Exception) {
//        // Handle exceptions
//        Log.e("API Error", "Error fetching data: ${e.message}")
//        throw e
//    } finally {
//        client.close()
//    }
//}
//
//fun main() = runBlocking {
//    try {
//        val sleepToolData = fetchSleepToolData()
//        Log.d("API Response", "Status: ${sleepToolData.status}")
//        Log.d("API Response", "Tool Data: ${sleepToolData.data.toolData}")
//        Log.d("API Response", "Progress Data: ${sleepToolData.data.progressData}")
//
//        // Process the response data here
//    } catch (e: Exception) {
//        Log.e("API Error", "Error: ${e.message}")
//    }
//}
