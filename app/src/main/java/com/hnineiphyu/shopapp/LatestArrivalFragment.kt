package com.hnineiphyu.shopapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hnineiphyu.shopapp.adapter.LatestArrivalAdapter
import com.hnineiphyu.shopapp.model.LatestModel

/**
 * A simple [Fragment] subclass.
 */
class LatestArrivalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_latest_arrival, container, false)
        var view = inflater.inflate(R.layout.fragment_latest_arrival, container, false)

        var LatestRecyclerView = view.findViewById<RecyclerView>(R.id.recycler_latest)

        var lartestList = ArrayList<LatestModel>()

        lartestList.add(LatestModel("Hyde Park","N41015 ", "LOUIS VUITTON",9999999.0, R.drawable.bag,"211000KS",4.0))
        lartestList.add(LatestModel("HORNS PINK LONG","SLEEVE T SHIRT","Lady Gaga", 72000.0, R.drawable.tshirt,"",5.0))
        lartestList.add(LatestModel("IPhone 11 Pro Max","","Apple", 2500000.0, R.drawable.iphone11, "",6.0))

        var latestarrivaladapter = LatestArrivalAdapter(lartestList)

        LatestRecyclerView.layoutManager = LinearLayoutManager (context, LinearLayoutManager.HORIZONTAL, false)

        LatestRecyclerView.adapter = latestarrivaladapter

        return view
    }

}
