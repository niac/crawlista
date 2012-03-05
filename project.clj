(defproject clojurewerkz/crawlista "1.0.0-SNAPSHOT"
  :description "Support library for Clojure applications that crawl the Web"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [clj-http            "0.3.2"]
                 [org.jsoup/jsoup     "1.6.1"]
                 [clojurewerkz/urly   "1.0.0-beta2"]]
  :multi-deps {
               "1.4" [[org.clojure/clojure "1.4.0-beta2"]]
               :all [[clj-http            "0.3.2"]
                     [org.jsoup/jsoup     "1.6.1"]
                     [clojurewerkz/urly   "1.0.0-beta2"]]
               }
  :source-path        "src/clojure"
  :java-source-path   "src/java"
  :resources-path     "src/resources"
  :dev-resources-path "test/resources"
  :warn-on-reflection true)
