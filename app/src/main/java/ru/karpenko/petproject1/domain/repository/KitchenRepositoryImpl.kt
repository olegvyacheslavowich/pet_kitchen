package ru.karpenko.petproject1.domain.repository

import ru.karpenko.petproject1.data.model.Menu
import ru.karpenko.petproject1.data.repository.KitchenRepository

class KitchenRepositoryImpl: KitchenRepository {
    override fun getMenu(): List<Menu> = emptyList()
}