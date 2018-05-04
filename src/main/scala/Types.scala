package colortypes.types

abstract class Colorant[T] {
  val entries: Int
}

abstract class Color[T] extends Colorant[T]

abstract class AbstractRGB[T] extends Color[T] {
  val entries = 3
}

abstract class TransparentColor[C <: Color[T], T] extends Colorant[T] 

abstract class AlphaColor[C <: Color[T], T] extends TransparentColor[C, T]

abstract class ColorAlpha[C <: Color[T], T] extends TransparentColor[C, T]


abstract class AbstractGray[T] extends Color[T] { val entries = 1 }
abstract class Color3[T] extends Color[T] { val entries = 3 }
abstract class TransparentGray[C <: AbstractGray[T], T] extends TransparentColor[C, T] { val entries = 2 }
abstract class Transparent3[C <: Color3[T], T] extends TransparentColor[C, T] { val entries = 4 }
abstract class TransparentRGB[C <:AbstractRGB[T], T] extends TransparentColor[C, T] { val entries = 4 }

