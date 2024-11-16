package com.learningroots.bottombar

/**
 * Author: Santosh Yadav
 * Created on: 16-10-2024 17:22
 */
sealed class Screen(val rout: String) {
    object Home: Screen("home_screen")
    object Profile: Screen("profile_screen")
    object Cart: Screen("cart_screen")
    object Setting: Screen("setting_screen")
}