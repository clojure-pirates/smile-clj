(defproject smile-clj-dev "0.1.0-SNAPSHOT"
  :description "Clojure wrapper for SMILE Machine Learning kit"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]


;;smile libraries
[com.github.haifengl/smile-core "1.5.1"]

[com.github.haifengl/smile-plot "1.5.1"]

[com.github.haifengl/smile-netlib "1.5.1"]


                 ;; Spirit from zcaudate
;                 [zcaudate/spirit.data.atom "0.8.0"]
;                 [zcaudate/spirit.data.cache "0.8.0"]
;                 [zcaudate/spirit.data.exchange "0.8.0"]
;                 [zcaudate/spirit.data.pipeline "0.8.0"]
;                 [zcaudate/spirit.data.schema "0.8.0"]
;                 [zcaudate/spirit.data.table "0.8.0"]
;                 [zcaudate/spirit.datomic "0.8.0"]
; [zcaudate/spirit "0.8.0"]


                 ;; apache spark
;                 [yieldbot/flambo "0.8.2"]

                 ;;GUI

                 [halgari/fn-fx "0.4.0"]
                 [seesaw "1.4.5"]

                 [com.cognitect/transit-clj "0.8.300"]

                 [com.datomic/datomic-free "0.9.5656"]

;                 [com.datomic/client-pro "0.8.14"]


                 [metasoarous/oz "1.2.2"]

                 [zcaudate/hara "2.8.2"]
                 [zcaudate/lucid "1.4.4"]

                 [environ "1.1.0"]



                 [org.onyxplatform/onyx "0.12.7"]

;; For remote data access - haxl
;                 [muse2/muse "0.4.4"]
;                 [com.walmartlabs/lacinia "0.25.0"]

;; This is for traversing the nested clojure data structure
                 [com.rpl/specter "1.0.3"]

;; Utility for traversing CLJ(S) data structures
                 [medley "1.0.0"]

; Quickcheck
                 [org.clojure/test.check "0.10.0-alpha2"]

                 [fullcontact/full.async "1.0.0"]
                 [org.clojure/core.async "0.4.474"]

 ;[co.paralleluniverse/pulsar "0.7.7-SNAPSHOT"]
 ; https://github.com/tonsky/datascript

                 [org.clojure/core.match "0.3.0-alpha5"]

;; Documentation using marginalia
                 [lein-marginalia "0.9.0"]

;; Boot documenataion tool Codox
                 [lein-codox "0.10.3"]

;; Shell library
                 [me.raynes/conch "0.8.0"]

                 [org.clojars.turbopape/milestones "1.0.1"]
;; JSON
                 [cheshire "5.8.0"]

;; PostgreSQL
                 [honeysql "0.9.1"]
                 [nilenso/honeysql-postgres "0.2.3"]

; [org.clojure/core.typed "0.4.3"]
                 ]
  :main ^:skip-aot smile-clj-dev.core
  :target-path "target/%s"
  :profiles {

;             :provided
;              {:dependencies
;               [[org.apache.spark/spark-core_2.11 "2.2.0"]]}

             :uberjar
              {:aot :all}})
