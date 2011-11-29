// filebot -script "http://filebot.sourceforge.net/data/shell/mi.groovy" <folder>

/*
 * Print media info for all video files using given or default format pattern
 */
args.getFiles()
.findAll { it.isVideo() }
.sort { a, b -> a.name.compareTo(b.name) }
.each { println getMediaInfo(file:it, format:"{fn} [{resolution} {af} {vc} {ac}]") }
