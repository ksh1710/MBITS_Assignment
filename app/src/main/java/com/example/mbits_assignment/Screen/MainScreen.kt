package com.example.mbits_assignment.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.ColumnScopeInstance.align
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mbits_assignment.models.Data
import com.example.mbits_assignment.DataEvent
import com.example.mbits_assignment.DataState
import com.example.mbits_assignment.R
import com.example.mbits_assignment.ui.theme.clr1
import com.example.mbits_assignment.ui.theme.clr2
import com.example.mbits_assignment.ui.theme.clr3
import com.example.mbits_assignment.ui.theme.clr5
import com.example.mbits_assignment.ui.theme.clr6
import com.example.mbits_assignment.ui.theme.clr7
import com.example.mbits_assignment.ui.theme.clr8
import com.example.mbits_assignment.ui.theme.clr9

//import sampleState

@Composable
fun MainScreen(
    state: DataState,
//    onEvent: (DataEvent) -> Unit
) {


    Scaffold(topBar = {
//        TopBar(hazeState)
    }) {
        Box(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(id = R.drawable.bgimg),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            TopBar()
            Column(
                Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ClockItems()
                Spacer(modifier = Modifier.size(20.dp))
                BadaCard()
            }
            BottomSheet(
                modifier = Modifier,
//                onEvent,
                state = state
            )
        }
    }
}

@Composable
fun GradientDivider(
    modifier: Modifier = Modifier,
    height: Dp = 3.dp,
) {
    Box(
        modifier
            .width(110.dp)
            .height(height)
            .clip(RoundedCornerShape(5.dp))
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        clr1, clr2, clr3, clr5, clr6, clr7,
                        clr8, clr9
                    )
                )
            )
    )
}

@Composable
fun BadaCard() {
    Card(
        Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Max)
            .padding(15.dp),
        colors = CardDefaults.cardColors(containerColor = Color.DarkGray.copy(0.8f))
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "8 hrs")
                HorizontalDivider(
                    Modifier
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp)), thickness = 3.dp, color = Color.White
                )

                Text(text = "Recommended")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "7 hrs")
                GradientDivider()
//                HorizontalDivider(
//                    Modifier
//                        .width(110.dp)
//                        .clip(RoundedCornerShape(5.dp)), thickness = 3.dp, color = Color.White
//                )
                Text(text = "Goal")

            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "6 hrs")
                HorizontalDivider(
                    Modifier
                        .width(110.dp)
                        .clip(RoundedCornerShape(5.dp)), thickness = 3.dp, color = Color.White
                )
                Text(text = "Achieved")

            }
        }

    }
}

@Composable
fun ClockItems() {
    Card(
        modifier = Modifier
            .size(200.dp)
            .clip(CircleShape),
        colors = CardDefaults.cardColors(containerColor = Color.LightGray.copy(0.7f))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(text = "20:45", fontSize = 40.sp, fontWeight = FontWeight.Bold)
            Row {
                Icon(
                    painterResource(id = R.drawable.alarm),
                    modifier = Modifier.padding(end = 5.dp),
                    contentDescription = null
                )
                Text(text = "off", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            }
        }
    }
}

@Composable
fun TopBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Max)
            .background(Color.Black.copy(0.7f))
            .padding(20.dp)
    ) {
        Row {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null)
            Spacer(Modifier.size(15.dp))
            Text(text = "Sleep Tool", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
        }
        Icon(
            painter = painterResource(id = R.drawable.live_help_24),
            contentDescription = null,
            Modifier.align(
                Alignment.TopEnd
            )
        )
    }
}


@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun BottomSheet(
    modifier: Modifier,
//    onEvent: (DataEvent) -> Unit,
    state: DataState
) {

    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember {
        mutableStateOf(true)
    }

    ModalBottomSheet(
        modifier = modifier
            .height(IntrinsicSize.Max),
        containerColor = Color.Black.copy(0.6f),
        onDismissRequest = {
            showBottomSheet = false
        },

        sheetState = sheetState,
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {

                Text(text = "Practise", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
            }
            ContentRow()
            FlowRow(
                modifier = Modifier
                    .padding(20.dp)
                    .width(IntrinsicSize.Max),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                state.data.forEach {
                    DataCard(
                        state = state,
                        item = it
                    )
                }
            }
            BottomCard(
//                onEvent = onEvent
            )
            Spacer(Modifier.size(5.dp))
        }
    }
}

@Composable
fun ContentRow() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        CircleCard(icon = painterResource(id = R.drawable.earrings), text = "Dream")
        CircleCard(icon = painterResource(id = R.drawable.kids), text = "Kids")
        CircleCard(icon = painterResource(id = R.drawable.heart), text = "Love")
        CircleCard(icon = null, text = "More")
    }

}

@Composable
fun CircleCard(icon: Painter?, text: String) {
    Column(
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (icon != null) {
            Icon(icon, contentDescription = null, modifier = Modifier.size(25.dp))
        }
        Text(text = text, fontSize = 15.sp)
    }

}

@Composable
fun DataCard(
    state: DataState,
    item: Data,
) {
    Box(
        modifier = Modifier
            .width(181.dp)
            .height(92.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.DarkGray.copy(0.8f))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                Icons.Default.AccountBox,
                modifier = Modifier.align(Alignment.Top),
                contentDescription = null
            )
            Spacer(modifier = Modifier.size(10.dp))
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Top) {
                Text(text = item.ttl)
//                Text(text = text[index])
                Spacer(modifier = Modifier.size(5.dp))
//                Text(text = "dummy desc", fontWeight = FontWeight.Bold)
                Text(text = item.value_ttl, fontWeight = FontWeight.Bold)
            }
        }
    }
}


@Composable
fun BottomCard(
//    state: NoteState,
//    onEvent: (DataEvent) -> Unit

) {
    var checked by remember { mutableStateOf(true) }


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Max)
            .padding(10.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(
                Color.DarkGray.copy(0.6f)
            )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.bell),
                contentDescription = null,
                Modifier.align(
                    Alignment.Top
                )
            )
            Column(
                modifier = Modifier
                    .width(200.dp)
                    .align(Alignment.Top)
            ) {
                Text(text = "Heading", fontWeight = FontWeight.SemiBold)
                Text(
                    text = "There will be addition of 500 ml to 1 Litre of water to your daily intake based on the weather temperature.",
                    fontSize = 15.sp
                )
            }
            Switch(
                modifier = Modifier.align(Alignment.Top),
                checked = true,
                onCheckedChange = {
                    checked = it
                },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color(
                        0xFF43A047
                    ),
                    checkedTrackColor = Color(
                        0xFF969696
                    ).copy(0.6f)

                )
            )
        }

    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(10.dp), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize(),
            onClick = {


            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(
                    0xFF43A047
                )
            ),
            shape = RoundedCornerShape(5.dp)
        ) {
            Text(color = Color.White, text = "SCHEDULE")
        }
        Spacer(modifier = Modifier.size(5.dp))
        Button(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize(),
            onClick = {
//                onEvent(
//                    DataEvent
//                        .SaveNote(null, null)
//                )
            }, colors = ButtonDefaults.buttonColors(
                containerColor = Color(
                    0xFF0277BD
                )
            ),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(color = Color.White, text = "START")
        }
    }
}