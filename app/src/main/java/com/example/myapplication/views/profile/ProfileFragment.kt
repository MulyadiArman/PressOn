package com.example.myapplication.views.profile

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.provider.Settings.ACTION_LOCALE_SETTINGS
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.myapplication.BuildConfig
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentProfileBinding
import com.example.myapplication.dialog.MyDialog
import com.example.myapplication.dialog.dynamicDialog
import com.example.myapplication.dialog.hideDialog
import com.example.myapplication.dialog.showProgressDialog
import com.example.myapplication.hawkstorage.HawkStorage
import com.example.myapplication.model.LoginResponse
import com.example.myapplication.model.LogoutResponse
import com.example.myapplication.networking.ApiServices
import com.example.myapplication.views.changepass.ChangePasswordActivity
import com.example.myapplication.views.login.LoginActivity
import com.example.myapplication.views.main.MainActivity
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class ProfileFragment : Fragment() {

    private var binding: FragmentProfileBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
        updateView()
    }

    private fun updateView() {
        TODO("Not yet implemented")
    }

    private fun onClick() {
        TODO("Not yet implemented")
    }
}
//    private fun updateView() {
//        val user = HawkStorage.instance(context).getUser()
//        val imageUrl = BuildConfig.BASE_IMAGE_URL + user.photo
//        Glide.with(requireContext()).load(imageUrl).placeholder(android.R.color.darker_gray).into(binding!!.ivProfile)
//        binding?.tvNameProfile?.text = user.name
//        binding?.tvEmailProfile?.text = user.email
//    }

//    private fun onClick() {
//        binding?.btnChangePassword?.setOnClickListener {
//            context?.startActivity<ChangePasswordActivity>()
//        }
//
//        binding?.btnChangeLanguage?.setOnClickListener {
//            startActivity(Intent(ACTION_LOCALE_SETTINGS))
//        }
//
//        binding?.btnLogout?.setOnClickListener {
//            AlertDialog.Builder(context)
//                .setTitle(getString(R.string.logout))
//                .setMessage(getString(R.string.are_you_sure))
//                .setPositiveButton(getString(R.string.yes)){dialog, _ ->
//                    logoutRequest(dialog)
//                }
//                .setNegativeButton(getString(R.string.no)){dialog, _ ->
//                    dialog.dismiss()
//                }
//                .show()
//        }
//    }

//    private fun logoutRequest(dialog: DialogInterface?) {
//        val token = HawkStorage.instance(context).getToken()
//        val myDialog = MyDialog(showProgressDialog(context))
//        ApiServices.getLiveAttendanceServices()
//            .logoutRequest("Bearer $token")

//            .enqueue(object :Callback<LogoutResponse!>{
//                override fun onResponse(
//                    call: Call<LogoutResponse>,
//                    response: Response<LogoutResponse>
//                ) {
//                    dialog?.dismiss()
//                    MyDialog(hideDialog())
//                    if (response.isSuccessful){
//                        HawkStorage.instance(context).deleteAll()
//                        (activity as MainActivity).finishAffinity()
//                        context?.startActivity<LoginActivity>()
//                    }else{
//                        MyDialog(dynamicDialog(context, getString(R.string.alert), getString(R.string.something_wrong)))
////                        MyDialog.dynamicDialog(context, getString(R.string.alert), getString(R.string.something_wrong))
//                    }
//                }

//                fun onFailure(call: Call<LogoutResponse>, t: Throwable) {
//                    dialog?.dismiss()
//                    MyDialog(hideDialog())
//                    MyDialog(dynamicDialog(context, getString(R.string.alert), "Error: ${t.message}"))
//
//                }
//
//            }






