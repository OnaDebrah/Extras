package com.smartpay

case class Config(token: String,
                  url: String,
                  resourcePath: String,
                  fileName: String,
                  quota: Int,
                  frequency: Int
                 )

object Config {

  private val token = "lxwmuKofnxMxz6O2QE1Ogh"
  private val url = "http://localhost:9999/instances"
  private val fileName = "prices"
  private val resourcePath = "src/main/resources"
  private val quota = 1000
  private val frequency = 5000

  val configs: Config = createConfig(token, url, resourcePath, fileName, quota, frequency)

  private def createConfig(token: String,
                           url: String,
                           resourcePath: String,
                           fileName: String, quota: Int, frequency: Int): Config = Config(token, url, resourcePath, fileName, quota, frequency)


}
