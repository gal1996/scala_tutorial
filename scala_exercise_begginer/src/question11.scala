object question11 {
  def main(args: Array[String]): Unit = {
    println(Contact("a@a.com", Some("03-1234-5678"), None).toString)
    println(Contact("a@a.com", Some("03-1234-5678"), Some("03-1234-9999")).toString)
    println(Contact("a@a.com", None, Some("03-1234-9999")).toString)
    println(Contact("a@a.com", None, None).toString)
  }
}

case class Contact(email: String, tel: Option[String], fax: Option[String]) {
  override def toString: String = {
    "Contact: email=" + email + tel.fold("")(t => ", tel="+t) + fax.fold("")(f => ", fax="+f)
  }
}