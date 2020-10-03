package ru.skillbranch.devintensive.utils

object Utils {

    fun parseFullName(fullName: String?):Pair<String?, String?>{

        val parts : List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return ( if (firstName ==  " " || firstName ==  "" || firstName ==  null) null else firstName) to ( if (lastName ==  " " || lastName ==  "" ||lastName ==  null) null  else lastName)

    }

    fun transliteration(payload: String, divider: String =" ") {


    }

    fun toInitials(firstName: String?, lastName: String?): String? {

        return (((if ((firstName.isNullOrEmpty() && lastName.isNullOrEmpty()) || (firstName ==" " && lastName ==" ")) { null
        } else {
            if (!firstName.isNullOrEmpty()&&(lastName.isNullOrEmpty() || lastName ==" ")) {("${firstName?.substring(0,1)?.toUpperCase()}")
            }
            else{
                if((firstName.isNullOrEmpty() || firstName==" ")&& !lastName.isNullOrEmpty()) {("${lastName?.substring(0,1)?.toUpperCase()}")
                }
                else {
                    ("${firstName?.substring(0,1)?.toUpperCase()}${lastName?.substring(0,1)?.toUpperCase()}")
                }
            }})).toString())
    }
}