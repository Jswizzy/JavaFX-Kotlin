package name.justin.fx

import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import name.justin.fx.views.MasterView
import tornadofx.*

class MyApp: App(MasterView::class)

class MyView: View() {
    override val root = VBox()

    init {
        root += Button("Press Me")
        root += Label("Waiting")
    }
}
