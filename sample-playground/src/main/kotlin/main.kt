import kotlinx.browser.document
import kotlinx.html.button
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.js.onClickFunction
import window.getAllWindows

fun main() {
    document.body!!.append.div {
        button {
            +"Click ME"
            onClickFunction = { test() }
        }
    }
}

fun test() {
    getAllWindows.then {

    }
}