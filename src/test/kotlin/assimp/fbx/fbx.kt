package assimp.fbx

import assimp.*
import io.kotlintest.specs.StringSpec

/**
 * Created by elect on 24/01/2017.
 */

class fbx : StringSpec() {

    val path = models + "/FBX/"
    val path_ = modelsNonBsd + "/FBX/"

    init {
        "spider"  { spider(path + "spider.fbx") }
//        "boar man"  { boarMan(path_ + "BoarMan.md5mesh") }
    }
}