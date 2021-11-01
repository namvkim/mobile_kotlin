package com.example.jetfundamentals.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.example.jetfundamentals.R
import com.example.jetfundamentals.router.BackButtonHandler
import com.example.jetfundamentals.router.JetFundamentalsRouter
import com.example.jetfundamentals.router.Screen

@Composable
fun ExploreButtonsScreen() {
  Column(
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {

    MyButton()
    MyRadioGroup()
    MyFloatingActionButton()

    BackButtonHandler {
      JetFundamentalsRouter.navigateTo(Screen.Navigation)
    }
  }
}

@Composable
fun MyButton() {
  //TODO write your code here
}

@Composable
fun MyRadioGroup() {
  val radioButtons = listOf(0,1,2)
  val selectedButton = remember {
    mutableStateOf(radioButtons.first())
  }

  Column {
    radioButtons.forEach{ index ->
      val isSelected =  index == selectedButton.value
      val colors = RadioButtonDefaults.colors(
        selectedColor = colorResource(id = R.color.colorPrimary),
        unselectedColor = colorResource(id = R.color.colorPrimary),
        disabledColor = Color.LightGray
      )
      RadioButton(
        selected = isSelected,
        onClick = { selectedButton.value = index },
        colors = colors
      )
    }
  }
}

@Composable
fun MyFloatingActionButton() {
  //TODO write your code here
}
