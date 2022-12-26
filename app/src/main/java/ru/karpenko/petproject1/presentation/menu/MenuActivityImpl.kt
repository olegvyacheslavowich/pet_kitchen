package ru.karpenko.petproject1.presentation.menu

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import ru.karpenko.petproject1.data.model.Menu
import ru.karpenko.petproject1.databinding.ActivityMenuBinding


class MenuActivityImpl : AppCompatActivity(), MenuActivity {

    private lateinit var binding: ActivityMenuBinding
    private lateinit var presenter: MenuPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = MenuPresenterImpl(this)

        binding.fabSendEmail.setOnClickListener {
            presenter.onSendEmail(binding.editText.text.toString())
        }

        Log.i(MenuActivityImpl::class.simpleName, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(MenuActivityImpl::class.simpleName, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(MenuActivityImpl::class.simpleName, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(MenuActivityImpl::class.simpleName, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(MenuActivityImpl::class.simpleName, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(MenuActivityImpl::class.simpleName, "onDestroy")
    }

    override fun loadMenu(menu: List<Menu>) {

    }

    override fun showMessage(messageId: Int) {
        Snackbar.make(binding.root, getString(messageId), Snackbar.LENGTH_LONG).show()
    }

    override fun showErrorMessage(messageId: Int) {
        Snackbar.make(binding.root, getString(messageId), Snackbar.LENGTH_LONG).show()
    }
}