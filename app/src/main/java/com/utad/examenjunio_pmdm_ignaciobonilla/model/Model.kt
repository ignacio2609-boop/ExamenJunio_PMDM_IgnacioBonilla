package com.utad.examenjunio_pmdm_ignaciobonilla.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Parcelize
data class Model(
    @SerializedName("recipes") val recipes: List<DatosReceta>

): Parcelable {
    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        TODO("Not yet implemented")
    }
}
