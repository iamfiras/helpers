package views.html.semanticuiformhelper

import views.html.helper._

object helper {
	implicit val emailinput = new FieldConstructor {
		def apply(elements: FieldElements) = textinput(elements, "user", true)
	}
	implicit val passwordinput = new FieldConstructor {
		def apply(elements: FieldElements) = textinput(elements, "lock", true)
	}
}