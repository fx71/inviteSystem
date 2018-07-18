package controllers

import scala.concurrent.Future
import org.scalatestplus.play._
import play.api.mvc._
import play.api.test._
import play.api.test.Helpers._
import org.specs2.mock.Mockito
import org.scalatest.BeforeAndAfter
import services.InviteService

class InviteControllerTest extends PlaySpec with Results with Mockito with BeforeAndAfter {

  var controllerComponents: ControllerComponents = _
  var inviteService:InviteService = _
  var controller:InviteController = _

  before {
    controllerComponents = stubControllerComponents()
    inviteService = mock[InviteService]
    controller = new InviteController(controllerComponents, inviteService)
  }

  "ControllerComponents#listInvitations GET" should {
    "return proper val" in {
      //When
      val result: Future[Result] = controller.listInvitations().apply(FakeRequest())
      //Then
      val bodyText: String = contentAsString(result)
      bodyText mustBe "listInvitations"
    }
  }

  "ControllerComponents#listInvitations " should {
    "return Ok type when success" in {
      //When
      val result: Future[Result] = controller.listInvitations().apply(FakeRequest())
      //Then
      status(result) mustBe OK
    }
  }

  "ControllerComponents#createInvitation POST" should {
    "return proper val" in {
      //When
      val result: Future[Result] = controller.createInvitation().apply(FakeRequest())
      //Then
      val bodyText: String = contentAsString(result)
      bodyText mustBe "createInvitation"
    }
  }

  "ControllerComponents#createInvitation" should {
    "return Created type when success" in {
      //When
      val result: Future[Result] = controller.createInvitation().apply(FakeRequest())
      //Then
      status(result) mustBe CREATED
    }
  }


}