package com.linggash.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.linggash.mynavigation.databinding.FragmentDetailCategoryBinding

class DetailCategoryFragment : Fragment() {

    private var _binding: FragmentDetailCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailCategoryBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val dataName = arguments?.getString(CategoryFragment.EXTRA_NAME)                  // replaced with safeargs
//        val dataDescription = arguments?.getLong(CategoryFragment.EXTRA_STOCK)
        val dataName = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).name
        val dataDescription = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).stock

        binding.tvCategoryName.text = dataName
        binding.tvCategoryDescription.text = "Stock: $dataDescription"
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}