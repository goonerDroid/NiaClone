package com.sublime.niaclone.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

/**
 * Top-level navigation graph. Navigation is organized as explained at
 * https://d.android.com/jetpack/compose/nav-adaptive
 *
 * The navigation graph defined in this file defines the different top level routes. Navigation
 * within each route is handled using state and Back Handlers.
 */
@Composable
fun NiaNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = NiaDestinations.FOR_YOU_ROUTE
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(NiaDestinations.FOR_YOU_ROUTE) {
            Text("FOR YOU", modifier)
        }
        composable(NiaDestinations.EPISODES_ROUTE) {
            Text("EPISODES", modifier)
        }
        composable(NiaDestinations.SAVED_ROUTE) {
            Text("SAVED", modifier)
        }
        composable(NiaDestinations.TOPICS_ROUTE) {
            Text("TOPICS", modifier)
        }
    }
}