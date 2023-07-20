package com.example.d.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.d.R
import com.example.d.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    private val binding get() = _binding!!
//    lateinit var myRecyclerView: RecyclerView
//    lateinit var myArrayList : ArrayList<Products>

//    lateinit var adapter: MyAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {

        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)


        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSlideshow
        slideshowViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        dataInitialize()
//
//        val layoutManager = LinearLayoutManager(context)
//        myRecyclerView.layoutManager = layoutManager
//        myRecyclerView.setHasFixedSize(true)
//        adapter = MyAdapter(myArrayList,this)
//        myRecyclerView.adapter = adapter
//
//    }

//private fun dataInitialize (){
//
//    myArrayList = arrayListOf<Products>()
//
//    val myProducts = arrayOf(
//        R.drawable.img2,
//        R.drawable.img3,
//        R.drawable.img4,
//        R.drawable.img5,
//        R.drawable.img6,
//        R.drawable.img7,
//        R.drawable.img8,
//        R.drawable.img9,
//        R.drawable.img1,
//    )
//
//    for (index in myProducts.indices){
//        val product = Products(myProducts[index])
//        myArrayList.add(product)
//    }
//
//}

}
