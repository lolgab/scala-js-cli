package org.scalajs.cli.internal

import org.scalajs.linker.interface._

object ScalaJs116Specific {
  implicit class WithMinify(val config: StandardConfig) extends AnyVal {
    def withMinify(value: Boolean): StandardConfig = config
  }
}
