package com.sublime.niaclone.ui

import androidx.navigation.NavHostController

/**
 * Routes for the different destinations in the application. Each of these destinations can contain
 * one or more screens (based on the window size). Navigation from one screen to the next within a
 * single destination will be handled directly in Compose, not using the Navigation component.
 */
object NiaDestinations {
    const val FOR_YOU_ROUTE = "for_you"
    const val EPISODES_ROUTE = "episodes"
    const val SAVED_ROUTE = "saved"
    const val TOPICS_ROUTE = "topics"
}

/**
 * Models the navigation actions in the app.
 */
class NiaNavigationActions(private val navController: NavHostController) {
    fun navigateToTopLevelDestination(route: String) {
        navController.navigate(route) {
            launchSingleTop = true
            navController.graph.startDestinationRoute?.let { popUpTo(it) }
        }
    }
}