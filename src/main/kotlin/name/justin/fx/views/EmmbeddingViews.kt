package name.justin.fx.views

import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import tornadofx.*


class MasterView: View() {
    private val topView: TopView by inject() // injection dependency
    private val bottomView: BottomView by inject()

    //val topView = find(TopView::class) // singleton
    //val bottomView = find(BottomView::class)

    override val root = BorderPane()

    init {
        with(root) {
            top = topView.root
            bottom = bottomView.root
        }
    }
}

class TopView: View() {
    override val root = Label("Top View")
}

class BottomView: View() {
    override val root = Label("Bottom View")

}
