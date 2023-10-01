package com.Binary.jettip

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.tooling.preview.Preview
import com.Binary.jettip.Structure.BillForm

@OptIn(ExperimentalComposeUiApi::class)
@SuppressLint("RememberReturnType")
@ExperimentalMaterial3Api
@Preview
@Composable
fun MainContent() {
    val amountOfPeopleToSplitState = remember {
        mutableStateOf(1)
    }
    val tipAmountState = remember {
        mutableStateOf(0.0)
    }
    val totalPerPersonState = remember {
        mutableStateOf(0.0)
    }
    BillForm(
        amountOfPeopleToSplitState = amountOfPeopleToSplitState,
        tipAmountState = tipAmountState,
        totalPerPersonState = totalPerPersonState
    ){
    }
}

