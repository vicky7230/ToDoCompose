package com.vicky7230.todocompose.navigation

import androidx.navigation.NavHostController
import com.vicky7230.todocompose.util.Action
import com.vicky7230.todocompose.util.Constants.LIST_SCREEN

class Screens(navHostController: NavHostController) {

    val list: (Action) -> Unit = { action ->
        navHostController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navHostController.navigate("task/$taskId")
    }
}