package com.nerostarx.sntf.ui.map

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.libraries.places.api.Places
import com.nerostarx.sntf.R

class MapFragment : Fragment(), OnMapReadyCallback {

    private lateinit var viewModel: MapViewModel
    private val API_KEY = "your api key here"
    private lateinit var mapView: MapView
    private lateinit var gMap:GoogleMap

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mapView = requireActivity().findViewById(R.id.map_drag)
        mapView.onCreate(savedInstanceState)
        Places.initialize(requireContext(), API_KEY)
        mapView.getMapAsync(this)
    }

    override fun onMapReady(p0: GoogleMap?) {
        gMap = p0!!
        val algiers = LatLng(36.7525, 3.04197)
        gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(algiers, 10f))


    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onPause() {
        mapView.onPause()
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onDestroy() {
        mapView.onDestroy()
        super.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

}