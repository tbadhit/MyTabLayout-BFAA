package com.tbadhit.mytablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tbadhit.mytablayout.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    // (1)
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    //-----

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // (1)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
        //-----
    }

    // (1)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvLable = binding.sectionLabel
        // (index) = mendapatkan data yang dikirimkan
        val index = arguments?.getInt(ARG_SECTION_NUMBER, 0)

        tvLable.text = getString(R.string.content_tab_text, index)

    }

    // (1)
    companion object {
        private const val ARG_SECTION_NUMBER = "section_number"

        @JvmStatic
        fun newInstance(index: Int) =
            HomeFragment().apply {
                // arguments = digunakan untuk mengirimkan data bundle tersebut ke fragment.
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, index)
                }
            }
    }
    //-----
}