package akka.contrib.persistence.mongodb

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CasbahPersistenceJournalTckSpec extends JournalTckSpec {
  override def extensionClass: Class[_] = classOf[CasbahPersistenceExtension]
}