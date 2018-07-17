import com.google.inject.AbstractModule
import java.time.Clock

import services.{InviteService, AtomicInviteService}

class Module extends AbstractModule {

  override def configure() = {
    bind(classOf[Clock]).toInstance(Clock.systemDefaultZone)

    bind(classOf[InviteService]).to(classOf[AtomicInviteService])
  }

}
