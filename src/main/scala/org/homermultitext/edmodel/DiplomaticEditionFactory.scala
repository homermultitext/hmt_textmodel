package org.homermultitext.edmodel


import edu.holycross.shot.ohco2._

/**  Factory to build a diplomatic edition from a Vector
* of [[HmtToken]]s.
*/
object DiplomaticEditionFactory {


/*
  def corpusFromTokens(textRepository: TextRepository): Corpus = {
    Corpus(Vector[CitableNode]())
  }

  def catalogEntries(catalog: Catalog): Corpus = {

  }
*/

  /*
  val tr = TextRepositorySource.fromFiles(repo.textInventory,repo.textConfig,repo.baseDir)
val tokens = TeiReader.fromCorpus(tr.corpus)
val urnList = tokens.map(_.textNode).distinct
val vectvect = for (u <- tokens.map(_.textNode)) yield { tokens.filter(_.textNode == u).map(_.readWithDiplomatic.text) }.distinct

val dipl =  vectvect.map(_.mkString(" ")).mkString("\n")
*/

}
