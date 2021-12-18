import com.smartpay.Request._
import com.smartpay.Config._
import org.scalatest.funspec.AsyncFunSpecLike
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import scala.sys.process._
import scala.language.postfixOps

class SmartCloudPriceServiceSpec extends AsyncFunSpecLike {

val jsonStr = "{\"kind\":\"sc2-micro\",\"price\":0.763,\"timestamp\":\"2021-12-16T13:27:00.856Z\"}"

  describe("SmartCloudPriceServiceSpec"){

    it("Download price for a valid given token and url"){
      val kind = "sc2-micro"
      val cmd = s"""curl -H "Authorization: Bearer ${configs.token}" ${configs.url}/$kind"""
      val maybePrice = prices(cmd !!)
     maybePrice.isDefined shouldBe true
      }

    it("Verify that json is rightly passed"){

    val price = prices(jsonStr).get
      price.kind shouldBe "sc2-micro"
      price.price shouldBe 0.763
      price.timestamp shouldBe "2021-12-16T13:27:00.856Z"
    }
  }

}
