package ru.karpenko.petproject1.domain.use_case

import ru.karpenko.petproject1.data.model.Menu
import ru.karpenko.petproject1.data.repository.KitchenRepository
import ru.karpenko.petproject1.domain.repository.KitchenRepositoryImpl

class GetMenuUseCase {

    private val kitchenRepository: KitchenRepository = KitchenRepositoryImpl()

    fun execute(): List<Menu> = kitchenRepository.getMenu()
}