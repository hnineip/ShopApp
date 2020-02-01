package com.hnineiphyu.shopapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hnineiphyu.shopapp.adapter.CountryAdapter
import com.hnineiphyu.shopapp.model.countryModel
import java.util.ArrayList

/**
 * A simple [Fragment] subclass.
 */
class CountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_country, container, false)

        var view = inflater.inflate(R.layout.fragment_country, container, false)


        var countryRecyclerView: RecyclerView = view.findViewById(R.id.recycler_country)

        var countryList = ArrayList<countryModel>()

        countryList.add(countryModel("Japan", R.drawable.japanone))
        countryList.add(countryModel("Korea", R.drawable.korea1))
        countryList.add(countryModel("China", R.drawable.china))
        countryList.add(countryModel("International", R.drawable.worldtrade))

        var countryAdapter = CountryAdapter(countryList)

        countryRecyclerView.layoutManager = GridLayoutManager(context,2)

        countryRecyclerView.adapter = countryAdapter

        return view
    }


}
