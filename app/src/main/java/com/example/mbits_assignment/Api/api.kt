//package com.example.mbits_assignment.Api
//
//import com.example.example.ExampleJson2KtKotlin
//import io.ktor.client.HttpClient
//import io.ktor.client.engine.android.Android
//import io.ktor.client.features.json.JsonFeature
//import io.ktor.client.features.json.serializer.KotlinxSerializer
//import io.ktor.client.features.logging.LogLevel
//import io.ktor.client.features.logging.Logging
//
//
////interface ApiService {
//////    @GET("get")
//////    suspend fun getApiData(@Query("uid") uid: String, @Query("date") date: Long): Response<ApiData>
////@GET("/quotes")
////    suspend fun getApiData(@Query("page") page:Int): Response<quoteData>
////}
//
//
//interface PostsService {
//
//    suspend fun getPosts(): ExampleJson2KtKotlin
////    suspend fun createPost(postRequest: PostRequest): PostResponse?
//    companion object {
//        fun create(): PostsService {
//            return PostsServiceImpl(
//                client = HttpClient(Android) {
//                    install(Logging) {
//                        level = LogLevel.ALL
//                    }
//                    install(JsonFeature) {
//                        serializer = KotlinxSerializer()
//                    }
//                }
//            )
//        }
//    }
//}
