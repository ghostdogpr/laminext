package app.tulz.tailwind

import app.tulz.tailwind.ops.htmlelement.ReactiveHtmlElementTailwindOps
import app.tulz.tailwind.ops.svgelement.ReactiveSvgElementTailwindOps
import com.raquo.laminar.nodes.ReactiveHtmlElement
import com.raquo.laminar.nodes.ReactiveSvgElement
import org.scalajs.dom

trait BaseSyntax {

  implicit def syntaxReactiveHtmlElementTailwind[T <: dom.html.Element](
    el: ReactiveHtmlElement[T]
  ): ReactiveHtmlElementTailwindOps[T] = new ReactiveHtmlElementTailwindOps[T](el)

  implicit def syntaxReactiveSvgElementTailwind[T <: dom.svg.Element](
    el: ReactiveSvgElement[T]
  ): ReactiveSvgElementTailwindOps[T] = new ReactiveSvgElementTailwindOps[T](el)

}

object BaseSyntax extends BaseSyntax