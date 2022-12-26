package ru.karpenko.petproject1.data.repository

import ru.karpenko.petproject1.data.model.Menu

interface KitchenRepository {

    fun getMenu(): List<Menu>
}