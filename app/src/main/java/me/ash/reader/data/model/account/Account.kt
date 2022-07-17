package me.ash.reader.data.model.account

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 * In the application, at least one account exists and different accounts
 * can have the same feeds and articles.
 */
@Entity(tableName = "account")
data class Account(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo
    var name: String,
    @ColumnInfo
    var type: AccountType,
    @ColumnInfo
    var updateAt: Date? = null,
    @ColumnInfo
    var syncOnStart: Boolean = false,
    @ColumnInfo
    var onlyOnWiFi: Boolean = false,
    @ColumnInfo
    var onlyWhenCharging: Boolean = false,
    @ColumnInfo(defaultValue = "0")
    var keep: Long = 0,
    @ColumnInfo(defaultValue = "NULL")
    var blockList: BlockList? = null,
)
