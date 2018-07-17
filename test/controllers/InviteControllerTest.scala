package controllers

import scala.concurrent.Future
import org.scalatestplus.play._
import play.api.mvc.{ _}
import play.api.test._
import play.api.test.Helpers._
import org.specs2.mock.Mockito
import services.InviteService

class InviteControllerTest extends PlaySpec with Results with Mockito {


  "ControllerComponents#listInvitations GET" should {
    "return proper val" in {
      val controllerComponents = stubControllerComponents()
      val counter = mock[InviteService]
      val controller = new InviteController(controllerComponents, counter)
      val result: Future[Result] = controller.listInvitations().apply(FakeRequest())
      val bodyText: String = contentAsString(result)
      bodyText mustBe "listInvitations"
    }
  }

  "ControllerComponents#createInvitation POST" should {
    "return proper val" in {
      val controllerComponents = stubControllerComponents()
      val counter = mock[InviteService]
      val controller = new InviteController(controllerComponents, counter)
      val result: Future[Result] = controller.createInvitation().apply(FakeRequest())
      val bodyText: String = contentAsString(result)
      bodyText mustBe "createInvitation"
    }
  }

}