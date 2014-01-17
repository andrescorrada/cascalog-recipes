(ns how-to-handle-empty-taps.core
	(:use [cascalog.api]
	      [cascalog.more-taps :only (hfs-delimited)])
	(:gen-class))

(defn make-tap-from-non-existent-lfs-file
	"What happens when we create an lfs-tap with a non-existent file?"
	[non-existent-file]
	(let [tap (lfs-textline non-existent-file)]
		(println "An lfs-textline tap can be created from a non-existent file!")))

(defn -main 
	"What happens when different error conditions arise?"
	[non-existent-file]
	(make-tap-from-non-existent-lfs-file non-existent-file))