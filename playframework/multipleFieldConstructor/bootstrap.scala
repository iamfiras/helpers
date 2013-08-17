package views

import views.html.helper._

/*
 * Some examples of different fields we can create using FieldConstructor.
 * - For text input group we give the constructor the character(s) that we want to display.
 * - For icon input group we give the constructor the glyphicon class of the icon that we want to display.
 */

object bootstrap {
	implicit val addressinputgroup = new FieldConstructor {
		def apply(elements: FieldElements) = textinputgroup(elements, "@")
	}
	
	implicit val passwordinputgroup = new FieldConstructor {
		def apply(elements: FieldElements) = textinputgroup(elements, "*")
	}
	
	implicit val lockiconinputgroup = new FieldConstructor {
		def apply(elements: FieldElements) = iconinputgroup(elements, "glyphicon-lock")
	}
	
	implicit val usericoninputgroup = new FieldConstructor {
		def apply(elements: FieldElements) = iconinputgroup(elements, "glyphicon-user")
	}
	
	implicit val envelopeiconinputgroup = new FieldConstructor {
		def apply(elements: FieldElements) = iconinputgroup(elements, "glyphicon-envelope")
	}
}