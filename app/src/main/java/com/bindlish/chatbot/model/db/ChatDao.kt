package com.bindlish.chatbot.model.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.bindlish.chatbot.model.Message
import io.reactivex.Single

/**
 * Created by Aman Bindlish on 18,September,2019
 */
@Dao
interface ChatDao {

    @Query("SELECT * FROM Message WHERE userName IN (:userName)")
    fun getChatsByUser(userName: String): Single<List<Message>>

    @Insert
    fun insertChat(msg: Message)
}