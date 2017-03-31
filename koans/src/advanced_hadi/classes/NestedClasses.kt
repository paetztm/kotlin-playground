package advanced_hadi.classes

/**
 * Created by paetztm on 3/31/2017.
 */


class DirectoryExplorer(val user: String) {
    inner class PermissionCheck {
        fun validatePermission() {
            if (user != "Tim") {

            }
        }

    }

    fun listFolder(folder: String, user: String) {
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }
}


fun main(args: Array<String>) {
    val de = DirectoryExplorer("Tim")
    val pc = de.PermissionCheck()
}