(defproject ecstatic "0.1.0-SNAPSHOT"
  :description "A static site generator"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [hiccup "1.0.2"]
                 [fs "1.3.3"]
                 [clj-time "0.4.4"]
                 [slugger "1.0.1"]
                 [clj-rss "0.1.2"]
                 [uochan/watchtower "0.1.4"]
                 [org.clojure/tools.cli "0.2.2"]
                 [ring/ring-core "1.0.3"]
                 [ring/ring-jetty-adapter "1.0.3"]
                 [me.raynes/cegdown "0.1.0"]]
  :main ecstatic.core)
