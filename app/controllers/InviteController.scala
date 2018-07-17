package controllers

import javax.inject._
import play.api.mvc._
import services.{InviteService}

/**
 * This controller is responsible for managing invitation in system,
 */
@Singleton
class InviteController @Inject()(cc: ControllerComponents,
                                 inviteService: InviteService) extends AbstractController(cc) {

  /**
    * Lists all invitations
   */
  def listInvitations = Action { Ok("listInvitations") }

  /**
    * Adds new invitation
    */
  def createInvitation = Action { Created("createInvitation") }

}
