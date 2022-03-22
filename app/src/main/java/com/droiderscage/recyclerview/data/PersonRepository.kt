package com.droiderscage.recyclerview.data
 import com.droiderscage.recyclerview.data.Person

class PersonRepository {
    // This should contain ROOM methods or remote API fun that deals with saving and retrieving data
    // break the above strategy and ignore the image param below for a while...
    fun getPersonData(): ArrayList<Person> = arrayListOf(
        Person("Felix", "felix45@gmail.com",0),
        Person("Jeniffer", "jen@gmail.com", 0),
        Person("Simon", "symons@gmail.com", 0),
        Person("Felix", "felix45@gmail.com",0),
        Person("Jeniffer", "jen@gmail.com", 0),
        Person("Simon", "symons@gmail.com", 0),
        Person("Felix", "felix45@gmail.com",0),
        Person("Jeniffer", "jen@gmail.com", 0),
        Person("Simon", "symons@gmail.com", 0),
        Person("Felix", "felix45@gmail.com",0),
        Person("Jeniffer", "jen@gmail.com", 0),
        Person("Simon", "symons@gmail.com", 0),
    )
}