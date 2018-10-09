package no.nav.pdfgen

import org.apache.pdfbox.io.IOUtils

val testTemplateIncludedFonts: ByteArray = IOUtils.toByteArray(PdfGenITSpek::class.java.getResourceAsStream("/html/test_template_included_fonts.html"))
val testTemplateInvalidFonts: ByteArray = IOUtils.toByteArray(PdfGenITSpek::class.java.getResourceAsStream("/html/test_template_invalid_fonts.html"))