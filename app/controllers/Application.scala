package controllers

import models.MyDB
import play.api.http.ContentTypes

import play.api.libs.iteratee.Enumerator
import play.api.mvc._
import play.api.libs.json._


object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }


  //  val echo = Action { request =>
  //    Ok(s"Got request [$request]")
  //  }
  //
  //  println(echo)
  //
  //  Action(parse.json) { implicit request =>
  //    Ok("Got request [" + request + "]")
  //  }


  def hello(name: String) = Action {
    Ok("Hello " + name).as(HTML)
  }

  def list(page: Int) = Action {
    val json: JsValue = Json.parse( s"""
{
  "name" : "Watership Down",
  "location" : {
    "lat" : 51.235685,
    "long" : -1.309197
  },
  "residents" : [ {
    "name" : "Fiver",
    "age" : 4,
    "role" : null
  }, {
    "name" : "Bigwig",
    "age" : 6,
    "role" : "Owsla"
  } ],
  "clientinfo": $page
}""")

    MyDB.run

    Result(
      header = ResponseHeader(200, Map(CONTENT_TYPE -> ContentTypes.JSON)),
      // body = Enumerator(s"Hello world $page !".getBytes())
      body = Enumerator(s"$json".getBytes())
    )

  }

  def listoptional(version: Option[String]) = Action {
    Ok(s"version = $version").as(JSON)
  }

  def show(page: String) = Action {
    //    loadContentFromDatabase(page).map { htmlContent =>
    //      Ok(htmlContent).as("text/html")
    //    }.getOrElse(NotFound)
    NotFound
  }

  def index1 = Action {
    Result(
      header = ResponseHeader(200, Map(CONTENT_TYPE -> "text/plain")),
      body = Enumerator("Hello world!".getBytes())
    )
  }

  def indexr = Action {
    Redirect("/user/home")
    Redirect("/user/home", MOVED_PERMANENTLY)
  }

  def feed(pno: Int) = TODO


//  val ds = DB.getDataSource("default")
//
//  val run = {
//    println(123)
//  }

}