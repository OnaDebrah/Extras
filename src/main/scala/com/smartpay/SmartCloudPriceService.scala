package com.smartpay

import com.smartpay.Request.requestPrices


object SmartCloudPriceService extends Fixtures {

  def main (args: Array[String] ): Unit = {

    logger.info("APPLICATION STARTED...")
    requestPrices(priceKinds)
  }

}