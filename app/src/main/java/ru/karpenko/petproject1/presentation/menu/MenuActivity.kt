package ru.karpenko.petproject1.presentation.menu

import ru.karpenko.petproject1.data.model.Menu
import ru.karpenko.petproject1.presentation.Activity

interface MenuActivity : Activity {

    fun loadMenu(menu: List<Menu>)

}