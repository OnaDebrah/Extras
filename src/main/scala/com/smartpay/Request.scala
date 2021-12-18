package com.smartpay

import com.smartpay.Config._
import scala.sys.process._
import scala.language.postfixOps

object Request extends Fixtures {

  def requestPrices(priceKinds: List[String]): Unit = {
    var counter = 0
    do {
      priceKinds.foreach(kind => {
        logger.info(s"REQUESTING PRICES...${kind.toUpperCase}")
        downloadPricesTextFile(kind, configs.url, configs.token, configs.resourcePath, configs.fileName)
        counter += 1
        Thread.sleep(configs.frequency) // 86400 milliseconds will ensure the application run throughout the day without getting "429 Too Many Request message"!
      })
    } while (counter <= configs.quota)
  }

  private def downloadPricesTextFile(kind: String,
                                     url: String,
                                     token: String,
                                     resourcePath: String,
                                     fileName: String): Unit = {
    try {
      val cmd = s"""curl -H "Authorization: Bearer $token" $url/$kind"""
      val maybePrice = prices(cmd !!)
      if (maybePrice.isDefined)
        writeFile(resourcePath, fileName, maybePrice.get)
    } catch {
      case e: Throwable => logger.error(s"$e")
    }
  }

}