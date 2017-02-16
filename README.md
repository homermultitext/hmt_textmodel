# HMT text model

Editions of the HMT project follow the OHCO2 model for citable texts.

This library supports working with the text contents of citable nodes as a sequence of tokens with specified properties.

The initial focus of the library is instantiating this model from TEI-conformant XML following HMT guidelines, and generating a variety of analytical exemplars from the resulting analyses.

## Status

 The library is in development. The current test suite defines approximately 50 tests that specify its basic functionality.  To see which specifiying tests have been successfully implemented and passed, run `sbt test`.

 All tests for correct usage work on examples taken from the HMT archive.  Tests for handling errors are based on errors that have been encountered in editing HMT texts, but for obvious reasons have been corrected in the HMT archive.

## Building

 Requires scala 2.11 or higher.  Binaries compiled with Scala 2.11 and 2.12 are available from bintray.

## Examples of usage

See [these examples](examples.md).
