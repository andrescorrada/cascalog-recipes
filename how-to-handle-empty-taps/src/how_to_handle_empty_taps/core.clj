(ns how-to-handle-empty-taps.core
	(:use [cascalog.api]
	      [cascalog.more-taps :only (hfs-delimited)])
	(:gen-class))

(defn make-tap-from-non-existent-lfs-file
	"What happens when we create an lfs-tap with a non-existent file?"
	[non-existent-file]
	(let [tap (lfs-textline non-existent-file)]
		(println "An lfs-textline tap can be created from a non-existent file!")))

(defn make-tap-from-directory-with-empty-files
	"What happens when we create a directory tap with empty source files?"
	[dir]
	(let [tap (lfs-textline dir :source-pattern "/part-*")]
		(do
			(println "We can also make taps with directories that have empty source files.")
			(println "And the class of the tap is not nil:" (class tap)))))

(defn print-tap-contents
	"What errors do we get when we try the taps?"
	[tap]
	(?<- (stdout) [?line] (tap ?line)))

(defn -main 
	"What happens when different error conditions arise?"
	[non-existent-file directory-with-empty-files]
	(do
		(make-tap-from-non-existent-lfs-file non-existent-file)
		(make-tap-from-directory-with-empty-files directory-with-empty-files)
		(let [bad-tap (make-tap-from-directory-with-empty-files directory-with-empty-files)]
			(print-tap-contents bad-tap))))