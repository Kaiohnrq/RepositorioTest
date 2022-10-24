package com.repositoriotest.mainactivity.core.toast

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.repositoriotest.mainactivity.R
import com.repositoriotest.mainactivity.databinding.FragmentToastSnakeBinding
import com.repositoriotest.mainactivity.util.toast

class ToastSnakeFragment : Fragment(R.layout.fragment_toast_snake) {

    private lateinit var binding: FragmentToastSnakeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED

        binding = FragmentToastSnakeBinding.bind(view)

        binding.toast.setOnClickListener{
            val msg = "Minha mensagem para voce!"
            Toast
                .makeText(requireContext(), msg, Toast.LENGTH_SHORT)
                .show()
        }


        binding.snake.setOnClickListener {
            Snackbar.make(view, "Oi snake", Snackbar.LENGTH_SHORT).show()
        }

        binding.snakeAction.setOnClickListener {
            Snackbar
                .make(view, "Snake with action", Snackbar.LENGTH_SHORT)
                .setAction(R.string.ok) { toast("I am a snake") }
                .show()
        }
    }




}