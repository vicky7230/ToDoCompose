package com.vicky7230.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.vicky7230.todocompose.navigation.destinations.listComposable
import com.vicky7230.todocompose.navigation.destinations.taskComposable
import com.vicky7230.todocompose.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(navHostController: NavHostController) {

    val screen = remember(navHostController) {
        Screens(navHostController = navHostController)
    }

    NavHost(
        navController = navHostController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable (
            navigateToListScreen = screen.list
        )
    }
}