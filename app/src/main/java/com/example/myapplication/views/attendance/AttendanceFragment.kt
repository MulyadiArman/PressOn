package com.example.myapplication.views.attendance

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentAttendanceBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class AttendanceFragment : Fragment(), OnMapReadyCallback {

    private var mapAttendance: SupportMapFragment? = null
    private var map: GoogleMap? = null
    private var binding: FragmentAttendanceBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_attendance, container, false)
    //{
////        binding = FragmentAttendanceBinding.inflate( inflater, container, false)
////        return binding?.root
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupMaps()
    }

    private fun setupMaps() {
        mapAttendance = childFragmentManager.findFragmentById(R.id.map_attendance) as SupportMapFragment
        mapAttendance?.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        //Coordinate Bisa di ganti sesuai tempat teman-teman masing-masing
        val sydney = LatLng(-1.154359, 116.889694)
        map?.addMarker(
            MarkerOptions()
                .position(sydney)
                .title("Marker in Sydney")
        )
        map?.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        map?.animateCamera(CameraUpdateFactory.zoomTo(20f))
    }

}