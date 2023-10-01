package com.Binary.jettip

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.tooling.preview.Preview
import com.Binary.jettip.Structure.BillForm

@OptIn(ExperimentalComposeUiApi::class)
@SuppressLint("RememberReturnType")
@ExperimentalMaterial3Api
@Preview
@Composable
fun MainContent() {
    BillForm(){
    }
}

