package info.mdhs.mods.civilmagicks.client.util

//TODO: fix ha
object ColorUtil {

  def hex2RgbT(color: Int): (Int, Int, Int) = {

    val r = (color & 0xFF0000) >> 16
    val g = (color & 0xFF00) >> 8
    val b = (color & 0xFF)

    (r << 16, g << 8, b)
  }

  def hex2RgbI(color: Int): Int = {
    val r = hex2RgbT(color)._1
    val g = hex2RgbT(color)._2
    val b = hex2RgbT(color)._3

    r | g | b
  }

}
