package org.homermultitext.edmodel

import edu.holycross.shot.ohco2._
import edu.holycross.shot.cite._

import org.scalatest.FlatSpec


class MultiformNormalizedReaderSpec extends FlatSpec {


val schUrn = CtsUrn("urn:cts:greekLit:tlg5026.msAint.hmt_xml:1.32.comment")
val schText = """<div n="comment" xmlns="http://www.tei-c.org/ns/1.0" xmlns:xd="http://www.oxygenxml.com/ns/doc/xsl"> <p>δέχθαι ἄποινα ἀπαρέμφατον ἀντὶ <choice> <abbr>προστ</abbr> <expan>προστακτικοῦ</expan> </choice> ἰστέον ὅτι τὸ παλαιὸν ἡ <placeName n="urn:cite2:hmt:place.r1:place36">Πελοπόννησος</placeName> εἰς <num value="5">ε</num> διηπεῖτο μοίρας~ <placeName n="urn:cite2:hmt:place.r1:place40">Αργολικὴν</placeName> <placeName n="urn:cite2:hmt:place.r1:place41">Πυλικὴν</placeName> <placeName n="urn:cite2:hmt:place.r1:place53">Λακονικὴν</placeName> <placeName n="urn:cite2:hmt:place.r1:place42">Μεσσηνιακήν</placeName>· ἰστεον δὲ ὅτι ἡ <placeName n="urn:cite2:hmt:place.r1:place36">Πελοπόννησος</placeName> τὸ <choice> <abbr>αρχ</abbr> <expan>αρχαῖον</expan> </choice> <placeName n="urn:cite2:hmt:place.r1:place43">Αιγιάλεια</placeName> ἐκαλειτο απὸ <persName n="urn:cite2:hmt:pers.r1:pers120">Αιγιαλέως</persName> <unclear>τοῦ υἱοῦ</unclear> <persName n="urn:cite2:hmt:pers.r1:pers121">Ἰνάχου</persName> τοῦ ἐν <placeName n="urn:cite2:hmt:place.r1:place44">Ἄργει</placeName> ποταμοῦ καὶ <persName n="urn:cite2:hmt:pers.r1:pers122">Μελείας</persName> τῆς <persName n="urn:cite2:hmt:pers.r1:pers123">Ωκεανοῦ</persName>. ὕστερον δὲ <placeName n="urn:cite2:hmt:place.r1:place36">Απία</placeName> πάλιν ἐκλήθη ἀπὸ <persName n="urn:cite2:hmt:pers.r1:pers124">Ἄπιδος</persName> τοῦ <persName n="urn:cite2:hmt:pers.r1:pers125">Φορωνέως</persName> παιδός. εἰθ ούτως <placeName n="urn:cite2:hmt:place.r1:place44">Ἄργος</placeName> ἀπο <persName n="urn:cite2:hmt:pers.r1:pers126">Άργου</persName> τοῦ πανόπτου· τελευταῖον δὲ πάντων <placeName n="urn:cite2:hmt:place.r1:place36">Πελοπόννος</placeName> ἀπο τοῦ κρατησαι τῆς χώρας τὸν <persName n="urn:cite2:hmt:pers.r1:pers46">Ταντάλου</persName> υἱὸν <persName n="urn:cite2:hmt:pers.r1:pers24">Πελοπα</persName>⁑</p> </div>"""





  val schNode = CitableNode(schUrn,schText)
  "The MutliformNormalizedReader object" should "read through named entities in markup" in {
    val txt = """<l n="1" xmlns="http://www.tei-c.org/ns/1.0" xmlns:tei="http://www.tei-c.org/ns/1.0">Μῆνιν ἄειδε θεὰ <persName n="urn:cite2:hmt:pers.r1:pers1">Πηληϊάδεω Ἀχιλῆος</persName> </l>"""
    val urn = CtsUrn("urn:cts:greekLit:tlg0012.tlg001.msA:1.1")
    val cn = CitableNode(urn, txt)
    val edNorm = EditoriallyNormalizedReader.editedNode(cn)
    val expectedSize = 5
    assert(edNorm.text.split("[ ]+").size == expectedSize)
  }

  it should "include scribal additions" in pending
  it should "omit scribal deletions"in pending

  it should "choose expansions over abbreviations" in pending /* {
    val txt = """<p>δέχθαι ἄποινα ἀπαρέμφατον ἀντὶ <choice> <abbr>προστ</abbr> <expan>προστακτικοῦ</expan> </choice></p>"""
    val cn = CitableNode(schUrn, txt)
    val edNorm = EditoriallyNormalizedReader.editedNode(cn)
    val wordList = edNorm.text.split("[ ]+").toVector
    val expectedSize = 5
    assert(wordList.size == expectedSize)
  }*/

  it should "choose scribal corrections over original text" in pending
  it should "choose scribally offered multiforms over original readings" in pending

}
