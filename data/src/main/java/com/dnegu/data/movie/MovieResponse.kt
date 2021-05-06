package com.dnegu.data.movie

import com.dnegu.data.network.RoomMapper

data class MovieResponse (
    val id:Int?=0,
    val poster_path:String?="",
    val original_title:String?="",
    val vote_average:Double?=0.0,
    val release_date:String?="",
    val overview:String?=""
): RoomMapper<MovieEntity> {
    override fun mapToRoomEntity(): MovieEntity {
        return MovieEntity(id,poster_path,original_title,vote_average,release_date,overview)
    }
}