package models

import play.api.Play.current
import play.api.db.DB

/**
 * Created by caorong on 15-5-9.
 */
object MyDB {

  val ds = DB.getDataSource("default")

  def run = {
    println(123)

    val conn = DB.getConnection()
    val stmt = conn.createStatement

    val rs = stmt.executeQuery("SELECT * from tb_pic")

    var outString = "num => "
    while (rs.next()) {
      outString += rs.getString("pgid")
    }

    println(outString)


  }

}
