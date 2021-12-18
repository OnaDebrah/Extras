package com.smartpay

import com.typesafe.scalalogging.LazyLogging
import io.circe.generic.auto._
import io.circe.jawn.decode

import java.io.{BufferedWriter, File, FileWriter}
import scala.language.postfixOps

case class Prices(kind: String,
                  price: Double,
                  timestamp: String)


trait Fixtures extends LazyLogging {

  val priceKinds = List("sc2-micro","sc2-small","sc2-medium","sc2-std-2","sc2-std-4","sc2-std-8","sc2-std-16","sc2-std-32",
    "sc2-himem-2","sc2-himem-4","sc2-himem-8","sc2-himem-16","sc2-himem-32","sc2-hicpu-2","sc2-hicpu-4","sc2-hicpu-8","sc2-hicpu-16","sc2-hicpu-32")




}
