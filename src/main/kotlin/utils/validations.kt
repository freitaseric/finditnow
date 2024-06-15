package utils

fun isLinux(): Boolean {
    return System.getProperty("os.name").lowercase().contains("linux")
}