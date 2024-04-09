//package com.example.mbits_assignment.Api
//
//import HttpRoutes
//import com.example.example.ExampleJson2KtKotlin
//import io.ktor.client.HttpClient
//import io.ktor.client.request.get
//import io.ktor.client.request.parameter
//import io.ktor.client.request.url
//
//
//class PostsServiceImpl(
//    private val client: HttpClient
//) : PostsService {
//
//    override suspend fun getPosts(): ExampleJson2KtKotlin {
//        return try {
//
//            client.get {
//                url(HttpRoutes.POSTS)
//                parameter("uid", "6309a9379af54f142c65fbfe")
//                parameter("date", 1711860932992)
//            }
//        }catch (e:Exception){
//            println("error: ${e.message}")
//            ExampleJson2KtKotlin(null,null)
//        }
//    }
//}
//
//
//
////        } catch(e: RedirectResponseException) {
////            // 3xx - responses
////            println("Error: ${e.response.status.description}")
////        } catch(e: ClientRequestException) {
////            // 4xx - responses
////            println("Error: ${e.response.status.description}")
////        } catch(e: ServerResponseException) {
////            // 5xx - responses
////            println("Error: ${e.response.status.description}")
////            Result.toString()
////        } catch(e: Exception) {
////            println("Error: ${e.message}")
////            Result.toString()
////
////        }
////    }
//
////    override suspend fun createPost(postRequest: PostRequest): PostResponse? {
////        return try {
////            client.post<PostResponse> {
////                url(HttpRoutes.POSTS)
////                contentType(ContentType.Application.Json)
////                body = postRequest
////            }
////        } catch(e: RedirectResponseException) {
////            // 3xx - responses
////            println("Error: ${e.response.status.description}")
////            null
////        } catch(e: ClientRequestException) {
////            // 4xx - responses
////            println("Error: ${e.response.status.description}")
////            null
////        } catch(e: ServerResponseException) {
////            // 5xx - responses
////            println("Error: ${e.response.status.description}")
////            null
////        } catch(e: Exception) {
////            println("Error: ${e.message}")
////            null
////        }
////    }
////        }