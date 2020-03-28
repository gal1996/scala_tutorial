object question11 {
  def main(args: Array[String]): Unit = {
    println(Contact("a@a.com", Some("03-1234-5678"), None).toString)
    println(Contact("a@a.com", Some("03-1234-5678"), Some("03-1234-9999")).toString)
    println(Contact("a@a.com", None, None).toString)
  }
}

case class Contact(email: String, tel: Option[String], fax: Option[String]) {
  override def toString: String = {
    var retVal: String = "Contact: "
    retVal = retVal + "email=" + email
    tel match {
      case Some(_) if fax == None => retVal + ", tel=" + tel.get
      case Some(_) if fax != None => retVal + ", tel=" + tel.get + ", fax=" + fax.get
      case None if fax == None => retVal
      case None if fax != None => retVal + ", fax=" + fax.get
    }
  }
}