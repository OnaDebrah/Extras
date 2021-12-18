package com.smartpay


sealed trait Kind
case class SC2Micro(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Small(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Medium(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Std2(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Std4(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Std8(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Std16(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Std32(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Himem2(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Himem4(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Himem8(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Himem16(kind: String, price: Double, timestamp: String) extends Kind
case class SC2Himem32(kind: String, price: Double, timestamp: String) extends Kind
case class SC2hicpu2(kind: String, price: Double, timestamp: String) extends Kind
case class SC2hicpu4(kind: String, price: Double, timestamp: String) extends Kind
case class SC2hicpu8(kind: String, price: Double, timestamp: String) extends Kind
case class SC2hicpu16(kind: String, price: Double, timestamp: String) extends Kind
case class SC2hicpu32(kind: String, price: Double, timestamp: String) extends Kind
case class Prices(kind: String, price: Double, timestamp: String) extends Kind

object SmartMain extends Fixtures {

  def main (args: Array[String] ): Unit = {

    val o = downloadPrices("sc2-small", configs.url, configs.token)

    println(prices(o))
    println(o)
    println(o)
  }

}