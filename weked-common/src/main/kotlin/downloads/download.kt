package downloads

import SingleParameterCallback
import kotlin.js.Promise

external class Downloads {
    val onChanged: SingleParameterCallback<DownloadDelta>
    val onCreated: SingleParameterCallback<DownloadItem>
    val onErased: SingleParameterCallback<Int>

    fun download(options: DownloadOptions): Promise<Int>
    fun search(options: DownloadQuery): Promise<Array<DownloadItem>>
    fun getFileIcon(id: Int, options: FileIconOptions?): Promise<String>
    fun erase(options: DownloadQuery): Promise<Array<Int>>
    fun pause(id: Int): Promise<Unit>
    fun resume(id: Int): Promise<Unit>
    fun cancel(id: Int): Promise<Unit>
    fun open(id: Int): Promise<Unit>
    fun show(id: Int): Promise<Boolean>
    fun showDefaultFolder()
    fun removeFile(id: Int): Promise<Unit>
    fun acceptDanger(id: Int): Promise<Unit>
}