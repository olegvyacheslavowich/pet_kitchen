package ru.karpenko.petproject1.presentation.menu

import ru.karpenko.petproject1.R
import ru.karpenko.petproject1.domain.use_case.GetMenuUseCase


//add rx java
class MenuPresenterImpl(
    private val view: MenuActivity,
) : MenuPresenter {

    private val getMenuUseCase: GetMenuUseCase = GetMenuUseCase()

    override fun onSendEmail(email: String) {
        if (isValidEmail(email)) {
            view.showMessage(R.string.email_sent)
        } else {
            view.showErrorMessage(R.string.email_dont_send)
        }
    }

    override fun loadMenu() {
        val menu = getMenuUseCase.execute()
        view.loadMenu(menu)
    }

    private fun isValidEmail(email: String) = email.trim().isNotEmpty() && email.contains("@")
}
