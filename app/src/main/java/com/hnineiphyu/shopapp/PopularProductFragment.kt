package com.hnineiphyu.shopapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hnineiphyu.shopapp.adapter.PopularAdapter
import com.hnineiphyu.shopapp.model.PopularModel
import java.util.ArrayList

/**
 * A simple [Fragment] subclass.
 */
class PopularProductFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_popular_product, container, false)

        var view = inflater.inflate(R.layout.fragment_popular_product, container, false)

        var productRecyclerView: RecyclerView = view.findViewById(R.id.recycler_popular)

        var popularList = ArrayList<PopularModel>()

        popularList.add(PopularModel("NEW","30% off", "Iphone 11 pro max", "Apple", 980000.0, R.drawable.iphone11promax,"110000KS", 5.0))
        popularList.add(PopularModel("NEW","34% off", "GhostedBed 11 inch Cooling Gel Memory Foam......", "GhostBed", 359000.0, R.drawable.bed, "49600KS", 5.0))
        popularList.add(PopularModel("0", "0", "Nintendo Switch-Neon Blue and Red Joy-Con", "Nintendo", 359000.0, R.drawable.nintendotwo, "", 4.0))
        popularList.add(PopularModel("NEW", "0","BELAROI Womens Comfy Swing Tunic Short.....", "Belaroi", 18990.0, R.drawable.swingtunic, "", 4.0))

        var popularAdapter = PopularAdapter(popularList )

        productRecyclerView.layoutManager = LinearLayoutManager(context)

        productRecyclerView.adapter = popularAdapter

        return view
    }

}
