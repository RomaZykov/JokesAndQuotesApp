package com.github.johnnysc.jokeapp.data.cache

import io.realm.Realm

/**
 * @author Asatryan on 16.06.2021
 **/
interface RealmProvider {

    fun provide(): Realm
}

