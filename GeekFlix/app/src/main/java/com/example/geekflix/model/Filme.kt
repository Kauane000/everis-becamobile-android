package com.example.geekflix.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName


data class Filme(
    @SerializedName("original_name") var original_name: String?,
    @SerializedName("poster_path") var poster_path: String?,
    @SerializedName("original_title") var original_title: String?,
    @SerializedName("overview") var overview: String?,
    @SerializedName("id") var id_filme: String?,
    @SerializedName("release_date") var release_date: String?,
    @SerializedName("popularity") var popularity: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(original_name)
        parcel.writeString(poster_path)
        parcel.writeString(original_title)
        parcel.writeString(overview)
        parcel.writeString(id_filme)
        parcel.writeString(release_date)
        parcel.writeString(popularity)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Filme> {
        override fun createFromParcel(parcel: Parcel): Filme {
            return Filme(parcel)
        }

        override fun newArray(size: Int): Array<Filme?> {
            return arrayOfNulls(size)
        }
    }
}