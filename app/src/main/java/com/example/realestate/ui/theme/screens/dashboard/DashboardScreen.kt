package com.example.realestate.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ADD_PRODUCTS_URL
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.navigation.ROUT_PROPERTY
import com.example.realestate.navigation.VIEW_PRODUCTS_URL
import com.example.realestate.ui.theme.Frey

@Composable
fun DashBoardScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        Image(painter = painterResource(id = R.drawable.img_8),
            contentDescription ="signup",
            modifier = Modifier
                .size(100.dp)
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text ="Manage your properties with ease",
            fontSize = 20.sp,
            )
        Spacer(modifier = Modifier.height(15.dp))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            //Main Card
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(Frey)
            ){//Row1
                Row (modifier = Modifier.padding(20.dp)){
                    //Card1
                    Card(
                        modifier = Modifier
                            .clickable { navController.navigate(ROUT_HOME) }
                            .width(160.dp)
                            .height(180.dp),
                        elevation = CardDefaults.cardElevation(50.dp)

                        ) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(id = R.drawable.img_8),
                                    contentDescription ="",
                                    modifier = Modifier
                                        .size(80.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(25.dp))

                            Text(text = "Home",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card1
                    Spacer(modifier = Modifier.width(25.dp))

                    //Card2
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_PROPERTY) }
                        .width(160.dp)
                        .height(180.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(id = R.drawable.property),
                                    contentDescription ="Property",
                                    modifier = Modifier
                                        .size(80.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(25.dp))

                            Text(text = "Property",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card2





                }
               //End of row1
                //Row2
                Row (modifier = Modifier.padding(20.dp)){
                    //Card3
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(id = R.drawable.img_9),
                                    contentDescription ="",
                                    modifier = Modifier
                                        .size(80.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(25.dp))

                            Text(text = "Profile",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card3
                    Spacer(modifier = Modifier.width(25.dp))

                    //Card4
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(id = R.drawable.profile),
                                    contentDescription ="",
                                    modifier = Modifier
                                        .size(80.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(25.dp))

                            Text(text = "Settings",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card4





                }
                //End of row2
                //Row3
                Row (modifier = Modifier.padding(20.dp)){
                    //Card5
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier.fillMaxWidth()
                                .clickable { navController.navigate(ADD_PRODUCTS_URL) }
                                ,
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(id = R.drawable.img_8),
                                    contentDescription ="",
                                    modifier = Modifier.size(80.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(25.dp))

                            Text(text = "Add Products",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card5
                    Spacer(modifier = Modifier.width(25.dp))

                    //Card6
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(modifier = Modifier.fillMaxWidth()
                                .clickable { navController.navigate(VIEW_PRODUCTS_URL) }
                                ,
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(id = R.drawable.img_8),
                                    contentDescription ="",
                                    modifier = Modifier
                                        .size(80.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(25.dp))

                            Text(text = "View Products",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card6





                }
                //End of row3









            }
            //End of main card





        }










    }


}

@Composable
@Preview(showBackground = true)
fun DashBoardScreenPreview(){
    DashBoardScreen(rememberNavController())

}
