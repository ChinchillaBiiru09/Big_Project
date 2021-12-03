package com.example.big_project_apps.Logic

class models (
    id: Int,
    name: String,
    pass: String
        ) {
    var id: Int = id
    var name: String = name
    var pass: String = pass

    public fun getID(): Int{
        return this.id
    }

    public fun setID(id: Int){
        this.id = id
    }

    @JvmName("getName1")
    public fun getName(): String{
        return this.name
    }

    @JvmName("setName1")
    public fun setName(name: String){
        this.name = name
    }

    @JvmName("getPass1")
    public fun getPass(): String{
        return this.pass
    }

    @JvmName("setPass1")
    public fun setPass(pass: String){
        this.pass = pass
    }
}