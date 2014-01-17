(defproject cascalog-recipes "0.1.0-SNAPSHOT"
	:description "ACE's cascalog recipes - How to handle empty taps"
	:url "https://github.com/andrescorrada/cascalog-recipes/how-to-handle-empty-taps"
	:license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :uberjar-name "cascalog-recipes.jar"
  :aot [how-to-handle-empty-taps.core]
  :main how-to-handle-empty-taps.core
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cascalog "2.0.0"]]
  :profiles {:uberjar {:dependencies [[org.apache.hadoop/hadoop-core "1.1.2"]]}
  	         :dev {:dependencies [[org.apache.hadoop/hadoop-core "1.1.2"]]}})