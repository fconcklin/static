(defproject static "1.0.0-SNAPSHOT"
  :description "Simple static site generator."
  :dependencies [[org.clojure/clojure "1.2.0"]
		 [org.clojure/clojure-contrib "1.2.0"]
		 [org.clojars.paraseba/hiccup "0.2.3"]
		 [org.markdownj/markdownj "0.3.0-1.0.2b4"]
		 [org.clojars.amit/commons-io "1.4.0"]
		 [clj-ssh "0.2.0-SNAPSHOT"]
					;		 [hiccup "0.3.4"]
		 [scriptjure "0.1.22"]
		 [ring/ring-core "0.2.5"]
		 [ring/ring-jetty-adapter "0.2.5"]]
  :dev-dependencies [[swank-clojure "1.2.1"]]
  :main static.core)
